
import java.sql.Date;

// Базовое задние:
// 1) Переписать код в соответствии с Single Responsibility Principle:
// Подсказка: вынесите метод calculateNetSalary() в отдельный класс
public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
    public int getBaseSalary() {
        return baseSalary;
    }
}

class Salary {
    public int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25);// calculate in otherway
        return baseSalary - tax;
    }
}

class App {
    public static void main(String[] args) {
        Employee employe = new Employee("Human", new Date(0), 10000);
        System.out.println(employe.getEmpInfo());

        Salary employeeSalary = new Salary();
        int result = employeeSalary.calculateNetSalary(employe.getBaseSalary());

        System.out.println(result);
    }
}