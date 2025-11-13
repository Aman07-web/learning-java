package Encapsulation;
class Person{
    private int age;
    private String name;

    public void setAge(int age){
        if(age >= 0 && age <= 100){
            this.age=age;
        }
        else{
            System.out.println("invalid age");
        }
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

}
public class Validation {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setAge(24);
        p1.setName("MAHAK");
        System.out.println(p1.getAge());
         System.out.println(p1.getName());

    }
}
