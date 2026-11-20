package OOP;

public class StudentDetails {
    int id;
    String name;
    String course;
    static{
        System.out.println("Student Management System Started");
    }
    {
        System.out.println("Student Object Created");
    }
    public static void main(String[]args){
        StudentDetails s1 = new StudentDetails();
        StudentDetails s2 = new StudentDetails();
        s1.id = 1;
        s1.name = "Ravi";
        s1.course = "Java";
        System.out.println(s1.id + " "+s1.name+" "+s1.course);
        s2.id = 2;
        s2.name = "Priya";
        s2.course = "Python";
        System.out.println(s2.id+" "+s2.name+" "+s2.course);
    }
}
