package ejercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Alejandro Cordero Diadosa
 *
 */
public class Ejercicio2StringBuilder {

	public static void main(String[] args) {
		
		System.out.println("EJERCICIO 1 STRING");

		String str1 = new String ("Me gusta programar en Java");

		System.out.println("longitud de la cadena");
		System.out.println(str1.length()); // longitud de la cadena
		System.out.println();
		System.out.println("caracter en la posicion 5");
		System.out.println(str1.charAt(5)); // caracter en la posicion 5
		System.out.println();
		System.out.println("subcadena desde la posicion 21 hasta el final");
		System.out.println(str1.substring(21, str1.length())); // subcadena desde la posicion 21 hasta el final
		System.out.println();
		System.out.println("subcadena desde la posicion 8 a la 16");
		System.out.println(str1.substring(8, 16)); // subcadena desde la posicion 8 a la 16
		System.out.println();
		System.out.println("añade a la cadena de caracteres 'Casi siempre'");
		System.out.println(str1.concat(" Casi siempre")); // añade a la cadena de caracteres "Casi siempre"
		System.out.println();
		System.out.println("recupera la posicion de 'Casi'");
		System.out.println(str1.concat(" Casi siempre").indexOf("Casi")); // recupera la posicion de "Casi"
		System.out.println();
		System.out.println("muestra la cadena de caracteres en MAYUSCULA");
		System.out.println(str1.toUpperCase()); // muestra la cadena de caracteres en MAYUSCULA
		System.out.println();
		System.out.println("compara las dos cadenas, una normal y otra en mayuscula");
		System.out.println(str1.equals(str1.toUpperCase())); // compara las dos cadenas, una normal y otra en mayuscula
		System.out.println();
		System.out.println("compara las dos cadenas ignorando mayusculas y minusculas");
		System.out.println(str1.equalsIgnoreCase(str1.toUpperCase())); // compara las dos cadenas ignorando mayusculas y minusculas
		System.out.println();

		System.out.println("frase dada la vuelta");
		revertir(str1);

		System.out.println("------------------------------------------------------------------------");

		System.out.println("EJERCICIO 2 STRINGBUILDER");
		System.out.println();

		StringBuilder strb1 = new StringBuilder("Hello Java World");

		System.out.println("elimina la palabra Java de la cadena");
		System.out.println(strb1.delete(5, 10)); // elimina de la cadena la palabra JAVA
		System.out.println();
		System.out.println("inserta 'my' en la posicion 6");
		System.out.println(strb1.insert(6, "my ")); // inserta en la posicion 6 "my"
		System.out.println();
		System.out.println("inserta mi nombre al final de la cadena");
		System.out.println(strb1.append(" I am Alejandro")); // inserta mi nombre al final de la cadena
		System.out.println();
		System.out.println("sustituye mi nombre por mi apellido");
		System.out.println(strb1.replace(20, 29, "Cordero")); // remplaza mi nombre por mi apellido
		System.out.println();

		StringBuilder strb2 = new StringBuilder(strb1.substring(0, 5)); // obteniendo un nuevo String Builder a partir del substring de strb1
		System.out.println("Dando la vuelta a la nueva cadena");
		System.out.println(strb2.reverse());
		System.out.println();
		System.out.println("muestra el resultado de unir la nueva cadena de caracteres a la anterior");
		System.out.println(strb1.insert(0, strb2));
		System.out.println();

		System.out.println("------------------------------------------------------------------------");
		// EJERCICIOS DATE
		System.out.println("EJERCICIO 3 DATE");
		
		Date fecha = new Date();
		System.out.println(fecha);
		System.out.println();
		
		SimpleDateFormat sff = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String fechaEnString = "16-04-2025 10:20:56";
		try {
			Date fecha2 = sff.parse(fechaEnString);
			System.out.println(fecha2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println();
		
// 4.3
		System.out.println("EJERCICIO 4.3");
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyy/MM/dd");
//		Date fecha3 = new Date();
//		System.out.println(dateFormat.format(fecha3));
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date fecha3 = new Date();
		System.out.println(dateFormat.format(fecha3));
		System.out.println();
		
// 4.4
		System.out.println("EJERCICIO 4.4");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
		
		int hour = calendar.get(calendar.HOUR);
		int hourOfDay = calendar.get(calendar.HOUR_OF_DAY);
		int minute = calendar.get(calendar.MINUTE);
		int second = calendar.get(calendar.SECOND);
		int millisecond = calendar.get(calendar.MILLISECOND);
		
		System.out.println(sdf.format(calendar.getTime()));
		
		System.out.println("year \t\t: "+year);
		System.out.println("month \t\t: "+month);
		System.out.println("dayOfMonth \t: "+dayOfMonth);
		System.out.println("dayOfWeek \t: "+dayOfWeek);
		System.out.println("weekOfYear \t: "+weekOfYear);
		System.out.println("weekOfMonth \t: "+weekOfMonth);
		
		System.out.println("hour \t\t: "+hour);
		System.out.println("hourOfDay \t: "+hourOfDay);
		System.out.println("minute \t\t: "+minute);
		System.out.println("second \t\t: "+second);
		System.out.println("millisecond \t: "+millisecond);
		System.out.println();
		
// 5
		System.out.println("EJERCICIO 5");
		
		String sFechas = "21/04/2015, 12/06/1955, 26/01/1985, 18/06/1936, 12/10/1492, 25/12/2000, 02/05/2018, 13/10/1975, 01/03/1991, 20/10/1972, 17/04/2020";
		Date [] vFechas = new Date[11];
		try {
			StringToDateArray(vFechas, sFechas);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ordenarArray(vFechas);
	}

	public static void StringToDateArray (Date [] arr, String cadena) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sdf1.parse(cadena.substring(i*12, (i*12) + 10));
		}
	}
	public static void ordenarArray(Date [] arr) {	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date aux = new Date();
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr.length;j++) {
				if(arr[i].after(arr[j])) {
					aux = arr[i];
					arr[i] = arr[j];
					arr[j] = aux;
				}
			}
		}
		for(int i = 0; i< arr.length; i++) {
			System.out.println(sdf.format(arr[i]));
		}
	}
	
	public static void revertir (String str) { // funcion para dar la vuelta a cualquier frase
		String cadena = str;
		String invertir = "";
		for(int i = cadena.length()-1; i >= 0; i--) {
			invertir = invertir + cadena.charAt(i);
		}
		System.out.println(invertir);
	}

}
