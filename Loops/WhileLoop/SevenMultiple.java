package Loops.WhileLoop;

import java.util.Scanner;
public class SevenMultiple {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int i=1;
        while(num>0){
            if(i%7==0){
                System.out.println(i);
            }
            i++;
            num--;
        }
    }
}
