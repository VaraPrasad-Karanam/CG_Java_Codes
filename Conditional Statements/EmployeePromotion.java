import java.util.Scanner;
public class EmployeePromotion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Experience = sc.nextInt();
        double Rating = sc.nextDouble();
        if(Experience >= 5){
            if(Rating >= 4.5){
                System.out.println("You are eligible for promotion.");
            } else {
                System.out.println("You are not eligible for promotion due to rating.");
            }
        } else {
            System.out.println("You are not eligible for promotion due to experience.");
        }
    }
}
