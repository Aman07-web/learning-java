package Abstraction;
abstract class Animal{
     abstract void sound();
     void sleep(){
        System.out.println("Animal sleep");
     }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Barks");
    }
}
public class Demo {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.sleep();
        d1.sound();
    }
}
