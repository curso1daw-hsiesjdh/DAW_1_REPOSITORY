import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class UtilidadesString {

	public static void main(String[] args) {

//	//EJERCICIO 1
		System.out.println("EJERCICIO 1");
		String str = new String("Me gusta programar en Java.");
		System.out.println(str);
		//A
		System.out.println("Largo : " + str.length());
		//B
		System.out.println("Posición 5 : " + str.charAt(5));
		//C
		System.out.println("Sub-cadena 1 : " + str.substring(21));
		//D
		System.out.println("Sub-cadena 2 : " + str.substring(8,16));
		//E
		String str2 = str.concat("(Casi siempre)");
		System.out.println("Concatenación : " + str2);
		//F
		System.out.println("Posición 'Casi' : " + str2.indexOf("Casi"));
		//G
		System.out.println("Mayúscula : " + str.toUpperCase());
		//H
		System.out.println("Comparación (teniendo en cuenta mayúsculas) : " + str.equals(str.toUpperCase()));
		System.out.println("Comparación (sin tener en cuenta mayúsculas) : " + str.equalsIgnoreCase(str.toUpperCase()) + "\n");
	
	
	//EJERCICIO 2
		String frase = "Esto es una PRUEBA";
		System.out.println("EJERCICIO 2");
		System.out.println("Frase '" + frase + "' invertida : " + invertirCadena(frase)+ "\n");

	
	//EJERCICIO 3
		StringBuilder strB = new StringBuilder("Hello Java world.");
		System.out.println("EJERCICIO 3");
		//1
		System.out.println("Delete : " + strB.delete(6,10));
		//2
		System.out.println("Insert : " + strB.insert(6, "my"));
		//3
		System.out.println("Append : " + strB.append("I am Luis"));
		//4
		System.out.println("Replace : " + strB.replace(20, 24, "Rodriguez"));
		//5
		StringBuilder strB2 = new StringBuilder(strB.substring(0,5));
		System.out.println("Reverse : " + strB2.reverse());
		System.out.println(strB.insert(0,strB2) + "\n");
		
	//EJERCICIO 4
		System.out.println("EJERCICIO 4");
		//4.1
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/M/W/d E");
		String patronesFecha = sdf.format(new Date());
		System.out.println("4.1 -- Patrones de fecha");
		System.out.println("fecha : " + patronesFecha);
		System.out.println("patrón: yyyy/M/W/d E");
		System.out.println("Año: y, Mes: M, Semana: W, Dia: d, Dia de la semana : E\n");

		//DATE SIN FORMATO
		Date date41 = new Date();
		System.out.println("Objeto Date sin formato : ( " + date41 + " ) Muestra todos los patrones de tiempo y fecha\n");
		
		//4.2
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "16-04-2025 10:20:56";
		Date date42 = null;
		try {
			date42 = sdf2.parse(dateInString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("4.2 -- "+date42+"\n");
		
		//4.3
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat dateFormatFecha = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat dateFormatHora = new SimpleDateFormat("HH:mm:ss");
		Date date43 = new Date();
		
		System.out.println("4.3 -- "+ dateFormat.format(date43));
		System.out.println("Solo fecha : " + dateFormatFecha.format(date43));
		System.out.println("Solo hora : " + dateFormatHora.format(date43) + "\n");
		
	//EJERCICIO 5
		System.out.println("4.4 -- Gregorian Calendar");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
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
		
		System.out.println(sdf3.format(calendar.getTime()));
		
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
		System.out.println("Si se utiliza el constuctor por defecto para un objeto GregorianCalendar se utilizará la fecha y hora de durante la compilación\n");
		
	//EJERCICIO 5
		System.out.println("EJERCICIO 5");
		String sFechas = "21/04/2015, 12/06/1955, 26/01/1985, 18/06/1936, 12/10/1492, 25/12/2000, 02/05/2018, 13/10/1975, 01/03/1991, 20/10/1972, 17/04/2020";
		Date[] vFechas = new Date[11];
		try {
			generarFechas(sFechas,vFechas);
			ordenarFechas(vFechas);
			escribirFechas(vFechas);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	//GENERAR DATES DESDE STRING
	public static void generarFechas(String sFechas, Date[] vFechas) throws ParseException {
		SimpleDateFormat formatoOriginal = new SimpleDateFormat("dd/MM/yyyy");
		for(int i = 0; i < vFechas.length; i++) {
			vFechas[i] = formatoOriginal.parse(sFechas.substring(i*12, (i*12) + 10));
		}
	}
	//ORDENAR DATES DE ARRAY
	public static void ordenarFechas(Date[] vFechas) {
		Date aux = new Date();
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
	//ESCRIBIR DATES DE ARRAY
	public static void escribirFechas(Date[] vFechas) {
		SimpleDateFormat formatoNuevo = new SimpleDateFormat("yyyy/MM/dd");
		for(int i = 0; i < vFechas.length; i++) {
			System.out.println(formatoNuevo.format(vFechas[i]));
		}
	}	
	
	//INVERTIR STRING
	public static String invertirCadena(String cadena) {
		char[] cadenaInvertida = cadena.toCharArray();
		char[] texto = new char[cadenaInvertida.length];
		
		for(int i = 0; i < cadenaInvertida.length; i++) {
			texto[i] =  cadenaInvertida[cadenaInvertida.length - i - 1];
		}
		return String.valueOf(texto);
	}
	
}





