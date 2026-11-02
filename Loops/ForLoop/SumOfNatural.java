package Loops.ForLoop;
import java.util.Scanner;
public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt(); 
        int sum = 0;

        for (int i = n; i >= 1; i--) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
