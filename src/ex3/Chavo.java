package ex3;

public class Chavo implements IPersonaje {
    @Override
    public void decirFraseComun() {
        System.out.println("Fue sin querer queriendon");
    }

    @Override
    public void decirEnemigo() {
        System.out.println("Es ron ramon");
    }

    @Override
    public void decirMejorAmigo() {
        System.out.println("Es kiko");
    }

    @Override
    public void decirSerie() {
        System.out.println("El chavo del 8");
    }
}
