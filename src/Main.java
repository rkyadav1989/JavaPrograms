public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10,8,10,8,5);
        Triangle t2 = new Triangle(10,9,10,12,15);

        double areaT1 = t1.findArea();
        double areaT2 = t2.findArea();

        System.out.println("area of first Triangle is " + areaT1);
        System.out.println("area of second Triangle is " + areaT2);
    }
}