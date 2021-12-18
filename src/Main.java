public class Main {

    /* Input requirements
    1) Class Student Profile should contain at-least below:
        - First Name
        - Last Name
        - Expected Year to Graduate
        - GPA
        - Declared Major

     2) Student Profile class should have at-lest one behavior/method
        - function that increment expected year of graduation by one

     3) Student Profile class should have constructor that initializes all the attributes with dynamic values, meaning the values of constructor is called with
     will determine the values of the attributes.

     4) we should create two instance of Student Profile.

     5) Our program should call incrementExpectedGraduationYear on one of the studentProfile and print out expected year of graduation to console.
     */
    public static void main(String[] args) {
        StudentProfile ST1 = new StudentProfile("Rakesh", "Yadav", "CSE", 2021, 4.0);
        StudentProfile ST2 = new StudentProfile("Priyanka", "Kumari", "CMA", 2014, 2.0);

        ST2.incrementExpectedGraduationYear();
        System.out.println("Hi " + ST2.firstName +" your expected year of graduation is " + ST2.expectedYearToGraduate);
    }
}
