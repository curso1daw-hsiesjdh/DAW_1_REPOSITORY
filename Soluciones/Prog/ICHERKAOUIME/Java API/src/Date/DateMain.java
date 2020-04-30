package Date;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
 * Formatos para SimpleDateFormat
 *
 *  yyyy.MM.dd G 'at' HH:mm:ss z    año|mes|dia | era | 'a las' | hora:minuto:segundo | franja
 *  EEE, MMM d, ''yy                Tres primeras letras del dia de la semana, Tres primeras letras del mes | dia, Dos ultimas cifras de año
 *  h:mm a                          hora:minuto | am/pm
 *  K:mm a, z                       hora (0-11):minuto | am/pm, franja horaria
 **/

public class DateMain {

    /**
     * Metodo para verificar si la fecha introducida encaja con el formato predeterminado
     * @param s     fecha
     * @param sdf   formato de fecha
     * @return      fecha
     * @throws ParseException   Excepcion
     */
    public static Date match(String s, SimpleDateFormat sdf) throws ParseException {
        Date date = new Date();
        StringBuilder sb = new StringBuilder(s);
        if (!sb.substring(0,10).matches("\\d{2}-\\d{2}-\\d{4}")){
            if (!sb.substring(11,sb.length()).matches("\\d{2}:\\d{2}:\\d{2}")){
                throw new ParseException("El formato de fecha introducido no concuerda con el formato predeterminado " + sdf.toPattern(), 0);
            } else {
                sb.replace(0, sb.length(), s.replace("/", "-"));
                sb.replace(0, sb.length(), sb.toString().replace(".", "-"));
                date = sdf.parse(sb.toString());
            }
        }if (s.matches("\\d{2}-\\d{2}-\\d{4} \\d{2}:\\d{2}:\\d{2}")){
            date = sdf.parse(sb.toString());
        }
        return date;
    }

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(new Date());

        // Objeto Date sin formato
        System.out.println("Ejercicio 1");
        System.out.println(s + "\n");

        // Cadena de caracteres sin formato adecuado
        sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        s = "06.05.2020 10:20:56";
        System.out.println("Ejercicio 2");
        try {
            System.out.println(sdf.format(match(s, sdf)) + "\n");
        }catch (ParseException e){
            System.err.println(e.getMessage());
        }

        // Fecha y hora actuales
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat day = new SimpleDateFormat("dd-M-yyyy");
        Date date = new Date();
        System.out.println("Ejercicio 3");
        System.out.println(time.format(date));
        System.out.println(day.format(date) + "\n");

        // Calendario
        sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        Calendar calendar = new GregorianCalendar();
        int year        = calendar.get(Calendar.YEAR);
        int month       = calendar.get(Calendar.MONTH);
        int dayOfMonth  = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek   = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear  = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        int hour        = calendar.get(Calendar.HOUR);
        int hourOfDay   = calendar.get(Calendar.HOUR_OF_DAY);
        int minute      = calendar.get(Calendar.MINUTE);
        int second      = calendar.get(Calendar.SECOND);
        int millisecond  = calendar.get(Calendar.MILLISECOND);

        System.out.println("Ejercicio 4");
        System.out.println(sdf.format(calendar.getTime()));
        System.out.println("year \t\t\t: " + year);
        System.out.println("month \t\t\t: " + month);
        System.out.println("dayOfMonth \t\t: " + dayOfMonth);
        System.out.println("dayOfWeek \t\t: " + dayOfWeek);
        System.out.println("weekOfYear \t\t: " + weekOfYear);
        System.out.println("weekOfMonth \t: " + weekOfMonth);

        System.out.println("hour \t\t\t: " + hour);
        System.out.println("hourOfDay \t\t: " + hourOfDay);
        System.out.println("minute \t\t\t: " + minute);
        System.out.println("second \t\t\t: " + second);
        System.out.println("millisecond \t: " + millisecond + "\n");

        // Ordenar fechas
        SimpleDateFormat oldFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
        String[] sFechas = {"21/04/2015", "12/06/1955", "26/01/1985", "18/06/1936", "12/10/1492", "25/12/2000", "02/05/2018", "13/10/1975", "01/03/1991", "20/10/1972", "17/04/2020"};
        Date[] vFechas = new Date[sFechas.length];

        System.out.println("Ejercicio 5");
        for (int i=0; i<sFechas.length; i++){
            vFechas[i] = oldFormat.parse(sFechas[i]);
            sFechas[i] = newFormat.format(vFechas[i]);
            vFechas[i] = newFormat.parse(sFechas[i]);
        }
        for (int i=0; i<vFechas.length-1; i++){
            Date aux;
            if(vFechas[i].after(vFechas[i+1])){
                aux = vFechas[i+1];
                vFechas[i+1] = vFechas[i];
                vFechas[i] = aux;
                i=-1;
            }
        }
        for (Date vFecha : vFechas) {
            System.out.println(newFormat.format(vFecha));
        }
    }
}
