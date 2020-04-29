import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JavaEjercicios {
													// EJERCICIO 2
	public static void Invertir(String cadena) {
		System.out.println("EJERCICIO 2");
		System.out.println("________________________" + "\n");	
		StringBuilder stringBuilder = new StringBuilder(cadena);
		//Llamaremos al metodo reverse del StringBuilder y lo convertimos a cadena con toString
		String invertida = stringBuilder.reverse().toString();
		System.out.println("Cadena original: " + cadena);
		System.out.println("Cadena invertida: " + invertida);
		System.out.println("________________________" + "\n");	
	}
	
	
	public static void main(String []args) {
		Invertir("Me gusta programar en Java."); // Ejercicio 2

		
														// EJERCICIO 1
		System.out.println("EJERCICIO 1");
		System.out.println("________________________" + "\n");	
		// Ejercicio 1.A = 27
		System.out.println("Ejercicio 1.A");
		System.out.println("Me gusta programar en Java.".length());
		System.out.println("________________________"  +"\n");	
		// Ejercicio 1.B = s
		System.out.println("Ejercicio 1.B");
		System.out.println("Me gusta programar en Java.".charAt(5));
		System.out.println("________________________"  +"\n");
		// Ejercicio 1.C = Java.
		System.out.println("Ejercicio 1.C");
		System.out.println("Me gusta programar en Java.".substring(21));
		System.out.println("________________________"  +"\n");
		// Ejercicio 1.D = program
		System.out.println("Ejercicio 1.D");
		System.out.println("Me gusta programar en Java.".substring(8, 16));
		System.out.println("________________________"  +"\n");
		// Ejercicio 1.E = Me gusta programar en Java.(Casi siempre)
		System.out.println("Ejercicio 1.E");
		System.out.println("Me gusta programar en Java.".concat("(Casi siempre)"));
		System.out.println("________________________"  +"\n");
		// Ejercicio 1.F = 28
		System.out.println("Ejercicio 1.F");
		System.out.println("Me gusta programar en Java.(Casi siempre)".indexOf("Casi"));
		System.out.println("________________________"  +"\n");
		// Ejercicio 1.G = ME GUSTA PROGRAMAR EN JAVA.
		System.out.println("Ejercicio 1.G");
		String str = new String ("Me gusta programar en Java.");
		System.out.println(str.toUpperCase());
		System.out.println("________________________"  +"\n");
		 // Ejercicio 1.H = Teniendo en cuenta la diferencia false
		System.out.println("Ejercicio 1.H");
		String str_1 = new String ("ME GUSTA PROGRAMAR EN JAVA.");
		System.out.println(str.equals(str_1));
		 // Ejercicio 1.H = Teniendo en cuenta la diferencia true
		System.out.println(str_1.equals("ME GUSTA PROGRAMAR EN JAVA."));
		 // Ejercicio 1.H = Sin tener en cuenta la diferencia true
		System.out.println(str.equalsIgnoreCase(str_1));
		System.out.println(str_1.equalsIgnoreCase("ME GUSTA PROGRAMAR EN JAVA."));
		System.out.println("________________________" +"\n");	

		
													// EJERCICIO 3
		System.out.println("EJERCICIO 3");
		System.out.println("________________________" + "\n");	
		// Ejercicio 3.1 = Hello  world.
		System.out.println("Ejercicio 3.1");
		StringBuilder strA = new StringBuilder("Hello Java world.");
		System.out.println(strA.delete(6, 10));
		System.out.println("________________________" +"\n");	
		// Ejercicio 3.2 = Hello my world.
		System.out.println("Ejercicio 3.2");
		StringBuilder strB = new StringBuilder("Hello  world.");
		System.out.println(strB.insert(6, new StringBuilder("my")));
		System.out.println("________________________" +"\n");	
		// Ejercicio 3.3 = Hello my world. I am Christian.
		System.out.println("Ejercicio 3.3");
		StringBuilder strC= new StringBuilder();
		strC.append("Hello my world.");
		strC.append(" I am Christian.");
		System.out.println(strC);
		System.out.println("________________________" +"\n");	
		// Ejercicio 3.4 = Hello my world. I am Cosa.
		System.out.println("Ejercicio 3.4");
		System.out.println(strC.replace(21, 30, "Cosa"));
		System.out.println("________________________" +"\n");	
		// Ejercicio 3.5 = Hello my world. I am Cosa.
		System.out.println("Ejercicio 3.5");
		StringBuilder strC1 = new StringBuilder(strC.substring(0, 5));
		System.out.println("Reverse :" + strC1.reverse());
		System.out.println(strC.insert(0, strC1));
		System.out.println("________________________" +"\n");	
		
													// EJERCICIO 4
		
		System.out.println("EJERCICIO 4");
		System.out.println("________________________" +"\n");
		//Ejercicio 4.1
		System.out.println("Ejercicio 4.1");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/M/W/d E");
		String fecha = sdf.format(new Date());
		System.out.println("La fecha de hoy es: " + fecha);
		System.out.println("________________________" +"\n");
		System.out.println("El patron que sigue es: yyyy/M/W/d E");
		System.out.println("________________________" +"\n");
		System.out.println("Muestra el año, el mes, la semana, el numero de dia, y el nombre del dia");
		System.out.println("________________________" +"\n");
		
		//¿Qué se muestra por pantalla con un objeto Datesin formato?
		Date datewithoutformat = new Date();
		System.out.println("Un objeto Date sin formato muestra: " + datewithoutformat);
		System.out.println("________________________" +"\n");
		
		//Ejercicio 4.2 - Como solucionarlo
		System.out.println("Ejercicio 4.2");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "16-04-2025 10:20:56";
		Date dateprofe = null;
		try {
			dateprofe = sdf1.parse(dateInString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(dateprofe);
		System.out.println("________________________" +"\n");
		
		//Ejercicio 4.3
		System.out.println("Ejercicio 4.3");
		SimpleDateFormat dateFormatFecha = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat dateFormatHora = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		
		System.out.println("Mostrar la fecha: " + dateFormatFecha.format(date));
		System.out.println("Mostrar la hora: " + dateFormatHora.format(date));
		System.out.println("________________________" +"\n");
		
		//Ejercicio 4.4
		System.out.println("Ejercicio 4.4");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);  //JAN = 0, DEC = 1
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
		
		int hour = calendar.get(Calendar.HOUR); //RELOJ DE 12 HORAS
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);  //RELOJ DE 24 HORAS
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
		System.out.println("millisecond \t:" + millisecond + "\n");
		System.out.println("Al utilizarse el constructor por defecto, nos devuelve la fecha y hora en la que se ha compilado.");
		System.out.println("________________________" +"\n");
		
		
												//EJERCICIO 5
		System.out.println("EJERCICIO 5");
		System.out.println("________________________" + "\n");	
		String sFechas = "21/04/2015, 12/06/1955, 26/01/1985, 18/06/1936, 12/10/1492, 25/12/2000, 02/05/2018, 13/10/1975, 01/03/1991, 20/10/1972, 17/04/2020";
		Date[] vFechas = new Date[11];
		try {
			generardorDates(sFechas, vFechas);
			ordenarFechas(vFechas);
			escritorFechas(vFechas);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void Invertir() {
		// TODO Auto-generated method stub
		
	}

	//Generados de dates a traves del String
	public static void generardorDates(String sFechas, Date[] vFechas) throws ParseException {
		SimpleDateFormat formatoOriginal = new SimpleDateFormat("dd/MM/yyyy");
		for(int i = 0; i < vFechas.length; i++) {
			vFechas[i] = formatoOriginal.parse(sFechas.substring(i*12, (i*12) + 10));
		}
	}
	//Funcion que ordena los dates del array
	public static void ordenarFechas(Date[] vFechas) {
		Date h = new Date();
		for(int i = 0; i < vFechas.length; i++) {
			for(int j = 0; j < vFechas.length; j++) {
				if(vFechas[i].after(vFechas[j])) {
					h = vFechas[i];
					vFechas[i] = vFechas[j];
					vFechas[j] = h;
				}
			}
		}
	}
	
	//Esta funcion va escribiendo los dates del array
	public static void escritorFechas(Date[] vFechas) {
		SimpleDateFormat cambioFormato = new SimpleDateFormat("yyyy/MM/dd");
		for(int i = 0; i < vFechas.length; i++) {
			System.out.println(cambioFormato.format(vFechas[i]));
		}
	}	
	
	//Esta funcion invierte los String
	public static String darleLaVuelta(String cadena) {
		char[] cadenaInvertidaAcabada = cadena.toCharArray();
		char[] resultado = new char[cadenaInvertidaAcabada.length];
		
		for(int i = 0; i < cadenaInvertidaAcabada.length; i++) {
			resultado[i] =  cadenaInvertidaAcabada[cadenaInvertidaAcabada.length - i - 1];
		}
		return String.valueOf(resultado);
	}	
}
	

	































