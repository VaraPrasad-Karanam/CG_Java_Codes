package OOP;

class Employee {

    int empId;
    String empName;
    double salary;

    static String companyName = "Codegnan";

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }

    public void calculateAnnualSalary() {
        double annualSalary = salary * 12;
        System.out.println("Annual Salary: " + annualSalary);
    }

    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Ravi", 30000);
        Employee e2 = new Employee(102, "Priya", 45000);

        Employee.displayCompanyName();

        System.out.println("Employee 1 Details");
        e1.displayEmployeeDetails();
        e1.calculateAnnualSalary();

        System.out.println("Employee 2 Details");
        e2.displayEmployeeDetails();
        e2.calculateAnnualSalary();
    }
}