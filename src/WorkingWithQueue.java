import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {

        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));



    }

    //static Person(String name, int age) {}
    record Person(String name, int age) {}

}
