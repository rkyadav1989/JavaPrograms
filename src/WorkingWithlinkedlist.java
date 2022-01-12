import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithlinkedlist {
    public static void main(String[] args) {

        LinkedList<String> name = new LinkedList<>();
        name.add("Rakesh");
        name.add("Brij");
        name.add("mohan");

        ListIterator<String> nameIterator = name.listIterator();
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }
        System.out.println("--------------");
        while (nameIterator.hasPrevious()) {
            System.out.println(nameIterator.previous());
        }

    }
}
