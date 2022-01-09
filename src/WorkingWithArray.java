import java.util.Arrays;

public class WorkingWithArray {
    public static void main(String[] args) {
        String[] colors = new String[5];
        //Now we have an empty array of size 5

        colors[0] = "Yellow";
        colors[2]  = "Blue";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors);

        /**
         * traverse through array
         */
        for(int i = 0; i < colors.length ; i++) {
            System.out.println(colors[i]);
        }

        /**
         * This is java for-each loop or enhanced for loop
         */
        for(String color : colors) {
            System.out.println(color);
        }

        /**
         * this is stream
         */
        Arrays.stream(colors).forEach(System.out::println);
    }
}
