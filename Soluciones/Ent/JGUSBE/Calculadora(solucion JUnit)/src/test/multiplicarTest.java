package test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import Programa.Calculadora;
public class multiplicarTest {
	
	
	public static Calculadora Calculadora;
	
	@BeforeAll
	public static void prepareTestCase ()
	{
		Calculadora= new Calculadora();
	}
	
	@Test
	public void restartest1 () 
	{
		Integer minuendo=2;
		Integer sustraendo=3;
		Integer resultado=Calculadora.multiplicar(minuendo, sustraendo);
		
		Assert.assertEquals(6, resultado,0);		
		
	}
	@Test
	public void restartest2 () 
	{
		Integer multiplicando1=-2;
		Integer multiplicando2=-3;
		Integer resultado=Calculadora.multiplicar(multiplicando1, multiplicando2);
		
		Assert.assertEquals(6, resultado,0);		
		
	}
	@Test
	public void restartest3 () 
	{
		Integer multiplicando1=-10;
		Integer multiplicando2=-10;
		Integer resultado=Calculadora.multiplicar(multiplicando1, multiplicando2);
		
		Assert.assertEquals(100, resultado,0);		
		
	}
	
}
