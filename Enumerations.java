import java.util.Stack;
import java.util.Enumeration;

class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Enumerations {
    public static void main(String[] args) {
        // Create an Object for Stack
        Stack<Person> personStack = new Stack<>();

        // Load Person objects into the Stack
        personStack.push(new Person("sanky", 22));
        personStack.push(new Person("sri", 22));
        personStack.push(new Person("syam", 22));

        // Get Enumeration for the Stack
        Enumeration<Person> enumeration = personStack.elements();

        // Iterate over the Stack using Enumeration and print the values
        while (enumeration.hasMoreElements()) {
            Person person = enumeration.nextElement();
            person.display();
        }
    }
}
