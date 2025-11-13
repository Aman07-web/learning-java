package Encapsulation;
class Student{
  private String name;
    private int age;
    public void setValue(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public String getValue(){
        return name;
    }

}
public class Demo {
    public static void main(String[] args) {
         Student s1=new Student();
        s1.setValue("Aman");
        s1.setAge(21);
        System.out.print(s1.getValue()+" ");
        System.out.print(s1.getAge());
    }
}
