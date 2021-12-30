package school.funds.mgmt.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher thejus = new Teacher(1,"Thejus", 5000);
        Teacher vaughn = new Teacher(2, "Vaughn", 7000);
        Teacher rob = new Teacher(3,"Rob",6000);
        Teacher abdessamie  = new Teacher(3,"Rob",6000);; // new locion in memory

        Teacher sohail = rob; // the same location in memory (the same object)

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(thejus);
        teacherList.add(vaughn);
        teacherList.add(rob);


        Student rakesh = new Student(1,"Rakesh Yadav", 5);
        Student priyanka = new Student(2,"Priyanka Kumari", 12);
        Student vivek =new Student(3,"Vivek Kumar", 2);
        Student roshini = new Student(4,"Roshini Bansal", 12);

        List<Student> studentList = new ArrayList<>();
        studentList.add(rakesh);
        studentList.add(priyanka);
        studentList.add(vivek);
        studentList.add(roshini);


        School hindalcoIC = new School(teacherList,studentList);

        System.out.println("Hindalco Intermediate college has earned $ " + hindalcoIC.getTotalMoneyEarned());

        //System.out.println(thejus.getSalary());
        rakesh.payFees(5000);

        System.out.println("Hindalco Intermediate college has earned $ " + hindalcoIC.getTotalMoneyEarned());

        priyanka.payFees(26000);
        System.out.println("Hindalco Intermediate college has earned $ " + hindalcoIC.getTotalMoneyEarned());

        System.out.println("-------------Making School Pay Salary--------------");
        thejus.receiveSalary(thejus.getSalary());
        System.out.println("Hindalco IC has spent $"+ thejus.getSalary() + " for salary to " + thejus.getName() + " " +
                "and now school has $" + hindalcoIC.getTotalMoneyEarned() +". School spent $" + hindalcoIC.getTotalMoneySpent() + " for salaries.");

        vaughn.receiveSalary(vaughn.getSalary());
        System.out.println("Hindalco IC has spent $"+ vaughn.getSalary() + " for salary to " + vaughn.getName() + " " +
                "and now school has $" + hindalcoIC.getTotalMoneyEarned() +". School spent $" + hindalcoIC.getTotalMoneySpent() + " for salaries.");
    }
}
