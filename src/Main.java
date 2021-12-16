import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time....");
        System.out.println("Please type a random word to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's Developer tea time!!!");
    }
    public static void main(String[] args) {
        //call the function
        announceDeveloperTeaTime();

        System.out.println("we will call our function again");

        announceDeveloperTeaTime();
    }
}
