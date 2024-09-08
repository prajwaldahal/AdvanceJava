public class MyApplication{
    public static void main(String[] args) {
        
        Person person = new Person();
        
        person.setName("Ram");
        person.setAge(30);
        person.setAddress("kathmandu");
        
        String name = person.getName();
        int age = person.getAge();
        String address = person.getAddress();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        
        person.setName("krishna");
        person.setAge(34);
        person.setAddress("bhaktapur");
        
        name = person.getName();
        age = person.getAge();
        address = person.getAddress();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
