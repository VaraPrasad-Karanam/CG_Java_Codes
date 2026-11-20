package OOP;

public class CopyConstructor {
    int id;
    String name;
    int price;

    public CopyConstructor(int id, String name,int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public CopyConstructor(CopyConstructor s){
        this.id = s.id;
        this.name = s.name;
        this.price = s.price;
    }
    public void display(){
        System.out.println(id+" "+name+" "+price);
    }
    public static void main(String[] args) {
        CopyConstructor s1 = new CopyConstructor(101,"bajaj",50000);
        CopyConstructor s2 = new CopyConstructor(s1);
        s1.display();
        s2.display();
    }

}
