import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");

        /** we can add any data type to list if not specified
         * 1. List colors
         * it can hold any data type
         *         colors.add(1);
         *         colors.add(new Object());
         * 2. List<String>
         * it can only hold strings
         */

        System.out.println(colors);
        System.out.println(colors.contains("yellow"));
    }
}
