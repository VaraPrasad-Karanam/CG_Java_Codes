package RockPaperScissors;
import java.util.*;
public class RPSApplication {
    public static void main(String[] args) {
        String arr[] = {"r","s","p"};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter user choice 0 to 2");
        int us = sc.nextInt();
        while(us<0 || us>=3){
            System.out.println("Invalid choice");
            System.out.println("plz enter valid choice");
            us = sc.nextInt();
        }
        String uc = arr[us];
        System.out.println("user choice :"+ uc);

        Random r = new Random();
        int cs = r.nextInt(3);
        //int a = r.nextInt(b) + a ---> which is for range a to b;
        System.out.println("computer choice :"+arr[cs]);

        if(uc.equals("r")  && arr[cs].equals("s") || uc.equals("s") && arr[cs].equals("p") || uc.equals("p") && arr[cs].equals("r")){
            System.out.println("User wins");
            
        }else if(uc.equals(arr[cs])){
            System.out.println("Tie");
        }else{
            System.out.println("Computer wins");
        }
    }
}
