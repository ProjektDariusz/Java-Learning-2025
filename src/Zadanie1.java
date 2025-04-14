import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dowolne imiona");
        String line = scanner.nextLine();

        String[] nameArray = line.split(" ");

        List<String> names = new ArrayList<>();

        for (String name : nameArray) {
            names.add(name);
        }

        int femaleCount = 0;
        int maleCount = 0;

        for (String name : names) {
            if (name.endsWith("a")) {
                femaleCount++;
            }else {
                maleCount++;
            }
        }

        System.out.println("Liczba imion żeńskich: " + femaleCount);
        System.out.println("Liczba imion męskich: " + maleCount);
    }




}