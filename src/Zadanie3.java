import java.util.ArrayList;

public class Zadanie3 {
    public static void main(String[] args) {

        ArrayList<String> names1 = new ArrayList<>();

        names1.add("Ola");
        names1.add("Ala");
        names1.add("Adam");
        names1.add("Jan");
        names1.add("Ina");
        names1.add("Marcin");
        names1.add("Iwona");
        names1.add("Maciek");
        names1.add("Damian");
        names1.add("Piotr");

        ArrayList<String> names2 = new ArrayList<>();

        names2.add("Mateusz");
        names2.add("Aga");
        names2.add("Wala");
        names2.add("Ola");
        names2.add("Ala");
        names2.add("Daniel");
        names2.add("Darek");
        names2.add("Ina");
        names2.add("Monika");
        names2.add("Paweł");

        System.out.println("Imiona w obu listach");

        for (int i = 0; i < names1.size(); i++) {
            String name1 = names1.get(i);

            for (int j = 0; j < names2.size(); j++) {
                String name2 = names2.get(j);

                if (name1.equals(name2)) {
                    System.out.println(name1);
                }
            }

        }


    }
    }
