import java.util.ArrayList;
import java.util.Random;

public class Zadanie8 {
    public static void main(String[] args) {

        ArrayList<Object> A = new ArrayList<>();

        A.add("Element1");
        A.add("Element2");
        A.add("Element3");
        A.add("Element4");
        A.add("Element5");
        A.add("Element6");
        A.add("Element7");
        A.add("Element8");
        A.add("Element9");
        A.add("Element10");

        ArrayList<Object> B = new ArrayList<>();

        Random random = new Random();

        while (!A.isEmpty()) {
            int losowyNumer = random.nextInt(A.size());
            B.add(A.get(losowyNumer));
            A.remove(losowyNumer);
        }

        System.out.println("Lista B w losowej kolejności:");
        System.out.println(B);




    }
}
