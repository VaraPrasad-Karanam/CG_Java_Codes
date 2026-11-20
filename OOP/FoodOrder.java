package OOP;

public class FoodOrder {
    int id;
    String name;
    String foodItem;
    String address;

    FoodOrder(int id){
        this.id = id;
    }
    FoodOrder(int id,String name){
        this(id);
        this.name= name;
    }
    FoodOrder(int id,String name,String foodItem){
        this(id,name);
        this.foodItem= foodItem;
    }
    FoodOrder(int id,String name,String foodItem,String address){
        this(id,name,foodItem);
        this.address = address;
    }
    public void display(){
        System.out.println(id+" "+name+" "+foodItem+" "+address);
    }
    public static void main(String[] args) {
        FoodOrder f1 = new FoodOrder(101, "udipi");
        f1.display();
    }
}
