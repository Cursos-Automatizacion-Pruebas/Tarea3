package ex3;

public class Batman implements IPersonaje {
    @Override
    public void decirFraseComun() {
        System.out.println("Soy la venganza");
    }

    @Override
    public void decirEnemigo() {
        System.out.println("Es joker");
    }

    @Override
    public void decirMejorAmigo() {
        System.out.println("Es alfred");
    }

    @Override
    public void decirSerie() {
        System.out.println("Dark Knigh");
    }
}
