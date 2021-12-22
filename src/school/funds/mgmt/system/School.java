package school.funds.mgmt.system;


import java.util.List;

/**
 * school can have multiple teacher, student
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * It returns the list of teacher
     * @return
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     *add teacher to list of teacher (or School)
     * @param teacher
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * return list of student
     * @return
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * add student to school
     * @param student
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     * returns total money earned by school
     * @return
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * update total money earned by school
     * we have made this method static; so that it can accessed in other class without object. check student class
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned = totalMoneyEarned + moneyEarned;
        //this statement can be written as totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return the total money spent
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money spent by school (i.e. salary of teachers)
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent ;
        totalMoneySpent += moneySpent;
    }
}
