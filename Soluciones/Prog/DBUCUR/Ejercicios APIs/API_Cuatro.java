import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class API_Cuatro {

	public static void main(String[] args) {
		// 4.1
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(new Date());
		System.out.println(date);
		//Se muestra fecha (dd/mm/aaaa) y hora (hh:mm) del momento en que pulsas 'Run'.
		//Podemos meter en el par�metro de 'SimpleDateFormat', entre comillas,
		//diferentes formatos, pudiendo mostrar solo fecha, s�lo hora, las dos cosas,
		//el a�o al principio, o final, etc...
		
		
		// 4.2
		
		SimpleDateFormat sdfDos = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String fecha = "5-01-2020 12:00:00"; //No coincide con el formato que establec�.
		Date fechaDos = new Date();
		try { //Para solucionarlo a�adimos una excepci�n 'ParseExcpetion', que ofrece Java.
			fechaDos= sdfDos.parse(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sdfDos.format(fechaDos));
		
		// 4.3
		
		// Creo fecha y la muestro para realizar lo dem�s.
		
		SimpleDateFormat sdfTres = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String fechaTres = sdfTres.format(new Date());
		System.out.println(fechaTres);
		
		//Muestro s�lamente fecha:
		
		sdfTres.applyPattern("yyyy/MM/dd");
		fechaTres = sdfTres.format(new Date());
		System.out.println("Muestro s�lamente fecha: "+fechaTres);
		
		//Muestro s�lamente hora:
		
		sdfTres.applyPattern("HH:mm:ss");
		fechaTres = sdfTres.format(new Date());
		System.out.println("Muestro s�lamente hora: " + fechaTres);
		
		//4.4
		
		//Al no pasarle datos tomar� fecha y hora del momento en que se pulsa 'Run'.
		
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
		
		System.out.println("A�o: " + year);
		System.out.println("Mes: " + month);
		System.out.println("D�a del mes: " + dayOfMonth);
		System.out.println("D�a de la semana: " + dayOfWeek);
		System.out.println("Semana del a�o: " + weekOfYear);
		System.out.println("Semana del mes: " + weekOfMonth);
		
		System.out.println("Hora: " + hour);
		System.out.println("Hora del d�a: " + hourOfDay);
		System.out.println("Minuto: " + minute);
		System.out.println("Segundo: " + second);
		System.out.println("Millisegundo: " + millisecond + "\n");	
	}
}