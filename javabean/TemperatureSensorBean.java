import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class TemperatureSensorBean {
    private int temperature;
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        int oldTemperature = this.temperature;
        this.temperature = temperature;

        // Notify listeners before the property changes
        PropertyChangeEvent event = new PropertyChangeEvent(this, "temperature", oldTemperature, temperature);
        propertyChangeSupport.firePropertyChange(event);

        // Check if the new temperature violates a constraint
        if (temperature > 100) {
            // Notify listeners that the change is vetoed
            propertyChangeSupport.fireVetoableChange(event);
            // Revert to the old temperature value
            this.temperature = oldTemperature;
        }
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    public void addVetoableChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addVetoableChangeListener(listener);
    }

    public void removeVetoableChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removeVetoableChangeListener(listener);
    }
}
