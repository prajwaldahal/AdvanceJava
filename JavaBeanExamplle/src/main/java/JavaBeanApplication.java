import java.beans.*;
import java.lang.reflect.InvocationTargetException;

public class JavaBeanApplication {
    public static class Person {
        private String name;
        private int age;

        public Person() {
        }

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

    public static void main(String[] args) {
        try {
            // Create an instance of the Person class
            Person person = new Person();

            // Set the property values using introspection
            BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                if (propertyDescriptor.getName().equals("name")) {
                    propertyDescriptor.getWriteMethod().invoke(person, "John Doe");
                } else if (propertyDescriptor.getName().equals("age")) {
                    propertyDescriptor.getWriteMethod().invoke(person, 25);
                }
            }

            // Get the property values using introspection
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                if (propertyDescriptor.getName().equals("name")) {
                    Object nameValue = propertyDescriptor.getReadMethod().invoke(person);
                    System.out.println("Name: " + nameValue);
                } else if (propertyDescriptor.getName().equals("age")) {
                    Object ageValue = propertyDescriptor.getReadMethod().invoke(person);
                    System.out.println("Age: " + ageValue);
                }
            }

            // Invoke a method using introspection
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                if (propertyDescriptor.getName().equals("sayHello")) {
                    propertyDescriptor.getReadMethod().invoke(person);
                }
            }

        } catch (IntrospectionException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
