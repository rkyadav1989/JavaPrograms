import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {

        //Queue<Person> supermarket = new LinkedList<>();
        //supermarket.add(new Person("Alex", 21));
        Queue<String> supermarket = new LinkedList<>();
        supermarket.add("Alex");
        supermarket.add("Garry");
        supermarket.add("Sonu");

        System.out.println(supermarket);
        System.out.println(supermarket.peek()); //start of queue
        System.out.println(supermarket.size());
        System.out.println(supermarket.poll()); //removes from queue
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());


    }

    /**
     * We wanted to expirement record class of java 14 but it has not compatible with intellij 2019; so we will do experiment with String
     */

    //static record Person(String name, int age) {}


}
