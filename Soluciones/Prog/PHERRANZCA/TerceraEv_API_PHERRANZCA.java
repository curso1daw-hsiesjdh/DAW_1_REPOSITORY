import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TerceraEv_API_PHERRANZCA {
	
	public static void Ejercicio1(String str) {
		
		//1 A)
		System.out.println("EJERCICIO 1 A)");
		System.out.println(str.length());
		
		//1 B)
		System.out.println("\nEJERCICIO 1 B)");
		System.out.println(str.charAt(5));

		//1 C)
		System.out.println("\nEJERCICIO 1 C)");
		System.out.println(str.substring(21));
		
		//1 D)
		System.out.println("\nEJERCICIO 1 D)");
		System.out.println(str.substring(8, 16));
		
		//1 E)
		System.out.println("\nEJERCICIO 1 E)");
		String str2 = str.concat(" (Casi siempre)");
		System.out.println(str2);
		
		//1 F)
		System.out.println("\nEJERCICIO 1 F)");
		System.out.println(str2.indexOf("Casi"));
		
		//1 G)
		System.out.println("\nEJERCICIO 1 G)");
		String str3 = str.toUpperCase();
		System.out.println(str3);		
		
		//1 H)
		System.out.println("\nEJERCICIO 1 H)");
		System.out.println(str.compareTo(str3));
		System.out.println(str.compareToIgnoreCase(str3));
	}
	
	public static void Ejercicio2(String input) {
	
		System.out.println("\nEJERCICIO 2");
		String output = "";

		//Bucle para ir escribiendo la cadena input en la nueva cadena output , char a char empezando desde el final
		for (int i = input.length()-1; i >= 0; i--) {
			output = output + input.charAt(i);
	    }
	        
		System.out.println("Cadena original: " + input);
		System.out.println("Cadena al revés: " + output);
	}
	
	public static void Ejercicio3() {
		
		//1.
		System.out.println("\nEJERCICIO 3.1.");
		
		StringBuilder srtB = new StringBuilder("Hello Java World.");
		
		System.out.println(srtB);
		
		StringBuilder srtB2 = new StringBuilder(srtB.delete(5, 10));
		
		System.out.println(srtB2);		
		
		//2.
		System.out.println("\nEJERCICIO 3.2.");
		System.out.println(srtB2.insert(6, new StringBuilder("my ")));
		
		//3.
		System.out.println("\nEJERCICIO 3.3.");
		StringBuilder srtB3 = new StringBuilder(srtB2.append(" I am Pablo"));
		System.out.println(srtB3);
		
		//4. 		
		System.out.println("\nEJERCICIO 3.4.");
		StringBuilder srtB4 = new StringBuilder(srtB3.replace(21, 26, "Herranz"));
		System.out.println(srtB4);
		
		//5.
		System.out.println("\nEJERCICIO 3.5.");
		StringBuilder srtB5 = new StringBuilder(srtB4.substring(0,5));
		System.out.println(srtB5);
		
		srtB5.reverse();
		
		System.out.println(srtB4.insert(0, srtB5));
	}
	
	public static void Ejercicio4() throws ParseException {
		
		//1.	Visita la API SimpleDateFormat y haz un pequeño resumen de los patrones de los formatos de las fechas.
		//		¿Qué se muestra por pantalla con un objeto Date sin formato?
	
		//		Se muestra la fecha actual
		
		/*	
	  	Teniendo en cuenta que:
	  	
	  	y = año
	  	M = mes
	  	d = día del mes
	  	H = hora del día
	  	m = minutos
	  	s = segundos
	  	E = nombre del día de la semana
	  	G = BC ("Before Christ"), antes de Cristo, o AD ("Anno Domini"), después de Cristo
	  	z = zona horaria
	  	
	  	Lo normal es ver el formato fecha de esta manera (aunque hay muchas más formas):
	  	
	 	"yyyy.MM.dd G 'at' HH:mm:ss z"		: 2001.07.04 AD at 12:08:56 PDT
		"EEE, MMM d, ''yy"					: Wed, Jul 4, '01
		"yyyy.MMMMM.dd GGG hh:mm aaa"		: 2001.July.04 AD 12:08 PM
		 */
		
		System.out.println("\nEJERCICIO 4.1.");
		Date fecha = new Date();
		System.out.println("Lo que se muestra por pantalla es la fecha actual: " + fecha);
		
		//2.	¿Qué pasa si el contenido de la cadena de caracteres no es una fecha o no coincide con el formato especificado?
		//		¿Cómo solucionarlo? Implementa la solución para el código del ejemplo 2.
		
		System.out.println("\nEJERCICIO 4.2\nHabría que lanzar la excepción ParseException.");//Habría que lanzar la excepción ParseException
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "16-4-2025 10:20:56";
		Date date = sdf.parse(dateInString);
		System.out.println(date);
		
		
		
		//3.	Modifica el código del ejemplo 3 para mostrar sólo la fecha. Ahora muestra sólo la hora.
		
		System.out.println("\nEJERCICIO 4.3.");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date fecha3 = new Date();
		System.out.println(dateFormat.format(fecha3));
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("HH:mm:ss");
		Date fecha4 = new Date();
		System.out.println(dateFormat2.format(fecha4));
		
		//4.	Comprueba la salida del código anterior en caso de que el GregorianCalendar calendar se crease sin parámetros,
		//		es decir, si se usa el constructor por defecto de GregorianCalendar para la variable calendar.
		
		//Te muestra la información actual
		
		System.out.println("\nEJERCICIO 4.4.\nTe muestra la inforamación actual");	
		Calendar calendar = new GregorianCalendar();
		
		int year		= calendar.get(Calendar.YEAR);
		int month 		= calendar.get(Calendar.MONTH);
		int dayOfMonth	= calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek	= calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear	= calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth	= calendar.get(Calendar.WEEK_OF_MONTH);
		
		int hour		= calendar.get(Calendar.HOUR);
		int hourOfDay	= calendar.get(Calendar.HOUR_OF_DAY);
		int minute		= calendar.get(Calendar.MINUTE);
		int second		= calendar.get(Calendar.SECOND);
		int millisecond	= calendar.get(Calendar.MILLISECOND);
		
		System.out.println("year \t\t: " + year);
		System.out.println("month \t\t: " + month);
		System.out.println("dayOfMonth \t: " + dayOfMonth);
		System.out.println("dayOfWeek \t: " + dayOfWeek);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);
		
		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
		System.out.println("millisecond \t: " + millisecond);
	}
	
	public static void Ejercicio5(String sFechas) throws ParseException {
				
		System.out.println("\nEJERCICIO 5.");
		
		//Creamos un formato de fecha, y un array que separe cada fecha del String declarado en el main
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		String[] vFechas = sFechas.split(", ");
		
		System.out.print("Array de fechas sin ordenar: ");
		
		//Cambiamos "/" por "-" con la función "replaceChar()" e imprimimos para ver si se ha cambiado
		//Introducimos el array de fechas original (vFechas), y nos devolverá el array modificado (vFechas2)
		
		String[] vFechas2 = new String[11];
		replaceChar(vFechas, vFechas2, "/", "-");
		
		//Cambiamos el formato a las fechas del array vFechas2 de "dd-MM-yyyy" a "yyyy-MM-dd" con la función "reverseSplit()"
		
		reverseSplit(vFechas2);
		
		//Creamos array de Dates
		
		Date[] vDates = new Date[11]; 
		
		for(int i = 0; i < vFechas.length; i++) {
			vDates[i] = formato.parse(vFechas2[i]);
		}
		
		//Ahora ordenamos las fechas con la función "sortingDates()"
		
		sortingDates(vDates);
		
		//Volvemos a pasar Date a String, para ello creamos vFechas3
		
		String[] vFechas3 = new String[11];
		for(int i = 0; i < vDates.length; i++) {	
			vFechas3[i] = formato.format(vDates[i]);
		}
				
		//Imprimimos las fechas ordenadas
		
		System.out.print("\nArray de fechas ordenado: ");
		
		for(int i = 0; i < vFechas3.length; i++) {
			System.out.print(vFechas3[i] + " ");
		}
	}
	
	public static String[] replaceChar(String[] vInput, String[] vOutput, String ch1, String ch2) {
				
		for(int i = 0; i < vInput.length; i++) {	
			vOutput[i] = vInput[i].replaceAll(ch1, ch2);
			System.out.print(vOutput[i] + " ");
		}
		
		return vOutput;
	}
	
	public static String[] reverseSplit(String[] vInput) {
		
		for(int i = 0; i < vInput.length; i++) {	
			String[] vSplit = vInput[i].split("-");
			vInput[i] = vSplit[2].concat(vSplit[1]);
			vInput[i] = vInput[i].concat(vSplit[0]);
			
			//A partir de aquí, como ya hemos concatenado el split de la forma que hemos querido,
			//le volvemos a poner los guiones que separan cada parte del String en las posiciones 4 y 7,
			//para ello, usamos la función "addChar()"
			
			vInput[i] = addChar(vInput[i], '-', 4);
			vInput[i] = addChar(vInput[i], '-', 7);
		}
		
		return vInput;
	}
	
	public static Date[] sortingDates(Date[] vInput) {
		
		Date aux;
		for(int i = 0; i < vInput.length - 1; i++) {
			for(int j = i + 1; j < vInput.length; j++) {
				if(vInput[i].after(vInput[j])) {
					aux = vInput[i];
					vInput[i] = vInput[j];
					vInput[j] = aux;
				}
			}
		}
		return vInput;
	}
	
	public static String addChar(String str, char ch, int position) {
	    return str.substring(0, position) + ch + str.substring(position);
	}
	
	public static void main(String[] args) throws ParseException {
	
		/*EJERCICIO1
		Partiendo de la cadena de caracteres “Me gusta programar en Java.”, aplicar los métodos expuestos más arriba
		para:
		   A) Obtener la longitud de la cadena de caracteres.
		a
		B) Obtener el carácter que ocupa la posición 5 .
		C) Obtener la sub-cadena desde la posición 21 hasta el final.
		D) Obtener la sub-cadena indicada por los índices 8 y 16.
		E) Muestra por pantalla el resultado de concatenar la cadena “ (Casi siempre)”.
		F) En la nueva cadena de caracteres obtenida en E), recuperar la posición de la cadena “Casi”.
		G) Muestra por pantalla la cadena de caracteres original en mayúsculas.
		H) Compara la cadena de caracteres original con la cadena de caracteres en mayúsculas. Primero
		teniendo en cuenta la diferencia entre mayúsculas y minúsculas y por último ignorando esta diferencia.*/
		
		String str = new String("Me gusta programar en JAVA.");
		Ejercicio1(str);
		
		/*EJERCICIO 2
		Desarrollar una función que haga el reverso de una cadena de caracteres que se suministre por parámetro.
		Investiga que función de la API String (no explicada aquí) podría ser más útil para tal cometido.*/
		
		Ejercicio2("Desarrollo de Aplicaciones WEB");
		
		/*EJERCICIO 3
		Trabajando con el API de StringBuilder y partiendo de la cadena de caracteres “Hello Java world.”, realizar las siguientes operaciones:
		1. 	Eliminar la cadena de caracteres “ Java” y mostrar la cadena de caracteres del StringBuilder resultante.
		2. 	Sobre el StringBuilder resultante del apartado anterior insertar la cadena “my ” en la posición 6.
		   	Mostrar la cadena de caracteres resultante.
		3. 	Añadir al final de la cadena de caracteres del StringBuilder resultante del apartado 2 la cadena de caracteres:
			“ I am xxxx.”. Donde xxxx es mi nombre de pila. Mostrar la cadena de caracteres resultante.
		4. 	En el StringBuilder del apartado anterior reemplazar vuestro nombre de pila por vuestro primer apellido.
		5. 	Obtener la subcadena entre las posiciones 0 y 5, creando un nuevo StringBuilder con ella. Hacer el reverso de este nuevo
			substring y añadela de nuevo al StringBuilder del apartado 4 a partir de la posición 0. Mostrar la cadena de caracteres resultante.*/
		
		Ejercicio3();
		
		/*EJERCICIO 4
		(Enunciados y respuestas comentadas en la misma función)*/
		
		Ejercicio4();
		
		/*EJERCICIO 5
		Dada la cadena de caracteres sFechas, en el que se guardan fechas separadas por comas con el formato
		días/mes/año, generar un array vFechas en el que cada posición del array será un objeto de tipo Date
		con formato yyyy-MM-dd, con todas las fechas de sFechas. Dicho array deberá ser ordenado de manera ascendente.
		 
		sFechas = “21/04/2015, 12/06/1955, 26/01/1985, 18/06/1936, 12/10/1492, 25/12/2000, 02/05/2018, 13/10/1975,
		01/03/1991, 20/10/1972, 17/04/2020”*/
		
		String sFechas = new String("21/04/2015, 12/06/1955, 26/01/1985, 18/06/1936, 12/10/1492, 25/12/2000, 02/05/2018, 13/10/1975, 01/03/1991, 20/10/1972, 17/04/2020");
		Ejercicio5(sFechas);

	}
}