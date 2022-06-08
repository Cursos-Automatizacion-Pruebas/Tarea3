package ex1;

import ex1.exsub1.Cafetera;
import ex1.exsub1.Electrodomesticos;
import ex1.exsub2.Licuadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // USAR VAR Y VARIABLES CON SCANER GITHUB
        double capacidadLitros;
        double tiempoDePreparacion;
        boolean vieneConBolsaCafe;

        int numeroAspas;
        int numeroVelocidades;
        boolean esContenedorVidrio;

        int numeroBotones;
        double calorMaximo;
        boolean vienePlatoVidrio;

        System.out.println("============INGRESAR DATOS DE LA CAFETERA================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar capacidad Litros: ");
        capacidadLitros = scanner.nextDouble();
        System.out.print("Ingresar tiempo De Preparacion: ");
        tiempoDePreparacion = scanner.nextDouble();
        System.out.print("Ingresar viene Con Bolsa Cafe (TRUE/FALSE): ");
        vieneConBolsaCafe = scanner.nextBoolean();

        System.out.println("============INGRESAR DATOS DEL LICUADORA================");
        System.out.print("Ingresar numero Aspas: ");
        numeroAspas = scanner.nextInt();
        System.out.print("Ingresar numero Velocidades: ");
        numeroVelocidades = scanner.nextInt();
        System.out.print("Ingresar es Contenedor Vidrio (TRUE/FALSE): ");
        esContenedorVidrio = scanner.nextBoolean();

        System.out.println("============INGRESAR DATOS DEL MICROONDAS================");
        System.out.print("Ingresar numero Botones: ");
        numeroBotones = scanner.nextInt();
        System.out.print("Ingresar calor Maximo: ");
        calorMaximo = scanner.nextDouble();
        System.out.print("Ingresar viene Plato Vidrio (TRUE/FALSE): ");
        vienePlatoVidrio = scanner.nextBoolean();

        scanner.close(); //cerrando el scanner

        System.out.println("============SE CREA LA CAFETERA=================");
        Cafetera cafetera = new Cafetera("ZEROX", 10, "1", "HIRAOKA", capacidadLitros, tiempoDePreparacion, vieneConBolsaCafe);
        System.out.println("La capacidad de Litros es: " + cafetera.getCapacidadLitros());
        System.out.println("El tiempo de preparacion es: " + cafetera.getTiempoDePreparacion());
        System.out.println("Viene Con Bolsa Cafe: " + cafetera.isVieneConBolsaCafe());
        cafetera.encender();
        cafetera.apagar();

        System.out.println("============SE CREA LA LICUADORA============");
        Licuadora licuadora = new Licuadora("CISNE", 20, "2", "CURACAO", numeroAspas, numeroVelocidades, esContenedorVidrio);
        System.out.println("El Numero de Aspas es: " + licuadora.getNumeroAspas());
        System.out.println("El Numero de Velocidades es: " + licuadora.getNumeroVelocidades());
        System.out.println("Viene Con tenedor Vidrio: " + licuadora.isEsContenedorVidrio());
        licuadora.encender();
        licuadora.apagar();

        System.out.println("============SE CREA EL MICRONDOAS============");
        Microondas microondas = new Microondas("DURAMAZ", 30, "3", "CULBOX", numeroBotones, calorMaximo, vienePlatoVidrio);
        System.out.println("los Numero Botones son: " + microondas.getNumeroBotones());
        System.out.println("El Calor Maximo es: " + microondas.getCalorMaximo());
        System.out.println("Viene Plato Vidrio: " + microondas.isVienePlatoVidrio());
        microondas.encender();
        microondas.apagar();

        System.out.println("============IMPRIMIR LOS ELECTRODOMESTICOS============");
        List<Electrodomesticos> lista = new ArrayList<>();
        lista.add(cafetera);
        lista.add(licuadora);
        lista.add(microondas);

        for (Electrodomesticos electrodomesticos : lista) {
            electrodomesticos.decirMarca();
            electrodomesticos.decirPeso();
            electrodomesticos.decirTienda();
        }
    }
}