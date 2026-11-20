package OOP;

public class Mobile {
    static String brand = "Samsung";
    String model;
    int price;
    String colour;
    static{
        System.out.println("Mobile Store Opened");
    }
    {
        System.out.println("Mobile Object Created");
    }
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        System.out.println("Brand:"+ brand);
        m1.model = "Galaxy A55";
        m1.price = 35000;
        m1.colour = "Black";
        System.out.println(m1.model+" "+m1.price+" "+m1.colour);
        m2.model = "Galaxy S24";
        m2.price = 75000;
        m2.colour = "Blue";
        System.out.println(m2.model+" "+m2.price+" "+m2.colour);
    }
}
