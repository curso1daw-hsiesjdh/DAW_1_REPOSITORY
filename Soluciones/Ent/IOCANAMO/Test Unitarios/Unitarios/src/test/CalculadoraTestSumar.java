package test;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.junit.Assert;
import Principal.Calculadora;


public class CalculadoraTestSumar {

 @InjectMocks
 public Calculadora c1 = new Calculadora();
 
 
 @BeforeEach
 public void initMocks() {
	MockitoAnnotations.initMocks(this);
 }
 
 @Test
 public void sumarCase1() { 
     Integer sumando1 = 2;
     Integer sumando2 = 3;
	 
	 Integer suma = c1.sumar(sumando1, sumando2);
	 
	 Assert.assertEquals(5, suma,0);
 }
 
@Test
 public void sumarCase2() {
     Integer sumando1 = 7;
     Integer sumando2 = -3;
     
     Integer suma = c1.sumar(sumando1, sumando2);
	 
	 Assert.assertEquals(4, suma,0);
 }
 
@Test
 public void sumarCase3() {
     Integer sumando1 = -3;
     Integer sumando2 = 1;
	 
	 Integer suma = c1.sumar(sumando1, sumando2);
	 
	 Assert.assertEquals(-2, suma,0);
 }
 
@Test
 public void sumarCase4() { 
     Integer sumando1 = -5;
     Integer sumando2 = -8;
	 
	 Integer suma = c1.sumar(sumando1, sumando2);
	 
	 Assert.assertEquals(-13, suma,0);
 }
 
}
