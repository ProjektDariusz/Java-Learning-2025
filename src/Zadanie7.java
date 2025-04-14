import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Boolean> CarList = new HashMap<>();
        ArrayList<String> userCars = new ArrayList<>();


        CarList.put("BMW", true);
        CarList.put("Audi", true);
        CarList.put("Toyota", true);
        CarList.put("Fiat", true);
        CarList.put("Mercedes", true);


        String wybor = "";


        while (!wybor.equals("K")){
            System.out.println("A - Wyświetl wszystkie samochody");
            System.out.println("B - Wyświetl dostępne samochody");
            System.out.println("C - Wypożycz samochód");
            System.out.println("D - Twoje wypożyczone samochody");
            System.out.println("K - Zakończ program");

            wybor = scanner.nextLine().toUpperCase();


        if (wybor.equals("A")) {
            for (String car: CarList.keySet()) {
                System.out.println(car + " - " + (CarList.get(car) ? "Dostępny" : "Wypożyczony"));
            }

        } else if (wybor.equals("B")) {
            for (String car : CarList.keySet()) {
                if (CarList.get(car)) {
                    System.out.println(car);
                }
            }

        } else if (wybor.equals("C")) {

            if (userCars.size() >=3) {
                System.out.println("Masz już 3 auta — nie możesz więcej wypożyczyć.");
            }else {
                System.out.println("Podaj nazwę auta, które chcesz wypożyczyć:");
                String carToRent = scanner.nextLine();

                if (CarList.containsKey(carToRent) && CarList.get(carToRent)) {
                    CarList.put(carToRent, false);
                    userCars.add(carToRent);
                    System.out.println("Wypożyczyłeś: " + carToRent);
                }else {
                    System.out.println("Nie ma takiego auta lub jest już wypożyczone.");

                }
            }


        } else if (wybor.equals("D")) {
            if (userCars.isEmpty()) {
                System.out.println("Nie masz żadnych wypożyczonych aut.");
            }else {
                System.out.println("Woje auta");
                System.out.println(userCars);
            }
            } else if (!wybor.equals("K")) {
            System.out.println("Nie rozumiem polecenia.");
        }
        }


        System.out.println("Program zakończony.");

        }


    }

