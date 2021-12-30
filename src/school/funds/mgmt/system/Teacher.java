package school.funds.mgmt.system;

import java.util.Objects;

public class Teacher {
    private int id;
    private String name;
    private int salary;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    /**
     * We set salary to new Salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * adds to the salaries
     * removes to total money earned from school and
     *add total money spent
     * @param Salary
     */
    public void receiveSalary(int salary){
        School.updateTotalMoneySpent(salary);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id &&
                salary == teacher.salary &&
                Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }
}
