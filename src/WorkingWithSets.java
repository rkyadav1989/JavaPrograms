import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("blue");
        colors.add("blue"); //here we try to add blue color twice but it will be added only once because set can have unique elements
        colors.add("red");
        colors.add("green");
        System.out.println(colors.size());
        colors.forEach(System.out::println);
        colors.remove("green");
        System.out.println("----------");
        System.out.println(colors.size());
        colors.forEach(System.out::println);
    }
}
