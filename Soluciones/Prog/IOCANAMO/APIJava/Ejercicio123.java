package util;

public class Ejercicio123 {
//	Ejercicio 2
	public static void reverse(String a){
		for(int x=a.length()-1;x>=0;x--){
			System.out.print(a.charAt(x));
		}
		}
//La funcion .reverse de un Stringbuffer seria mas util que hacer esto
//	Ejemplo: StringBuffer a = new StringBuffer("Hola");
//    System.out.println(a.reverse());
	public static void main(String[]args){
//Ejercicio 1
String o ="Me gusta programar en java";
	    /*A*/
	    System.out.println("La longitud de la cadena de caracteres es: "+o.length());
	    /*B*/
	    System.out.println("El caracter que se encuentra en la posicion 5 es: "+o.charAt(5));
	    /*C*/
	    System.out.println("La cadena resultante desde la posicion 21 hasta el final es: "+o.substring(21));
	    /*D*/
	    System.out.println("La cadena resultante entre los indices 8 y 16 es: "+o.substring(8, 16));
	    /*E*/
	    String o2 =o.concat("(casi siempre)");
	    System.out.println(o2);
	    /*F*/
	    System.out.println("La posicion de la cadena casi es la numero: "+o2.indexOf("casi"));
	    /*G*/
	    System.out.println(o.toUpperCase());
	    /*H*/
	    System.out.println(o.compareTo(o.toUpperCase()));
	    System.out.println(o.compareToIgnoreCase(o.toUpperCase()));	        
//	    ----------------------------------------
	    reverse("Esta oracion esta al reves!");
	    System.out.println("");
	    
//	    ----------------------------------------
//	    Ejercicio 3
	    StringBuilder strg = new StringBuilder("Hello Java world");
	    System.out.println(strg.delete(6, 11));
	    System.out.println(strg.insert(6, new StringBuilder("my ")));
	    System.out.println(strg.insert(14, new StringBuilder(" i am Iker")));
	    System.out.println(strg.replace(20, 25, "Ocania"));
	    StringBuilder strg1 = new StringBuilder(strg.substring(0, 5));
	    strg1.reverse();
	    System.out.println(strg.insert(0, strg1+" "));
	}
	
}
