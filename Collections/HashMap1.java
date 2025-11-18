package Collections;
import java.util.*;;
public class HashMap1 {
    public static void main(String[] args) {
        // Map <Integer, Character> map=new HashMap<>();
        // map.put(1, 'A');
        // map.put(2, 'M');
        // map.put(3, 'A');
        //  map.put(4, 'N');
        //  for (Integer i : map.keySet()) {
        //     System.out.println(i+"->"+map.get(i));
        //  }
         String str ="banana";
         Map <Character,Integer>map=new HashMap<>();
         for(char c:str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
         }
        System.out.println(map);
        // System.out.println(map.containsValue('A'));
        // System.out.println(map.containsKey(5));
    }
}
