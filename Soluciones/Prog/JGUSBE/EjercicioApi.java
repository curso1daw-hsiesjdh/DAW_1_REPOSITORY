import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class EjercicioApi {

	//Ejercicios Api
	
	public static void main(String[]args) throws ParseException{
		
		//Ejercicio 1
		
		String Frase1="Me Gusta Programar en Java";
		
		System.out.println("A) Obtener la longitud de la cadena de caracteres: "+Frase1.length() );
		System.out.println("B) Obtener el carácter que ocupa la posición 5º: "+Frase1.charAt(5));
		System.out.println("C) Obtener la sub-cadena desde la posición 21 hasta el final: "+Frase1.substring(21));
		System.out.println("D) Obtener la sub-cadena indicada por los índices 8 y 16: "+Frase1.substring(8,16));
		System.out.println("E) Muestra por pantalla el resultado de concatenar la cadena “ (Casi siempre): "+Frase1.concat("(Casi Siempre)"));
		String Frase2=Frase1.concat("(Casi Siempre)");
		System.out.println("F) En la nueva cadena de caracteres obtenida en E), recuperar la posición de la cadena “Casi”: "+Frase2.indexOf("Casi"));
		System.out.println("G) Muestra por pantalla la cadena de caracteres original en mayúsculas: "+Frase1.toUpperCase());
		System.out.println("H) Compara la cadena de caracteres original con la cadena de caracteres en mayúsculas. Primero teniendo en cuenta la diferencia entre mayúsculas y minúsculas y por último ignorando esta diferencia:");
		System.out.println(Frase1.compareTo(Frase1.toUpperCase())+" | "+Frase1.compareToIgnoreCase(Frase1.toUpperCase()));
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Ejercicio 2: ");
			LaDelExorcista(Frase1);
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Ejercicio 3: ");
		StringBuilder Frase3 = new StringBuilder ("Hello Java World");
		System.out.println("A) Eliminar la cadena de caracteres “ Java” y mostrar la cadena de caracteres del StringBuilder resultante: "+Frase3.delete(6,11));
		System.out.println("B) Sobre el StringBuilder resultante del apartado anterior insertar la cadena “my ” en la posición 6. Mostrar la cadena de caracteres resultante: "+Frase3.insert(6,new StringBuilder("my ")));
		System.out.println("C) Añadir al final de la cadena de caracteres del StringBuilder resultante del apartado 2 la cadena de caracteres: “ I am xxxx.”. Donde xxxx es mi nombre de pila. Mostrar la cadena de caracteres resultante: "+Frase3.insert(14, new StringBuilder(" i am Javier")));
		System.out.println("D) En el StringBuilder del apartado anterior reemplazar vuestro nombre de pila por vuestro primer apellido: "+Frase3.replace(20,27, "Gus"));
		StringBuilder Frase4 = new StringBuilder(Frase3.substring(0,5));
		Frase4.reverse();
		System.out.println("E) Obtener la subcadena entre las posiciones 0 y 5, creando un nuevo StringBuilder con ella. Hacer el reverso de este nuevo substring y añadela de nuevo al StringBuilder del apartado 4 a partir de la posición 0. Mostrar la cadena de caracteres resultante: "+Frase3.insert(0, Frase4+" "));
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("4.2:");
		SimpleDateFormat Formato = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		 String dateInString = "16-04-2025 10:20:56";
		 Date date = Formato.parse(dateInString);
		 System.out.println(date);
		System.out.println("4.3:");
		
		System.out.println("Solo muestra la fecha: ");
		SimpleDateFormat Formato1 = new SimpleDateFormat("dd-MM-yyyy");
		Date fecha = new Date();
		System.out.println(Formato1.format(fecha)); 
		
		System.out.println("Solo muestra la hora: ");
		SimpleDateFormat Formato2 = new SimpleDateFormat("HH:mm:ss");
		Date hora = new Date();
		System.out.println(Formato2.format(hora));
		mostrarArray();
	}
	
	//Ejercicio 2
	
	/*Desarrollar una función que haga el reverso de una cadena de caracteres que se suministre por parámetro.
	Investiga que función de la API String (no explicada aquí) podría ser más útil para tal cometido.*/
	public static void LaDelExorcista(String Frase){
		
		for(int posicion=Frase.length()-1;0<=posicion;posicion--){
			
		  System.out.print(Frase.charAt(posicion));
			
		}
		
	}
		
		
	//Ejercicio 4
		
/*
 	4.1: Visita la API SimpleDateFormat y haz un pequeño resumen de los patrones de los formatos de las fechas. ¿Qué se muestra por pantalla con un objeto Date sin formato? 
 	Letter  Date or Time Component	Presentation	Examples
	G	Era designator	Text	AD
	y	Year	Year	1996; 96
	Y	Week year	Year	2009; 09
	M	Month in year	Month	July; Jul; 07
	w	Week in year	Number	27
	W	Week in month	Number	2
	D	Day in year	Number	189
	d	Day in month	Number	10
	F	Day of week in month	Number	2
	E	Day name in week	Text	Tuesday; Tue
	u	Day number of week (1 = Monday, ..., 7 = Sunday)	Number	1
	a	Am/pm marker	Text	PM
	H	Hour in day (0-23)	Number	0
	k	Hour in day (1-24)	Number	24
	K	Hour in am/pm (0-11)	Number	0
	h	Hour in am/pm (1-12)	Number	12
	m	Minute in hour	Number	30
	s	Second in minute	Number	55
	S	Millisecond	Number	978
	z	Time zone	General time zone	Pacific Standard Time; PST; GMT-08:00
	Z	Time zone	RFC 822 time zone	-0800
	X	Time zone	ISO 8601 time zone	-08; -0800; -08:00
	
	Si creo un objeto SimpleDateFormat pone la hora y dia que es(Año,mes,dia,hora y minutos)
	(SimpleDateFormat()
	Constructs a SimpleDateFormat using the default pattern and date format symbols for the default locale.)

	4.2:¿Qué pasa si el contenido de la cadena de caracteres no es una fecha o no coincide con el formato especificado? ¿Cómo solucionarlo? Implementa la solución para el código del ejemplo 2. 
	
	Si lo que metemos dentro no es una fecha o no coincide con el formato especificado salta la excepcion illegalArgumentException, que basicamente se soluciona introduciendo el formato que necesites
	(no entiendo, el ejemplo 2 va bien).
	
	4.4: si usas el valor predeterminado de GregorianCalendar se pone la fecha y hora local.
	*/
		
	 
	public static Date[] cambiarFormato() {
		
		String sFechas= "21/04/2015, 12/06/1955, 26/01/1985, 18/06/1936, 12/10/1492, 25/12/2000, 02/05/2018, 13/10/1975, 01/03/1991, 20/10/1972, 17/04/2020";
		String sFechas2=sFechas.trim();
		String[]svFechas=sFechas2.split(", ");
		Date[] vFechas= new Date[svFechas.length];
		SimpleDateFormat Formato = new SimpleDateFormat("dd/MM/yyyy");
		
		for(int a=0;a<svFechas.length;a++){
			
			try {
			
				vFechas[a]=Formato.parse(svFechas[a]);
			
			} catch (ParseException exception) {
				
				exception.printStackTrace();
			
			}
		}
		
		return vFechas;
	}
	
	public static Date[] ordenar (Date[] vFechas) {
		
		Date Aux;
		
		for (int a=0; vFechas.length>a-1 ; a++) {
			
			for (int b=0; vFechas.length-1>b ; b++) {
				
				if (vFechas[b].after(vFechas[b+1])) {
					
					Aux=vFechas[b+1];
					vFechas[b+1]=vFechas[b];
					vFechas[b]=Aux;
					
				}
			}
		}
		return vFechas;
	}
	
	public static void mostrarArray () {
		
		Date [] vFechas=new Date [ordenar(cambiarFormato()).length];
		SimpleDateFormat Formato = new SimpleDateFormat("dd/MM/yyyy");
		
		for (int a=0; vFechas.length>a;a++) {
			vFechas[a]=ordenar(cambiarFormato())[a];
			System.out.println("Numero "+(a+1)+"º :"+Formato.format(vFechas[a]));
		
		}
	}
    
}
