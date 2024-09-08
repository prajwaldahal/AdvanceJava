import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;
import java.io.Serializable;

public class PersonBean implements Serializable {
    private String name;
    private int age;

    // Support for bound properties
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    // Support for constrained properties
    private VetoableChangeSupport vetoableChangeSupport = new VetoableChangeSupport(this);

    public PersonBean() {
        // Default constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        
        // Notify listeners of the property change
        propertyChangeSupport.firePropertyChange("name", oldName, name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws PropertyVetoException {
        int oldAge = this.age;

        // Use a vetoable change listener to potentially veto the age change
        vetoableChangeSupport.fireVetoableChange("age", oldAge, age);

        // If the change is not vetoed, update the age
        this.age = age;

        // Notify listeners of the property change
        propertyChangeSupport.firePropertyChange("age", oldAge, age);
    }

    // Add listeners for bound properties
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    // Add listeners for constrained (vetoable) properties

    public void removeVetoableChangeListener(VetoableChangeListener listener) {
        vetoableChangeSupport.removeVetoableChangeListener(listener);
    }

    public void addVetoableChangeListener(VetoableChangeListener vetoableChangeListener) {
         vetoableChangeSupport.addVetoableChangeListener(vetoableChangeListener);
    }
  }
