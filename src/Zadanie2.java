import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz dowolne zdanie");
        String sentence = scanner.nextLine();

        Map<Character, Integer> letterCounts = new HashMap<>();

        for (char ch : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCounts.put(ch, letterCounts.getOrDefault(ch, 0) +1);
            }
        }
        System.out.println("Wystąpnienie liter");
        for (Map.Entry<Character, Integer> entry : letterCounts.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }


    }
}
