import java.util.HashSet;
import java.util.Iterator;

class Card {

    Card palo = new Card();
    Card color = new Card();
    Card valor = new Card();

    public static void main(String[] args) {

        HashSet palo = new HashSet();
        palo.add("Treboles");
        palo.add("Corazones");
        palo.add("Picas");
        palo.add("Diamantes");

        HashSet<String> color = new HashSet<String>();
        color.add("Rojo");
        color.add("Negro");

        HashSet valor = new HashSet();
        valor.add(2);
        valor.add(3);
        valor.add(4);
        valor.add(5);
        valor.add(6);
        valor.add(7);
        valor.add(8);
        valor.add(9);
        valor.add(10);
        valor.add("J");
        valor.add("Q");
        valor.add("K");
        valor.add("A");


        Object[] arr = palo.toArray();
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


    }

}






