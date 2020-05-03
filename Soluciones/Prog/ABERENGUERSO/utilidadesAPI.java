import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class utilidadesAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EJERCICIO 1
		
		// Creación cadena de caracteres
		String str1 = new String("Me gusta programar en Java.");
		String str2 = new String("ME GUSTA PROGRAMAR EN JAVA.");
		
		System.out.println("EJERCICIO 1");
		
		// Ejercicio 1.A
		System.out.println("La longitud de la cadena de caracteres es de: " + str1.length());
		
		// Ejercicio 1.B
		System.out.println("El caracter que se encuentra en la posicion 5 es: " + str1.charAt(5));
		
		// Ejercicio 1.C
		System.out.println("La subcadena de caracteres desde la posicion 21 es: " + str1.substring(21));
		
		// Ejercicio 1.D
		System.out.println("La subcadena de caracteres desde la posicion 8 hasta la 16 es: " + str1.substring(8, 16));
		
		// Ejercicio 1.E
		System.out.println("Me gusta programar en Java.".concat("(Casi siempre)"));
		
		// Ejercicio 1.F
		System.out.println("La posicion de la palabra CASI en la cadena es: " + "Me gusta programar en Java.(Casi siempre)".indexOf("Casi"));
		
		// Ejercicio 1.G
		System.out.println(str1.toUpperCase());
		
		// Ejercicio 1.H
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		
		
		// EJERCICIO 2
		
		String str3 = new String("Esto es una PRUEBA");
		System.out.println("\nEJERCICIO 2");
		System.out.println("Frase: " + str3 + " | Invertida -> " + reverso(str3));
		
		
		// EJERCICIO 3
		
		// Creación cadena de caracteres
		StringBuilder strB1 = new StringBuilder("Hello Java World."); 
		
		System.out.println("\nEJERCICIO 3");
		
		// Ejercicio 3.1
		System.out.println("Quito la palabra Java de la cadena: " + strB1.delete(5, 10));
		
		// Ejercicio 3.2
		System.out.println("Inserto una palabra en la posición 6: " + strB1.insert(6, new StringBuilder("my ")));
		
		// Ejercicio 3.3
		System.out.println("Añado un apéndice al final de la cadena: " + strB1.append(" I am AARON."));
		
		// Ejercicio 3.4
		System.out.println("Reemplazar mi nombre por mi apellido: " + strB1.replace(21, 26, "BERENGUER"));
		
		// Ejercicio 3.5
		System.out.println("Subcadena de la posicion 0 a la 5: " + strB1.substring(0, 5));
		StringBuilder strB2 = new StringBuilder(strB1.substring(0, 5));
		System.out.println("Reverso: " + strB2.reverse());
		System.out.println("Inserto la subcadena revertida en las posicion 0-5: " + strB1.insert(0, strB2));
		
		
		// EJERCICIO 4
		System.out.println("\nEJERCICIO 4");
		
		// Ejercciio 4.1
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/M/W/d E");
		String patronesFecha = sdf.format(new Date(0));
		System.out.println("4.1 | Patrones de fecha:");
		System.out.println("Fecha : " + patronesFecha);
		System.out.println("Patrón: yyyy/M/W/d E");
		System.out.println("y: year, M: month, W: weekend, d: day, E: day of the week");
		
		Date date1 = new Date(0);
		System.out.println("Objeto Date sin formato: " + date1 + "\n");
		
		/* Ejercicio 4.2    NO ME SALE LA EXCEPCION, SIGUE SIN IMPRIMIRSE POR PANTALLA
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String date = "2020/04/16 18:46:37";
		Date date2 = null;
		try {
			date2 = (Date) sdf2.parse(date);
		} catch (ParseException e) {
			System.out.println(e);
		}
		System.out.println(date2);*/
		
		// Ejercicio 4.3
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat dateFormatFecha = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat dateFormatHora = new SimpleDateFormat("HH:mm:ss");
		Date date3 = new Date(0);
		
		System.out.println("4.3 | "+ sdf3.format(date3));
		System.out.println("Solo fecha: " + dateFormatFecha.format(date3));
		System.out.println("Solo hora: " + dateFormatHora.format(date3) + "\n");
		
		// Ejercicio 4.4
		System.out.println("4.4 | Gregorian Calendar");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
		
		int hour = calendar.get(Calendar.HOUR);
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int millisecond = calendar.get(Calendar.MILLISECOND);
		
		System.out.println(sdf4.format(calendar.getTime()));
		
		System.out.println("year \t\t:" + year);
		System.out.println("month \t\t:" + month);
		System.out.println("dayOfMonth \t:" + dayOfMonth);
		System.out.println("dayOfWeek \t:" + dayOfWeek);
		System.out.println("weekOfYear \t:" + weekOfYear);
		System.out.println("weekOfMonth \t:" + weekOfMonth);
		
		System.out.println("hour \t\t:" + hour);
		System.out.println("hourOfDay \t:" + hourOfDay);
		System.out.println("minute \t\t:" + minute);
		System.out.println("second \t\t:" + second);
		System.out.println("millisecond \t:" + millisecond);
		System.out.println("Usa la fecha y horas actuales compilando");
		
		
		/* EJERCICIO 5   ME SALTA EXCEPCION Y NO SÉ COMO TRATARLA, AUN PONIENDO EL TRY Y CATCH NO SÉ BIEN COMO CONTINUAR
		System.out.println("\nEJERCICIO 5");
		String sFechas = "21/04/2015, 12/06/1955, 26/01/1985, 18/06/1936, 12/10/1492, 25/12/2000, 02/05/2018, 13/10/1975, 01/03/1991, 20/10/1972, 17/04/2020";
		Date[] vFechas = new Date[11];
		ordenarFechas(vFechas);
		escribirFechas(vFechas);*/
	}
	
	// MÉTODOS
	
	// EJERCICIO 2
	
	public static String reverso (String str3){
		char[] texto = str3.toCharArray();
		char[] textoInvertido = new char[texto.length];
		int c1 = texto.length;
		for(int i = 0; i < texto.length; i++){
			c1 = c1 - 1;
			textoInvertido[i] = texto[c1];
		}
		return String.valueOf(textoInvertido);
	}
	
	/* EJERCICIO 5
	
	// Ordenar array vFechas de manera ascendente
	public static void ordenarFechas(Date[] vFechas) {
		Date aux = new Date(0);
		for(int i = 0; i < vFechas.length; i++) {
			for(int j = 0; j < vFechas.length; j++) {
				if(vFechas[i].after(vFechas[j])) {
					aux = vFechas[i];
					vFechas[i] = vFechas[j];
					vFechas[j] = aux;
				}
			}
		}
	}
	
	// Escribir las fechas con el formato nuevo
	public static void escribirFechas(Date[] vFechas) {
		SimpleDateFormat formatoNuevo = new SimpleDateFormat("yyyy/MM/dd");
		for(int i = 0; i < vFechas.length; i++) {
			System.out.println(formatoNuevo.format(vFechas[i]));
		}
	}*/
}
