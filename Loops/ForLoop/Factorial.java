package Loops.ForLoop;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt(); 
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println("The factorial of " + n + " is: " + factorial);
    }
}
