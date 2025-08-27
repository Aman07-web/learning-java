class Car{
    String brand;
    String model;

    Car(){
        this.brand="unknown";
        this.brand="unknown";
    }
    Car(String brand, String model){
       this.brand=brand;
       this.model=model;
    }
    void displayDetails(){
        System.out.println("Brand :"+brand);
        System.out.println("Model :"+model);
    }
}
public class Task2 {
    public static void main(String[] args) {
        Car sc=new Car("Toyata","Fortuner");
        sc.displayDetails();
        
    }
    
}
