import java.util.HashMap;
import java.util.Map;

public class teste {

    public static void strCount(String strInput){
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();

        char []strToArray = strInput.toCharArray();

        for(char x : strToArray) {
           if(charCount.containsKey(x)) {
               charCount.put(x, charCount.get(x) + 1);
           }
           else {
               charCount.put(x,1);
           }
        }

        for(Map.Entry e : charCount.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    public static void main(String []args) {
        strCount("abc");
    }
}
