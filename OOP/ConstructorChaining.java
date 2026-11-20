package OOP;

public class ConstructorChaining {
    int id;
    String name;
    double price;
    ConstructorChaining(){
        this(102,"Mobile",30000);
        System.out.println("Default Constructor");
    }
    ConstructorChaining(int id,String name,double price){
        this(103,"charger");
        System.out.println("three parameterized constructor");
    }
    ConstructorChaining(int id,String name){
        System.out.println("two parameterized constructor");
    }
    public void display(){
        System.out.println(id+" "+name+" "+price);
    }
    public static void main(String[] args) {
        ConstructorChaining c = new ConstructorChaining();
        c.display();
    }
}
