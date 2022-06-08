package ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var lista = new ArrayList<IPersonaje>();
        lista.add(new Goku());
        lista.add(new Chavo());
        lista.add(new Batman());
        lista.add(new MarioBros());

        for (var personaje : lista) {
            personaje.decirFraseComun();
            personaje.decirEnemigo();
            personaje.decirMejorAmigo();
            personaje.decirSerie();
        }
    }
}
