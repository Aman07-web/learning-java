package Practice_sheet;

import java.util.Random;

public class Pin {
    public static String generationPin(){
        Random rnd=new Random();
        int number=rnd.nextInt(10000);
        return String.format("%04sd%", number);
    }
    public static void main(String[] args) {
        System.out.println("PIN : "+generationPin());
    }
}
