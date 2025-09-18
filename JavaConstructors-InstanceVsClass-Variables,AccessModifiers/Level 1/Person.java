public class Person {
    private String name;
    private int age;
    private String city;

    // Parameterized constructor
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.city = other.city;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Aman", 21, "Delhi");
        Person p2 = new Person(p1); // copy
        p1.display();
        p2.display();
    }
}
