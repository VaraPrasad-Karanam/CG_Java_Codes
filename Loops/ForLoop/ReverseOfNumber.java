package Loops.ForLoop;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int n = 123; 
        int rev = 0;
        for(int i = n; i > 0; i /= 10) {
            int digit = n % 10; 
            rev = rev * 10 + digit; 
            n /= 10; 
        }
        System.out.println("The reversed number is: " + rev);
    }
}
