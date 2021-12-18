public class StudentProfile {

    String firstName;
    String lastName;
    String declaredMajor;
    int expectedYearToGraduate;
    double GPA;

    public StudentProfile(String firstName, String lastName, String declaredMajor, int expectedYearToGraduate, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.declaredMajor = declaredMajor;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.GPA = GPA;
    }

    public void incrementExpectedGraduationYear() {
        if (GPA < 3) {
            expectedYearToGraduate = expectedYearToGraduate + 1;
        }
    }

}
