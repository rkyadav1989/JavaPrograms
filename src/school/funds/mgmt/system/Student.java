package school.funds.mgmt.system;

/**
 * This class is responsible for keeping the track of Student.
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student (int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        feesPaid = 0;
        feesTotal = 30000;
    }

    //We will not alter Student's Name & id

    /**
     * It is used to update student's grade
     * @param grade new grade of the stident
     */
    public void setGrade (int grade) {
        this.grade = grade;
    }

    //It will update the fees paid by student
    public void payFees (int fees){
        feesPaid = feesPaid + fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    /**
     * press alt+insert for inserting getter/setter/constructor
     * @return
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
}
