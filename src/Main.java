public class Main {
    //define function to calculate the cost of meal
    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = tip + tax + listedMealPrice;
        System.out.println("Your total meal price is EUR " + result);
    }

    //define similar function to calculate the cost of meal and RETURN the result
    public static double calculateMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = tip + tax + listedMealPrice;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("");
        calculateTotalMealPrice(100,.2,.1);
        calculateTotalMealPrice(100,.3,.1);

        double mealPrice=calculateMealPrice(100,.2,.1);
        System.out.println("Your returned meal price is EUR " + mealPrice);
    }
}
