class Card {
    String palo;
    String color;
    String valor;

    // Creación los métodos con getters y setters que componen la clase carta
    Card(String palo, String color, String valor){
        this.palo = palo;
        this.color = color;
        this.valor =  valor;
    }
    @Override
    public String toString(){

        // Si el palo es corazón o diamante, mediante una condición lo establecemos en rojo
        if(palo == "Corazones" || palo == "Diamantes") {
            color = "Rojo";
        }

        // Si el palo no es corazón o diamante, entonces el color del palo será negro (cuando son tréboles o picas)
        else
            color = "Negro";

        return palo + ", " + color + ", " + valor;
    }
}




