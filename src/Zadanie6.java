import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        String wybor = "";

        while (!wybor.equals("K")) {

        System.out.println("Co chcesz zrobić?");
        System.out.println("D - Dodaj imię");
        System.out.println("U - Usuń imię");
        System.out.println("W - Wyświetl listę imion");
        System.out.println("K - Zakończ program");

        wybor = scanner.nextLine().toUpperCase();

        if (wybor.equals("D")) {
            System.out.println("Wpisz imię do dodania:");
            names.add(scanner.nextLine());
        } else if (wybor.equals("U")) {
            System.out.println("Wpisz imię do usunięcia:");
            String imieDoUsuniecia = scanner.nextLine();

            while (names.contains(imieDoUsuniecia)) {
                names.remove(imieDoUsuniecia);
            }
            } else if (wybor.equals("W")) {
            System.out.println("Aktualna lista imion:");
            System.out.println(names);
        } else if (!wybor.equals("K")) {
            System.out.println("Nie rozumiem polecenia.");

        }
            System.out.println("Program zakończony.");

        }
        }
        }











