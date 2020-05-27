package test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import Programa.Calculadora;
public class restarTest {
	
	
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
		Integer resultado=Calculadora.restar(minuendo, sustraendo);
		
		Assert.assertEquals(-1, resultado,0);		
		
	}
	@Test
	public void restartest2 () 
	{
		Integer minuendo=7;
		Integer sustraendo=-3;
		Integer resultado=Calculadora.restar(minuendo, sustraendo);
		
		Assert.assertEquals(10, resultado,0);		
		
	}
	@Test
	public void restartest3 () 
	{
		Integer minuendo=-10;
		Integer sustraendo=-10;
		Integer resultado=Calculadora.restar(minuendo, sustraendo);
		
		Assert.assertEquals(0, resultado,0);		
		
	}
	
}
