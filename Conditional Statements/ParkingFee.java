import java.util.Scanner;
public class ParkingFee {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int totalFee = 0;
        if(hours <= 2){
            totalFee = hours*30;
        } else if(hours <= 5){
            totalFee = (hours-2)*20 + 2*30;
        } else {
            totalFee = (hours-5)*10 + 3*20 + 2*30;
        }
        System.out.println("Total parking fee is: " + totalFee);
    }
}
