package Abstraction;

 interface vehicle {
  void start();
}
class Bike implements vehicle{
    public void start(){
        System.out.println("bike starts");
    }
}
public class interface_demo {
    public static void main(String[] args) {
        Bike b1=new Bike();
        b1.start();
    }
}
