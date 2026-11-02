package Loops.ForLoop;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = sc.nextInt();
      int temp = num;
      int sum = 0;
      int digits = 0;
      for(int i =num; i>0; i/=10){
        digits++;
      }
      for(int i=num;i>0;i/=10){
        int rem = i%10;
        sum = sum + (int)Math.pow(rem,digits);
      }
      if(sum == temp){
        System.out.println("Armstrong number");
      } else {
        System.out.println("Not an Armstrong number");
      }
    }
}
