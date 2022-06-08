package ex2;

public class StringUtilities {
    static String concatenarStrings(String strCadena1, String strCadena2) {
        return strCadena1.concat(strCadena2);
    }

    static String concatenarStrings(String strCadena1, String strCadena2, String strCadena3) {
        return strCadena1.concat(strCadena2.concat(strCadena3));
    }

}
