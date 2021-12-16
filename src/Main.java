import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 to 10 ");

        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        if (inputNum < 10 ) {
            System.out.println("you are lucky");
        }
        else {
            System.out.println("you are unlucky");
        }

        //While loop
        boolean isOnRepeat = true;

        while (isOnRepeat){
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes");
            String userInput = scanner.next();

            if (userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }

        //challenge
        String question = "What is the capital of India?" ;
        String choiceOne = "    a: Mumbai";
        String choiceTwo = "    b: New Delhi";
        String choiceThree = "    c: Goa";

        String correctOption = "b";
        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);
        System.out.println("Please enter right option a, b or c.");
        String userOption = scanner.next();

        if (userOption.equals(correctOption)) {
            System.out.println("Congratulations, your answer is correct.");
        }
        else {
            System.out.println("Sorry, your answer is incorrect. The right answer is option b (New Delhi)");
        }


    }
}
