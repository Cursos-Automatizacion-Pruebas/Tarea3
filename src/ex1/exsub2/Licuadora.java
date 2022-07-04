package ex1.exsub2;

import ex1.exsub1.Electrodomesticos;

public class Licuadora extends Electrodomesticos {
    private int numeroAspas;
    private int numeroVelocidades;
    private boolean esContenedorVidrio;

    public Licuadora(String marca, double peso, String id, String tienda, int numeroAspas, int numeroVelocidades, boolean esContenedorVidrio) {
        super(marca, peso, id, tienda);
        this.numeroAspas = numeroAspas;
        this.numeroVelocidades = numeroVelocidades;
        this.esContenedorVidrio = esContenedorVidrio;
    }

    public int getNumeroAspas() {
        return numeroAspas;
    }

    public int getNumeroVelocidades() {
        return numeroVelocidades;
    }

    public boolean isEsContenedorVidrio() {
        return esContenedorVidrio;
    }

    @Override
    public void encender() {
        System.out.println("“hola soy una licuadora y me prendí");
    }

    @Override
    public void apagar() {
        System.out.println("hola soy una licuadora y me apagué");
    }
}
