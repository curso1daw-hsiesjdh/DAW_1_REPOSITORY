package StringBuilder;

public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello Java world");

        //Eliminar Java
        System.out.println(sb.delete(6,10));

        // Añadir my
        System.out.println(sb.insert(6,"my"));

        //Añadir nombre
        System.out.println(sb.append(", I am Ismail."));

        // Reemplazar nombre
        System.out.println(sb.replace(21,27, "Cherkaoui"));

        // Obtener subcadena, invertir y añadir
        System.out.println(sb.insert(0, new StringBuilder(sb.substring(0,5)).reverse()));
    }
}
