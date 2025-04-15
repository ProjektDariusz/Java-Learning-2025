import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Autos {
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


        while (!wybor.equals("K")) {
            System.out.println("A - Wyświetl wszystkie samochody");
            System.out.println("B - Wyświetl dostępne samochody");
            System.out.println("C - Wypożycz samochód");
            System.out.println("D - Twoje wypożyczone samochody");
            System.out.println("E - Oddaj samochód");
            System.out.println("K - Zakończ program");

            wybor = scanner.nextLine().toUpperCase();


            if (wybor.equals("A")) {
                String podWybor = "";
                while (!podWybor.equals("T")) {
                    for (String car : CarList.keySet()) {
                        System.out.println(car + " - " + (CarList.get(car) ? "Dostępny" : "Wypożyczony"));
                    }
                    System.out.println("Wrócić do menu? (T - tak");
                    podWybor = scanner.nextLine().toUpperCase();
                }


            } else if (wybor.equals("B")) {
                String podWybor1 = "";
                while (!podWybor1.equals("T")) {
                    for (String car : CarList.keySet()) {
                        if (CarList.get(car)) {
                            System.out.println(car);
                        }
                    }
                    System.out.println("Wrócić do menu? (T - tak");
                    podWybor1 = scanner.nextLine().toUpperCase();
                }


            } else if (wybor.equals("C")) {
                String podWybor2 = "";
                while (!podWybor2.equals("T")) {

                    if (userCars.size() >= 3) {
                        System.out.println("Masz już 3 auta — nie możesz więcej wypożyczyć.");
                    } else {
                        System.out.println("Dostępne auta:");
                        for (String car : CarList.keySet()) {
                            if (CarList.get(car)) {
                                System.out.println(car);
                            }
                        }
                        System.out.println("Podaj nazwę auta, które chcesz wypożyczyć:");
                        String carToRent = scanner.nextLine();

                        if (carToRent.length() > 0) {
                            carToRent = carToRent.substring(0, 1).toUpperCase() + carToRent.substring(1).toLowerCase();
                        }

                        if (CarList.containsKey(carToRent) && CarList.get(carToRent)) {
                            CarList.put(carToRent, false);
                            userCars.add(carToRent);
                            System.out.println("Wypożyczyłeś: " + carToRent);
                        } else {
                            System.out.println("Nie ma takiego auta lub jest już wypożyczone.");

                        }
                        System.out.println("Jeśli chcesz wypożyczyć jeszcze jeden samochód wpisz \"W\"");
                        System.out.println("Jeśli chcesz wrocić do menu wpisz \"T\"");
                        podWybor2 = scanner.nextLine().toUpperCase();

                        if (!podWybor2.equals("W") && !podWybor2.equals("T")) {
                            System.out.println("Nie rozumiem polecenia");
                            podWybor2 = "T";
                        }
                    }
                }


            } else if (wybor.equals("D")) {
                String podWybor3 = "";
                while (!podWybor3.equals("T")) {

                    if (userCars.isEmpty()) {
                        System.out.println("Nie masz żadnych wypożyczonych aut.");
                    } else {
                        System.out.println("Twoje auta");
                        System.out.println(userCars);
                    }

                    System.out.println("Wrócić do menu? (T - tak");
                    podWybor3 = scanner.nextLine().toUpperCase();

                }
            } else if (wybor.equals("E")) {
                String podWybor4 = "";
                while (!podWybor4.equals("T")) {

                    if (userCars.isEmpty()) {
                        System.out.println("Nie masz żadnych wypożyczonych aut.");
                        podWybor4 = "T";
                    } else {
                        System.out.println("Twoje auta");
                        System.out.println(userCars);

                        System.out.println("Które auto chcesz usunąć");
                        String carToReturn = scanner.nextLine();

                        if (carToReturn.length() > 0) {
                            carToReturn = carToReturn.substring(0, 1).toUpperCase() + carToReturn.substring(1).toLowerCase();

                            if (userCars.contains(carToReturn)) {
                                userCars.remove(carToReturn);
                                CarList.put(carToReturn, true);
                                System.out.println("Oddałeś auto: " + carToReturn);
                            } else {
                                System.out.println("Nie ma takiego auta");
                            }
                            System.out.println("Jeśli chcesz wrócić do menu wpisz \"T\"");
                            System.out.println("Lub wpisz cokolwiek innego, aby oddać kolejne auto");
                            podWybor4 = scanner.nextLine().toUpperCase();

                        }
                    }

                }


            }
            System.out.println();
            System.out.println("Program zakończony.");
        }
    }
}