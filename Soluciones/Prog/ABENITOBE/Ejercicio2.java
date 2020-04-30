import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Ejercicio2 {

	public static void separador (String sFechas, Date [] vFechas) throws ParseException{
		String [] vAuxiliar = sFechas.split(",");
			for (int i = 0; i < vAuxiliar.length; i++){
	
			SimpleDateFormat sdf = new SimpleDateFormat ("dd/M/yyyy");
			String dateInString = vAuxiliar[i];
			Date z = sdf.parse(dateInString);
			vFechas[i] = z;
			}
	}
	
	public static void ordenador (Date [] vFechas){
		Date aux2 = new Date();
		     
			for (int i = 0; i < vFechas.length - 1; i++) {

		         for (int j = 0; j < vFechas.length - i - 1; j++) {
		             
		        	 if (vFechas[j + 1].before(vFechas[j])) {
		                 aux2 = vFechas[j + 1];
		                 vFechas[j + 1] = vFechas[j];
		                 vFechas[j] = aux2;
		             }
		         }
			}
	}
		
	public static void cambiarFormato (Date [] vFechas){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	     
	    	for(int z = 0; z < vFechas.length; z++){
	    		String date = sdf.format(vFechas[z]);
	    		System.out.println("Fecha " + Integer.toString(z + 1) + ":\t" + date);
			}
	}

	
	public static void main(String[] args) throws ParseException {
		System.out.println("Ejercicio 1:");
		String caracteres = "Me gusta programar en Java.";
		System.out.println("Apartado A");//Obtener la longitud de la cadena de caracteres.
		System.out.println(caracteres.length());
		
		System.out.println("Apartado B");//Obtener el carácter que ocupa la posición 5a.
		System.out.println(caracteres.charAt(5));
		
		System.out.println("Apartado C");//Obtener la sub-cadena desde la posición 21 hasta el final.
		System.out.println(caracteres.substring(21));
		
		System.out.println("Apartado D");//Obtener la sub-cadena indicada por los índices 8 y 16.
		System.out.println(caracteres.substring(8, 16));
		
		System.out.println("Apartado E");//Muestra por pantalla el resultado de concatenar la cadena “ (Casi siempre)”.
		System.out.println(caracteres.concat(" Casi siempre."));
		
		System.out.println("Apartado F");//En la nueva cadena de caracteres obtenida en E), recuperar la posición de la cadena “Casi”.
		System.out.println(caracteres.concat(" Casi siempre.").indexOf("Casi"));
		
		System.out.println("Apartado G");//Muestra por pantalla la cadena de caracteres original en mayúsculas.
		System.out.println(caracteres.toUpperCase());
		
		System.out.println("Apartado H");/*Compara la cadena de caracteres original con la cadena de caracteres en mayúsculas. Primero
		teniendo en cuenta la diferencia entre mayúsculas y minúsculas y por último ignorando esta
		diferencia.*/
		System.out.println(caracteres.equals(caracteres.toUpperCase()));
		System.out.println(caracteres.toUpperCase().equals(caracteres));
		
		System.out.println(caracteres.equalsIgnoreCase(caracteres.toUpperCase()));
		System.out.println(caracteres.toUpperCase().equalsIgnoreCase(caracteres));
		System.out.print("\n");
		
		
		System.out.println("Ejercicio 2:");
		//Desarrollar una función que haga el reverso de una cadena de caracteres que se suministre por parámetro.
		String cadena = "Esto es una PRUEBA.";
		StringBuilder invertir = new StringBuilder(cadena);
		
		System.out.println(invertir.reverse());
		System.out.print("\n");
		
		
		System.out.println("Ejercicio 3:");
		String cadenaCaracteres = "Hello Java world.";
		
		System.out.println("Apartado 1");//Eliminar la cadena de caracteres “ Java” y mostrar la cadena de caracteres del StringBuilder resultante.
		StringBuilder frase = new StringBuilder(cadenaCaracteres);
		
		System.out.println(frase.delete(6, 10));
		
		System.out.println("Apartado 2");/*Sobre el StringBuilder resultante del apartado anterior insertar la cadena “my ” en la posición 6.
		Mostrar la cadena de caracteres resultante.*/
		System.out.println(frase.insert(6, new StringBuilder("my")));
		
		System.out.println("Apartado 3");/*Añadir al final de la cadena de caracteres del StringBuilder resultante del apartado 2 la cadena de
		caracteres: “ I am xxxx.”. Donde xxxx es mi nombre de pila. Mostrar la cadena de caracteres resultante.*/
		System.out.println(frase.append(" I am Alejandro"));
		
		System.out.println("Apartado 4");/*En el StringBuilder del apartado anterior reemplazar vuestro nombre de pila por vuestro primer
		apellido.*/
		System.out.println(frase.replace(20, 30, " Benito"));
		
		System.out.println("Apartado 5");/*Obtener la subcadena entre las posiciones 0 y 5, creando un nuevo StringBuilder con ella. Hacer el
		reverso de este nuevo substring y añadela de nuevo al StringBuilder del apartado 4 a partir de la
		posición 0. Mostrar la cadena de caracteres resultante.*/
		StringBuilder nuevo = new StringBuilder (frase.substring(0, 5));
		nuevo = nuevo.reverse();
		frase = frase.delete(0, 5);
		
		System.out.println(frase.insert(0, nuevo));
		System.out.print("\n");
		
		System.out.println("Ejercicio 4.1");
		/*
		patrón --> "dd/M/yyyy"
		d --> dia
		m --> mes
		y --> año
		Además podemos incluir:
		W --> semana
		E --> día de la semana
		*/
		SimpleDateFormat patron = new SimpleDateFormat("yyyy/M/d");
		String fechas = patron.format(new Date());
		
		System.out.println(fechas);

		//¿Qué se muestra por pantalla con un objeto Date sin formato?
		Date sinFormato = new Date();
		
		System.out.println(sinFormato);
		
		System.out.println("Ejercicio 4.2");
		//Daria una excepcion. Con un try catch.
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "16-04-2025 10:20:56";
		try {
		Date date = sdf.parse(dateInString);
		System.out.println(date);
		}catch (Exception e){
			System.out.println("Fecha introducida escrita incorrectamente");
		}
		
		System.out.println("Ejercicio 4.3");
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date fecha = new Date();
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
		
		System.out.println(formato.format(fecha));
		System.out.println("Solo fecha : " + formatoFecha.format(fecha));
		System.out.println("Solo hora : " + formatoHora.format(fecha));
		
		System.out.println("Ejercicio 4.4");
		SimpleDateFormat calendario = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
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
		
		System.out.println(calendario.format(calendar.getTime()));
		
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
		//Muestra la hora local
		System.out.print("\n");
		
		System.out.println("Ejercicio 5");
		String sFechas = "21/04/2015, 12/06/1955, 26/01/1985, 18/06/1936, 12/10/1492, 25/12/2000, 02/05/2018, "
				+ "13/10/1975, 01/03/1991, 20/10/1972, 17/04/2020";
		Date [] vFechas = new Date [11];
		
		separador(sFechas, vFechas);
		ordenador(vFechas);
		cambiarFormato(vFechas);
	}
}