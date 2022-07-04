package ex1;

import ex1.exsub1.Electrodomesticos;

public class Microondas extends Electrodomesticos {
    private int numeroBotones;
    private double calorMaximo;
    private boolean vienePlatoVidrio;

    public Microondas(String marca, double peso, String id, String tienda, int numeroBotones, double calorMaximo, boolean vienePlatoVidrio) {
        super(marca, peso, id, tienda);
        this.numeroBotones = numeroBotones;
        this.calorMaximo = calorMaximo;
        this.vienePlatoVidrio = vienePlatoVidrio;
    }

    public int getNumeroBotones() {
        return numeroBotones;
    }

    public double getCalorMaximo() {
        return calorMaximo;
    }

    public boolean isVienePlatoVidrio() {
        return vienePlatoVidrio;
    }

    @Override
    public void encender() {
        System.out.println("hola soy un microondas y me prendí");
    }

    @Override
    public void apagar() {
        System.out.println("hola soy una microondas y me apagué");
    }
}
