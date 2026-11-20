package OOP;
import java.util.*;
public class StudentResult {
    Scanner sc = new Scanner(System.in);
    int marks[];
    public static void main(String[] args) {
        StudentResult s1 = new StudentResult();
        s1.acceptMarks();
        double total =s1.calculateTotal(s1.marks);
        double avg =s1.calculateAverage( total);
        s1.findGrade(avg);
    }
    public  void acceptMarks(){
        System.out.println("Enter the no of subjects");
        int n= sc.nextInt();
        marks = new int[n];
        System.out.println("Enter marks of 5 subjects:");
        for(int i=0;i<n;i++){
            marks[i]= sc.nextInt();
        }
        
    }
    public  double calculateTotal(int[] marks){
        int sum =0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        System.out.println("Total-->"+sum);
        return sum;
    }
    public  double calculateAverage(double sum){
        double avg = sum/5;
        System.out.println("Average --> "+avg);
        return avg;
    }
    public  void findGrade(double avg){
        double res = avg;
        if(res>=90 && res<=100){
            System.out.println("A+");
        }else if(res>=80 && res<=89){
            System.out.println("A");
        }else if(res>=70 && res<=79){
            System.out.println("B");
        }else if(res>=60 && res<=69){
            System.out.println("C");
        }else{
            System.out.println("Fail");
        }
    }
    

}
