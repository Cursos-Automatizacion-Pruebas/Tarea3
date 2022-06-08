package ex3;

public class MarioBros implements IPersonaje {
    @Override
    public void decirFraseComun() {
        System.out.println("Mama mía");
    }

    @Override
    public void decirEnemigo() {
        System.out.println("Bowser");
    }

    @Override
    public void decirMejorAmigo() {
        System.out.println("Toad");
    }

    @Override
    public void decirSerie() {
        System.out.println("Super Mario Bross");
    }
}
