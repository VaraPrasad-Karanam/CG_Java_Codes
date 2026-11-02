package Loops.ForLoop;

public class Digits {
    public static void main(String[] args) {
        int n = 12345;
        int count = 0;
        for(int i=n; i>0; i=i/10){
            count++;
        }
        System.out.println("Number of digits in " + n + " is: " + count);
    }
}
