import java.util.*;

class Deck{
    String Palo[] = {"Tréboles", "Corazones", "Picas", "Diamantes"}; //Array simple con el contenido de los palos.
    String Color[] = {"Rojo", "Negro"}; //En este otro array se agregan los colores de las cartas.
    String Valor[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; //Nos apoyamos en este arreglo para agregar los valores.

    //Carga de objetos tipo Card (elementos) en la colección ArrayList llamada miDeck
    private ArrayList<Card> miDeck;

    //Clase Deck y atributo.
    public Deck() {
        miDeck = new ArrayList<Card>();

        // Carga de elementos utilizando ciclos for
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < Valor.length; j++)
                miDeck.add(new Card(Palo[i], Color[0], Valor[j]));

        for (int i = 2; i < 4; i++)
            for (int j = 0; j < Valor.length; j++)
                miDeck.add(new Card(Palo[i], Color[1], Valor[j]));
    }

    //Método que retorna el tamaño del mazo (resultado de los ciclos FOR del bloque anterior).
    public int getMazo() {
        return miDeck.size();
    }

    //Método utilizado para mezclar las cartas. No retorna valor.
    void shuffle(){
        Collections.shuffle(miDeck);
        System.out.println("Se mezcló el deck.");
    }

    //Método para mostrar la primera carta. No retorna valor (void).
    void head() {
        System.out.println(miDeck.get(0));
        miDeck.remove(0); //Remoción del elemento de la colección ArrayList
        System.out.println("Quedan " + miDeck.size() + ".");
    }

    //Método para tomar entre el mazo una carta al azar y descartarla. No retorna valor (void).
    void pick(){
        Random azar = new Random();
        System.out.println(miDeck.get(azar.nextInt(miDeck.size())));
        miDeck.remove(azar.nextInt(miDeck.size())); //Remoción del elemento de la colección ArrayList
        System.out.println("Quedan " + miDeck.size() + ".");
    }

    //Método usado para repartir y mostrar 5 cartas del  mazo.
    void hand(){
        for(int tomar = 0; tomar < 5; tomar++){
            System.out.println(miDeck.get(tomar));
        }

        for(int eliminar = 0; eliminar < 5; eliminar ++){
            miDeck.remove(eliminar); //Remoción de 5 elementos de la colección ArrayList
        }
        System.out.println("Quedan " + miDeck.size() + ".");
    }
}




