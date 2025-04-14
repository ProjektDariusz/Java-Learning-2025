import java.util.HashMap;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> countries = new HashMap<>();

        countries.put("polska", "Warszawa");
        countries.put("niemcy", "Berlin");
        countries.put("francja", "Paryż");
        countries.put("ukraina", "Kijów");
        countries.put("rosja", "Moskwa");

        System.out.println("Podaj nazwę dowolnego Państwa");
        String Country = scanner.nextLine().toLowerCase();

        if (countries.containsKey(Country)) {
            System.out.println("Stolicą " + Country + " jest " + countries.get(Country));
        }else {
            System.out.println("Nie znam takiego państwa");
        }


    }
}
