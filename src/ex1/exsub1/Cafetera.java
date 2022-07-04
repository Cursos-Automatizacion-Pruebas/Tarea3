package ex1.exsub1;

public class Cafetera extends Electrodomesticos {
    private double capacidadLitros;
    private double tiempoDePreparacion;
    private boolean vieneConBolsaCafe;

    public Cafetera(String marca, double peso, String id, String tienda, double capacidadLitros, double tiempoDePreparacion, boolean vieneConBolsaCafe) {
        super(marca, peso, id, tienda);
        this.capacidadLitros = capacidadLitros;
        this.tiempoDePreparacion = tiempoDePreparacion;
        this.vieneConBolsaCafe = vieneConBolsaCafe;
    }

    public double getCapacidadLitros() {
        return capacidadLitros;
    }

    public double getTiempoDePreparacion() {
        return tiempoDePreparacion;
    }

    public boolean isVieneConBolsaCafe() {
        return vieneConBolsaCafe;
    }

    @Override
    public void encender() {
        System.out.println("hola soy una cafetera y me prendí");
    }

    @Override
    public void apagar() {
        System.out.println("hola soy una cafetera y me apagué");
    }
}
