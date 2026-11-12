package DSA.Methods;

public class Restaurant {
    public static void displayRestaurantDetails(){
        System.out.println("Happy nest");
    }
    public static double foodBill(int quantity, double price){
        double amount = quantity*price;
        return amount;
    }
    public static double gst(double amount, int gst){
        double total = (amount*gst/100);
        return total;
    }
    public static void main(String[]args){
        displayRestaurantDetails();
        double b = foodBill(2,3000);
        double a = gst(b,5);
        System.out.println(a);
    }
}
