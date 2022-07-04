package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar valor decimal numero1: ");
        var dNumero1 = scanner.nextDouble();
        System.out.print("Ingresar valor decimal numero2: ");
        var dNumero2 = scanner.nextDouble();
        System.out.print("Ingresar valor decimal numero3: ");
        var dNumero3 = scanner.nextDouble();
        System.out.print("Ingresar valor entero numero1: ");
        var iNumero1 = scanner.nextInt();
        System.out.print("Ingresar valor entero numero2: ");
        var iNumero2 = scanner.nextInt();
        System.out.print("Ingresar valor entero numero3: ");
        var iNumero3 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingresar cadena 1: ");
        var sCadena1 = scanner.nextLine();
        System.out.print("Ingresar cadena 2: ");
        var sCadena2 = scanner.nextLine();
        System.out.print("Ingresar cadena 3: ");
        var sCadena3 = scanner.nextLine();
        scanner.close(); //cerrando el scanner

        var dCalcularSuma1 = Calculadora.calcularSuma(dNumero1, dNumero2);
        var dCalcularSuma2 = Calculadora.calcularSuma(dNumero1, dNumero2, dNumero3);
        var iCalcularSuma1 = Calculadora.calcularSuma(iNumero1, iNumero2);
        var iCalcularSuma2 = Calculadora.calcularSuma(iNumero1, iNumero2, iNumero2);
        var sConcatenarStrings1 = StringUtilities.concatenarStrings(sCadena1, sCadena2);
        var sConcatenarStrings2 = StringUtilities.concatenarStrings(sCadena1, sCadena2, sCadena3);

        System.out.println("La suma de 2 numeros decimales es: " + dCalcularSuma1);
        System.out.println("La suma de 3 numeros decimales es: " + dCalcularSuma2);
        System.out.println("La suma de 2 numeros enteros es: " + iCalcularSuma1);
        System.out.println("La suma de 3 numeros enteros es: " + iCalcularSuma2);
        System.out.println("Concatenacion de 2 Cadenas es: " + sConcatenarStrings1);
        System.out.println("Concatenacion de 3 Cadenas es: " + sConcatenarStrings2);
    }
}
