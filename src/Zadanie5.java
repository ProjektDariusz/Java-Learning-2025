import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        names.add("ola");
        names.add("ala");
        names.add("adam");
        names.add("jan");
        names.add("ina");
        names.add("marcin");
        names.add("iwona");
        names.add("maciek");
        names.add("damian");
        names.add("piotr");
        
        System.out.println("Podaj dowolne imię");
        String name = scanner.nextLine().toLowerCase();

        boolean imieZlisty = false;

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(name)) {
                System.out.println("Imię " + name + " znajduje się pod indeksem: " + i);
                imieZlisty = true;
            }
        }
        if (!imieZlisty){
            System.out.println("Nie znam takiego imienia");
            

            }

        }
        
        

    }

