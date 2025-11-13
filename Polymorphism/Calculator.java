package Polymorphism;
class Sum{
    public int add(int a, int b){
       return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
}
public class Calculator {
    public static void main(String[] args) {
        Sum s1=new Sum();
        int sum1=s1.add(3, 04);
        System.out.println(sum1);

    }
}
