package OOP;

public class Patient {
    int id;
    String name;
    String disease;
    double amount;

    Patient(int id){
        this.id = id;
        System.out.println("Patient registration started");
    }
    Patient(int id,String name){
        this(id);
        this.name = name;
    }
    Patient(int id,String name,String disease){
        this(id,name);
        this.disease = disease;
    }
    Patient(int id,String name,String disease,double amount){
        this(id,name,disease);
        this.amount = amount;
    }
    public void display(){
        System.out.println(id+" "+ name+" "+disease+" "+ amount);
    }
    public static void main(String[] args) {
        Patient p1 = new Patient(101,"Rahul","Fever",2500);
        p1.display();
    }
}
