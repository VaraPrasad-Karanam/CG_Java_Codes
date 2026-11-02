import java.util.Scanner;
public class Admission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        int rank = sc.nextInt();
        if(marks >=60 ){
            if(rank <= 1000){
                System.out.println("You are eligible for admission.");
            } else {
                System.out.println("You are not eligible for admission due to rank.");
            }
        } else {
            System.out.println("You are not eligible for admission due to marks.");
        }
    }
}
