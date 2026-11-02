import java.util.*;
public class Electricity{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        int total = 0;
        if(bill>5000){
            total = bill - (int)(bill*0.1);
        }else{
            total = bill;
        }
        System.out.println(total);
    }
}