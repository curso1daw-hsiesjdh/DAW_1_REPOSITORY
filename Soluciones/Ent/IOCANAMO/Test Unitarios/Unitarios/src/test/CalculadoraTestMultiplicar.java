package test;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.junit.Assert;
import Principal.Calculadora;

public class CalculadoraTestMultiplicar {

	 @InjectMocks
	 public Calculadora c1 = new Calculadora();
	 
	 
	 @BeforeEach
	 public void initMocks() {
		MockitoAnnotations.initMocks(this);
	 }
	 
	 @Test
	 public void multiplicarCase1() { 
	     Integer multiplicando1 = 2;
	     Integer multiplicando2 = 3;
		 
		 Integer multiplicacion = c1.multiplicar(multiplicando1, multiplicando2);
		 
		 Assert.assertEquals(6, multiplicacion,0);
	 }
	 
	 @Test
	 public void multiplicarCase2() { 
	     Integer multiplicando1 = -2;
	     Integer multiplicando2 = -3;
		 
		 Integer multiplicacion = c1.multiplicar(multiplicando1, multiplicando2);
		 
		 Assert.assertEquals(6, multiplicacion,0);
	 }
	 
	 @Test
	 public void multiplicarCase3() { 
	     Integer multiplicando1 = 8;
	     Integer multiplicando2 = -5;
		 
		 Integer multiplicacion = c1.multiplicar(multiplicando1, multiplicando2);
		 
		 Assert.assertEquals(-40, multiplicacion,0);
	 }
}
