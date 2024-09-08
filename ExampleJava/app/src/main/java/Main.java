
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

public class Main {
    public static void main(String[] args) {
        PersonBean person = new PersonBean();

        // Add a property change listener for the name property
        person.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Name changed from " + evt.getOldValue() + " to " + evt.getNewValue());
            }
        });

        // Add a vetoable change listener for the age property
        person.addVetoableChangeListener(new VetoableChangeListener() {
            @Override
            public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
                int newAge = (int) evt.getNewValue();
                if (newAge < 0 || newAge > 120) {
                    throw new PropertyVetoException("Invalid age value", evt);
                }
            }
        });

        try {
            person.setName("Alice");
            person.setAge(30);
            person.setName("Bob"); // This change is allowed
            person.setAge(150);   // This change is vetoed
        } catch (PropertyVetoException e) {
            System.out.println("Vetoed age change: " + e.getMessage());
        }
    }
}
