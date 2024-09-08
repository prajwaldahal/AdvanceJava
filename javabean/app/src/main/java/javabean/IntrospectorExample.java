cdimport java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.MethodDescriptor;

public class IntrospectorExample {
    public static void main(String[] args) {
        try {
            // Get the BeanInfo for the PersonBean class
            BeanInfo beanInfo = Introspector.getBeanInfo(PersonBean.class);

            // Get and display property descriptors
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            System.out.println("Properties:");
            for (PropertyDescriptor descriptor : propertyDescriptors) {
                System.out.println("Name: " + descriptor.getName());
                System.out.println("Type: " + descriptor.getPropertyType().getName());
                System.out.println("Read Method: " + descriptor.getReadMethod().getName());
                System.out.println("Write Method: " + descriptor.getWriteMethod().getName());
                System.out.println();
            }

            // Get and display method descriptors
            MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();
            System.out.println("Methods:");
            for (MethodDescriptor descriptor : methodDescriptors) {
                System.out.println("Name: " + descriptor.getName());
                System.out.println("Method: " + descriptor.getMethod().getName());
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class PersonBean {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name + " and I'm " + age + " years old.");
    }
}
