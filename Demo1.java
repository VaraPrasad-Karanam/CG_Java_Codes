
import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int productID = sc.nextInt();
       String productName = sc.next();
       int productQuantity = sc.nextInt();
       int productDiscount = sc.nextInt();
       boolean productavailable = sc.nextBoolean();
       double productPrice = sc.nextDouble();
       int productCode = sc.nextInt();
       char productCompanycode = sc.next().charAt(0);
       float productRating = sc.nextFloat();
       sc.nextLine();
       String productDescription = sc.nextLine();
       double total = productPrice - (productPrice*productDiscount/100.0);
       System.out.println(productID);
       System.out.println(productName);
       System.out.println(productQuantity);
       System.out.println(productDiscount);
       System.out.println(productavailable);
       System.out.println(productPrice);
       System.out.println(productCode);
       System.out.println(productCompanycode);
       System.out.println(productRating);
       System.out.println(productDescription);
       System.out.println(total);


    }
}
