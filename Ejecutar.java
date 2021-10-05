// En la clase Ejecutar se coloca el método main.

class Ejecutar {
    public static void main(String[] args) {

        //Objeto cartas instanciado de la clase Deck y sus métodos.
        Deck cartas = new Deck();

        //Mostrar la indicación de cartas mezcladas.
        System.out.println();
        System.out.println("*** SHUFFLE ***");
        cartas.shuffle();

        //Visualización de la primera carta del mazo.
        System.out.println();
        System.out.println("*** HEAD ***");
        cartas.head();

        //Visualización de una carta tomada al azar de entre el mazo.
        System.out.println();
        System.out.println("*** PICK ***");
        cartas.pick();

        //Visualización del reparto de 5 cartas
        System.out.println();
        System.out.println("*** HAND ***");
        cartas.hand();

    }
}
