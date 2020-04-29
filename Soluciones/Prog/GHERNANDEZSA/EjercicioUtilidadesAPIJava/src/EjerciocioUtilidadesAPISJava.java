import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class EjerciocioUtilidadesAPISJava {

	public static void main(String[] args) {
		// EJERCICIO   1
		String str = "Me gusta programar en Java.";
		// Obtener la longitud de la cadena de caracteres.
		System.out.println(str.length());
		//  Obtener el carácter que ocupa la posición 5a.
		System.out.println(str.charAt(5));
		//Obtener la sub-cadena desde la posición 21 hasta el final
		System.out.println(str.substring(21));
		//Obtener la sub-cadena indicada por los índices 8 y 16. 
		System.out.println(str.substring(8, 16));
		// Muestra por pantalla el resultado de concatenar la cadena “ (Casi siempre)
		str = str.concat("Casi siempre");
		System.out.println(str);
		// En la nueva cadena de caracteres obtenida en E), recuperar la posición de la cadena “Casi”
		System.out.println(str.indexOf("Casi"));
		// Muestra por pantalla la cadena de caracteres original en mayúsculas.
		str = "Me gusta programar en Java.";
		System.out.println(str.toUpperCase());
		// Compara la cadena de caracteres original con la cadena de caracteres en mayúsculas. Primero teniendo en cuenta la diferencia entre mayúsculas y minúsculas y por último ignorando esta diferencia.
		String strUpper = str.toUpperCase();
		System.out.println(str.compareTo(strUpper));
		System.out.println(str.compareToIgnoreCase(strUpper));
		
		// EJERCICIO 2
		System.out.println(reversoString("Esto es una PRUEBA"));
		// EJERCICIO3 
		StringBuilder strb =  new StringBuilder("Hello Java world.");
		// Eliminar la cadena de caracteres “ Java” y mostrar la cadena de caracteres del StringBuilder resultante.
		strb = strb.delete(5, 10);
		System.out.println(strb);
		//  Sobre el StringBuilder resultante del apartado anterior insertar la cadena “my ” en la posición 6. Mostrar la cadena de caracteres resultante.
		strb = strb.insert(6, "my ");
		System.out.println(strb);
		// Añadir al final de la cadena de caracteres del StringBuilder resultante del apartado 2 la cadena de caracteres: “ I am xxxx.”. Donde xxxx es mi nombre de pila. Mostrar la cadena de caracteres resultante.
		strb.append(" I am Guillermo");
		System.out.println(strb);
		// En el StringBuilder del apartado anterior reemplazar vuestro nombre de pila por vuestro primer apellido
		strb = strb.replace(21, 30, "Hernandez");
		System.out.println(strb);
		// Obtener la subcadena entre las posiciones 0 y 5, creando un nuevo StringBuilder con ella. Hacer el reverso de este nuevo substring y añadela de nuevo al StringBuilder del apartado 4 a partir de la posición 0. Mostrar la cadena de caracteres resultante.
		StringBuilder strb2 = new StringBuilder(strb.substring(0, 5));
		strb2 = strb2.reverse();
		strb = strb.insert(0, strb2);
		System.out.println(strb);
		// EJERCICIO 4.1
		// Visita la API SimpleDateFormat y haz un pequeño resumen de los patrones de los formatos de las fechas. 
		/* 	Los patrones de sirven para dar formato a la fecha y hora, esos se establecen con letters,
		 * letter, es un componente distinto que se presenta de una manera distinta.
		 */
		// Se muestra con este formato Wed Apr 29 22:44:23 CEST 2020
		// EJERCICIO 4.2
		// ¿Qué pasa si el contenido de la cadena de caracteres no es una fecha o no coincide con el formato especificado? ¿Cómo solucionarlo? Implementa la solución para el código del ejemplo 2.
		// Que lanza una exception, por eso hay que tratarla.
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "16-04-2025 10:20:56";
		try {
			Date fecha = sdf.parse(dateInString);
			System.out.println(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// EJERCICIO 4.3
		SimpleDateFormat soloFecha = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println(soloFecha.format(date));
		SimpleDateFormat soloHora = new SimpleDateFormat("hh:mm:ss");
		System.out.println(soloHora.format(date));
		// EJERCICIO 4.4
		// Comprueba la salida del código anterior en caso de que el GregorianCalendar calendar se crease sin parámetros, es decir, si se usa el constructor por defecto de GregorianCalendar para la variable calendar. 
		System.out.println("EJERCICIO 4.4");
		SimpleDateFormat sd = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
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
		// EJERCICIO 5
		/* Dada la cadena de caracteres sFechas, en el que se guardan fechas separadas por comas con el formato 
		 * días/mes/año, generar un array vFechas en el que cada posición del array será un objeto de tipo Date con
		 * formato yyyy-MM-dd, con todas las fechas de sFechas. Dicho array deberá ser ordenado de manera 
		 * ascendente.
		 */
		String sFechas = "21/04/2015, 12/06/1955, 26/01/1985, 18/06/1936, 12/10/1492, 25/12/2000, 02/05/2018, 13/10/1975, 01/03/1991, 20/10/1972, 17/04/2020";
		Date [] vFechas = new Date[11];
		try {
			StringToDateArray(vFechas, sFechas);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ordenarFechas(vFechas);
	}
	
	public static void StringToDateArray (Date [] array, String cadena) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		for(int i = 0; i < array.length; i++) {
			array[i] = sdf1.parse(cadena.substring(i*12, (i*12) + 10));
		}
	}
	
	public static void ordenarFechas(Date [] array) {	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date aux = new Date();
		for(int i = 0; i<array.length;i++) {
			for(int j = 0; j<array.length;j++) {
				if(array[i].after(array[j])) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		for(int i = 0; i< array.length; i++) {
			System.out.println(sdf.format(array[i]));
		}
	}
	
	// Desarrollar una función que haga el reverso de una cadena de caracteres que se suministre por parámetro. Investiga que función de la API String (no explicada aquí) podría ser más útil para tal cometido.
	public static String reversoString(String cadena) {
		String cadenaRevertida  = "";
		for (int contador =  cadena.length()  - 1;contador >= 0;contador--) {
			cadenaRevertida = cadenaRevertida + cadena.charAt(contador);
		}
		return cadenaRevertida;
	}

}
