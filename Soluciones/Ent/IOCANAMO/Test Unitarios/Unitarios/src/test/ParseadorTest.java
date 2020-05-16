package test;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Principal.Parseador;
public class ParseadorTest {
 public static Parseador parseador;
 public static String expresion;
 
 @BeforeAll
 public static void prepareTestCase() {
	 parseador = new Parseador();
 }
 

 public void obtenerPrimerOperando() {
	 expresion = "10 + 3 = 13";
	 
	 Integer resultado = parseador.obtenerPrimerOperando(expresion);
	 
	 Assert.assertEquals(10, resultado,0);
 }
 

 public void obtenerSegundoOperando() {
	 expresion = "10 + 3 = 13";
	 
	 Integer resultado = parseador.obtenerSegundoOperando(expresion);
	 
	 Assert.assertEquals(3, resultado,0);
 }
 
 @Test
 public void obtenerOperador() {
	 expresion = "10 / 3 = 13";
	
	 String operadorRetorno = parseador.obtenerOperador(expresion);
	 
	 Assert.assertEquals("/", operadorRetorno);
 }
}
