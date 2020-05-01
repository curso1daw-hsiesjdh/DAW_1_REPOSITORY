package cuartoejercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjercicioCuatro {

	public static void main(String[] args) {
		System.out.println("Ejercicio 4.1\n" + 
				"Visita la API SimpleDateFormat y haz un pequeño resumen de los patrones de los formatos de las fechas.\n" + 
				"¿Qué se muestra por pantalla con un objeto Date sin formato? \n");
		System.out.println("Un objeto date sin formato mostrara la fecha y hora actual mas la zona horaria \n");
		
		System.out.println("Ejercicio 4.2\n" +
				"¿Qué pasa si el contenido de la cadena de caracteres no es una fecha o no coincide con el formato \n" + 
				"especificado? ¿Cómo solucionarlo? Implementa la solución para el código del ejemplo 2. \n");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

		try {
			String chernobyl = "26-04-1986 01:24:00";
			Date datechernobyl = sdf.parse(chernobyl);
			System.out.println(datechernobyl + "\n");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("Ejercicio 4.3\n" + "Modifica el código del ejemplo 3 para mostrar sólo la fecha. Ahora muestra sólo la hora. \n");
		Date date = new Date();
		SimpleDateFormat Fecha = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat Hora = new SimpleDateFormat("HH:mm:ss");
		System.out.println("La fecha es: " + Fecha.format(date));
		System.out.println("La hora es: " + Hora.format(date) + "\n");
		
		System.out.println("Ejercicio 4.4 \n" + 
				"Comprueba la salida del código anterior en caso de que el GregorianCalendar calendar se crease sin \n" + 
				"parámetros, es decir, si se usa el constructor por defecto de GregorianCalendar para la variable calendar. \n");
		System.out.println("Al no pasarle naday dejar el constructor por defecto nos devolvera la fecha actual de nuestro ordenador, sera la fecha que se compila \n");
		

		}
		
	}

	
		
	


