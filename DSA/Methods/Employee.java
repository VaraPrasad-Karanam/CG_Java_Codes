package DSA.Methods;

public class Employee {

    public void display(int empid, String empname){
        System.out.println("employee id : "+ empid);
        System.out.println("employee name :" + empname);
    }
    public double displayAnnualSalary(int salary){
        return salary*12;
    }
    public static void main(String[] args) {
        Employee  e = new Employee();
        e.display(101, "Keerthi");
        e.displayAnnualSalary(25000);
    }
}
