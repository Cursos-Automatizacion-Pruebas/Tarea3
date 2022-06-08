package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double dblNumero1, dblNumero2, dblNumero3;
        int intNumero1, intNumero2, intNumero3;
        String strCadena1, strCadena2, strCadena3;
        double dblCalcularSuma1, dblCalcularSuma2;
        int intCalcularSuma1, intCalcularSuma2;
        String strConcatenarStrings1, strConcatenarStrings2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar valor decimal numero1: ");
        dblNumero1 = scanner.nextDouble();
        System.out.print("Ingresar valor decimal numero2: ");
        dblNumero2 = scanner.nextDouble();
        System.out.print("Ingresar valor decimal numero3: ");
        dblNumero3 = scanner.nextDouble();
        System.out.print("Ingresar valor entero numero1: ");
        intNumero1 = scanner.nextInt();
        System.out.print("Ingresar valor entero numero2: ");
        intNumero2 = scanner.nextInt();
        System.out.print("Ingresar valor entero numero3: ");
        intNumero3 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingresar cadena 1: ");
        strCadena1 = scanner.nextLine();
        System.out.print("Ingresar cadena 2: ");
        strCadena2 = scanner.nextLine();
        System.out.print("Ingresar cadena 3: ");
        strCadena3 = scanner.nextLine();
        scanner.close(); //cerrando el scanner

        //Calculadora calculadora=new Calculadora();
        //StringUtilities stringUtilities=new StringUtilities();
        // STATIC NO DEPENDE DE UNA INSTACIA , PONER CLASE Y METODO
        dblCalcularSuma1 = Calculadora.calcularSuma(dblNumero1, dblNumero2);
        dblCalcularSuma2 = Calculadora.calcularSuma(dblNumero1, dblNumero2, dblNumero3);
        intCalcularSuma1 = Calculadora.calcularSuma(intNumero1, intNumero2);
        intCalcularSuma2 = Calculadora.calcularSuma(intNumero1, intNumero2, intNumero2);
        strConcatenarStrings1 = StringUtilities.concatenarStrings(strCadena1, strCadena2);
        strConcatenarStrings2 = StringUtilities.concatenarStrings(strCadena1, strCadena2, strCadena3);

        System.out.println("La suma de 2 numeros decimales es: " + dblCalcularSuma1);
        System.out.println("La suma de 3 numeros decimales es: " + dblCalcularSuma2);
        System.out.println("La suma de 2 numeros enteros es: " + intCalcularSuma1);
        System.out.println("La suma de 3 numeros enteros es: " + intCalcularSuma2);
        System.out.println("Concatenacion de 2 Cadenas es: " + strConcatenarStrings1);
        System.out.println("Concatenacion de 3 Cadenas es: " + strConcatenarStrings2);
    }
}
