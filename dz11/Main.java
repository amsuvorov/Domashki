import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введи речення:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        Map<Character, Integer> letterCountMap = new HashMap<>();

        for (int i = 0; i < sentence.length(); i++) {

            char c = sentence.charAt(i);

            if (Character.isLetter(c)) {
                Integer count = letterCountMap.get(c);
                if (count == null) {
                    letterCountMap.put(c, 1);
                } else {
                    letterCountMap.put(c, count + 1);
                }
            }
        }
        
        System.out.println("Кількість кожної літери у реченні:");
        for (Character letter : letterCountMap.keySet()) {
            System.out.println(letter + ": " + letterCountMap.get(letter));
        }
    }
}
