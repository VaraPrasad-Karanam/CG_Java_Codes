package OOP;
public class Student {
    int sid;
    String name;
    static String institute = "codegnan";
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
    
        s1.sid = 101;
        s1.name = "sam";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.name);
        System.out.println(institute);
         String institute = "naresh It";
        System.out.println(institute);
        System.out.println(s2.name);
        System.out.println(Student.institute);
        
    }
}
