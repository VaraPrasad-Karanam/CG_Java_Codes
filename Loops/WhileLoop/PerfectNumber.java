package Loops.WhileLoop;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(i<num){
            if(num%i ==0){
                sum += i;
            }
            i++;
        }
        if(sum == num){
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
