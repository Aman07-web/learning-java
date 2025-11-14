package Abstraction;
class Box<T> {      // T stands for Type
    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class Gen_example {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.set(100);
        System.out.println(b1.get());

        Box<String> b2 = new Box<>();
        b2.set("Hello");
        System.out.println(b2.get());
    }
}

