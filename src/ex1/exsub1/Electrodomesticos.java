package ex1.exsub1;

public abstract class Electrodomesticos {
    //private getters setters
    String marca;
    double peso;
    String id;
    String tienda;

    public Electrodomesticos() {
    }

    public Electrodomesticos(String marca, double peso, String id, String tienda) {
        this.marca = marca;
        this.peso = peso;
        this.id = id;
        this.tienda = tienda;
    }

    public void decirMarca() {
        System.out.println(marca);
    }

    public void decirPeso() {
        System.out.println(peso);
    }

    public void decirTienda() {
        System.out.println(tienda);
    }

    public abstract void encender();

    public abstract void apagar();
}
