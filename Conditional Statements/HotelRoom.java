import java.util.*;
public class HotelRoom {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String roomType = sc.next();
        int days = sc.nextInt();
        double price = 0;
        if(roomType.equals("Standard")){
            price = 100 * days;
        }
        else if(roomType.equals("Deluxe")){
            price = 150 * days;
        }
        else if(roomType.equals("Suite")){
            price = 200 * days;
        }
        System.out.println("Total price for " + days +  roomType + " room is: " + price);
    }
}
