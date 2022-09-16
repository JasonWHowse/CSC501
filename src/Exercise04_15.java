import java.util.Hashtable;
import java.util.Scanner;
public class Exercise04_15 {
    private final Hashtable<Character, Integer> internationalMapping;
    
    public Exercise04_15(){
        internationalMapping = new Hashtable<>();
        this.setMapping();
    }
    
    public String conversion(String input){
        StringBuilder output = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if(internationalMapping.containsKey(Character.toUpperCase(ch))) {
                output.append(internationalMapping.get(Character.toUpperCase(ch)));
            }
        }
        
        return output.toString();
    }

    private void setMapping() {
        internationalMapping.put('A', 2);
        internationalMapping.put('B', 2);
        internationalMapping.put('C', 2);
        
        internationalMapping.put('D', 3);
        internationalMapping.put('E', 3);
        internationalMapping.put('F', 3);

        internationalMapping.put('G', 4);
        internationalMapping.put('H', 4);
        internationalMapping.put('I', 4);

        internationalMapping.put('J', 5);
        internationalMapping.put('K', 5);
        internationalMapping.put('L', 5);

        internationalMapping.put('M', 6);
        internationalMapping.put('N', 6);
        internationalMapping.put('O', 6);

        internationalMapping.put('P', 7);
        internationalMapping.put('Q', 7);
        internationalMapping.put('R', 7);
        internationalMapping.put('S', 7);

        internationalMapping.put('T', 8);
        internationalMapping.put('U', 8);
        internationalMapping.put('V', 8);

        internationalMapping.put('W', 9);
        internationalMapping.put('X', 9);
        internationalMapping.put('Y', 9);
        internationalMapping.put('Z', 9);
        
        
    }

}

class TestingExercise04_15{
    public static void main(String[] args) {
        Exercise04_15 keypad = new Exercise04_15();
        System.out.print("Enter Text to Convert (Characters that aren't in the library will be omitted): ");
        String value = new Scanner(System.in).next();
        System.out.println(keypad.conversion(value));

    }
}