package OOP;

public class Employee {
    
    int eId;
    String eName;
    static String deptName;
    //static block
    static{
        deptName = "Java";
        System.out.println("static block is executed");
    }
    //instance block
    {
        System.out.println("instance block is executed");
        System.out.println("employee registration started");
    }
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.eId = 101;
        e1.eName = "ram";
        System.out.println(e1.eId + " " + e1.eName + " " + deptName);
        Employee e2 = new Employee();
        e2.eId = 102;
        e2.eName = "sam";
        System.out.println(e2.eId + " " + e2.eName + " "+ deptName); 
        Employee e3=e2;
        System.out.println(e3.eId + " "+ e3.eName+" "+ deptName);
        e1.eId = 103;
        e3.eName = "rakesh";
        System.out.println(e2.eId + " "+ e2.eName+" "+ deptName);
        System.out.println(e3.eId + " "+ e3.eName+" "+ deptName);


    }
}
