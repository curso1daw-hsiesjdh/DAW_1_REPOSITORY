package String;

public class StringMain {

    public static void main(String[] args) {
        String s = "Me gusta programar en Java";

        // Longitud de la cadena de caracteres
        System.out.println(s.length());

        // Caracter en posicion 5
        System.out.println(s.charAt(5));

        // Subcadena desde la posicion 21
        System.out.println(s.substring(21));

        // Subcadena entre 8 y 16
        System.out.println(s.substring(8,16));

        // Concatenar cadena
        System.out.println(s.concat(" (Casi siempre)"));

        // Posiscion de Casi
        System.out.println(s.concat(" (Casi siempre)").indexOf("Casi"));

        // Mayusculas
        System.out.println(s.toUpperCase());

        // Comparacion
        System.out.println(s.compareTo(s.toUpperCase()));
        System.out.println(s.compareToIgnoreCase(s.toUpperCase()));

        // Ivertir cadena de caracteres
        Reverse reverse = new Reverse("Esto es una PRUEBA");
        System.out.println(reverse.reverseString());
    }
}
