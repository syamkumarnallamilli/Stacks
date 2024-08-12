import java.util.Stack;
import java.util.ListIterator;

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

public class Dynamic {
    public static void main(String[] args) {
        // Create an Object for Stack
        Stack<Person> personStack = new Stack<>();

        // Load Person objects into the Stack using push function
        personStack.push(new Person("sanky", 30));
        personStack.push(new Person("syam", 25));
        personStack.push(new Person("sri", 35));

        // Iterate over the Stack using ListIterator
        ListIterator<Person> listIterator = personStack.listIterator();

        // Iterate and print the values using while loop
        while (listIterator.hasNext()) {
            // Get the next Person object
            Person person = listIterator.next();
            // Print Person details
            person.display();
        }
    }
}