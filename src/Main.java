import java.util.Scanner;

public class Main {

    //input1 : number of hours the employee work per week
    //input2 : amount of money the employee makes per hour
    //output : employees's gross yearly salary.
    //Bonus  : add an input that accounts for vacation days
    //One vacation day = 8 hours of work

    public static double salaryCalculator (double hoursPerWeek, double amountPerHour, double vacationDays) {
        return 100;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner();

        System.out.println("Please enter hours completed by employee per week");
        double hoursPerWeek = input.nextDouble();
        while (hoursPerWeek <= 0) {
            System.out.println("Please enter valid entry for hours completed by employee per week");
            hoursPerWeek = input.nextDouble();
        }

        System.out.println("Please enter hourly billing rate of employee");
        double amountPerHour = input.nextDouble();
        while (hoursPerWeek <= 0) {
            System.out.println("Please enter valid hourly billing rate of employee");
            amountPerHour = input.nextDouble();
        }

        System.out.println("Please enter vacation days for employee");
        double vacationDays = input.nextDouble();
        while (hoursPerWeek < 0) {
            System.out.println("Please enter valid hourly vacation days for employee");
            vacationDays = input.nextDouble();
        }

        double salary = salaryCalculator(hoursPerWeek, amountPerHour, vacationDays);
        System.out.println("Employee's gross anual salary is: " + salary);
    }
}
