package marielysAPIsJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EjercicioCuatro {

	public static void main(String[] args) {
		// 4.1=
		// Visita la API SimpleDateFormat y
		// haz un pequeño resumen de los patrones de los formatos de las fechas

		//¿Qué se muestra por pantalla con un objeto Date sin formato?
		// Respuesta: 28/4/20 17:27 (Es decir fecha y hora)
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(new Date());
		System.out.println(date);
		
		/*Resumen: 
		 * 
		 * La API SimpleDateFormat nos entrega unos patrone a fin de obtener
		 * un string con el formato de fecha que deseamos solo hay que tener
		 * en cuenta la sintaxis o patrones predefinidos:
		 * 
		 * Ejemplo: "yyMMddHHmm" == "yy/MM/dd HH:mm"
		 * 
		 * 
		 * Algunos ejemplos de los patrones de SimpleDateFormat son:
		 * "h:m a" = 12:08 p. m. (Hora y minutos más indicador)
		 * "K:mm a, z" = 2:46 p. m., CEST  Horas, minutos, indicador y se añade la zona horaria)
		 *  "yyyy/MMMMM/dd  hh:mm aaa" = 2020/abril/29  05:58 p. m. (**modificando el ejemplo de docs.oracle.com)
		 **/
		
		
		// 4.2=
		// ¿Qué pasa si el contenido de la cadena de caracteres no es una fecha 
		// o no coincide con el formato especificado? ¿Cómo solucionarlo? 
		
		// Ejemplo:
		
		SimpleDateFormat sdfDos = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String fecha = "16-04-2025 10:20:56";
		Date dateDos = new Date(); //me parece correcto dejar un valor por defecto en caso de que falle el parse();
		//¿Cómo solucionarlo? Respuesta: atajando la exepcion que lanza por defecto la utilidad parse()
		try {
			dateDos= sdfDos.parse(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sdfDos.format(dateDos));
		
		// 4.3=
		// modifica el codigo del ejemplo para mostrar solo la fecha y solo la hora
		
		// EJEMPLO:
		
		SimpleDateFormat sdfTres = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateTres = sdfTres.format(new Date());
		System.out.println(dateTres);
		
		//fecha:
		
		sdfTres.applyPattern("yyyy/MM/dd");
		dateTres = sdfTres.format(new Date());
		System.out.println("Sólo fecha= "+dateTres);
		
		//hora:
		
		sdfTres.applyPattern("HH:mm:ss");
		dateTres = sdfTres.format(new Date());
		System.out.println("Sólo h= "+dateTres);
		
		//4.4=
		//Comprueba la salida del codigo anteior en caso de que el GregorianCalendar se crease sin parametros:
		
		//Respuesta= al no pasar parametros al constructor todos los datos corresponden a la fecha actual en la que se ejecuta el ejercicio
		
		//Código del ejemplo:
		SimpleDateFormat sdfCuatro = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
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
		
		System.out.println(sdfCuatro.format(calendar.getTime()));
		
		System.out.println("year:" + year);
		System.out.println("month:" + month);
		System.out.println("dayOfMonth:" + dayOfMonth);
		System.out.println("dayOfWeek:" + dayOfWeek);
		System.out.println("weekOfYear:" + weekOfYear);
		System.out.println("weekOfMonth:" + weekOfMonth);
		
		System.out.println("hour:" + hour);
		System.out.println("hourOfDay:" + hourOfDay);
		System.out.println("minute:" + minute);
		System.out.println("second:" + second);
		System.out.println("millisecond:" + millisecond + "\n");	

	}

}
