package test;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.junit.Assert;
import Principal.BadOperatorException;
import Principal.Calculadora;
public class CalculadoraTestDividir {

	@InjectMocks
	 public Calculadora c1 = new Calculadora();
	 
	 
	 @BeforeEach
	 public void initMocks() {
		MockitoAnnotations.initMocks(this);
	 }
	 
	 @Test
	 public void dividirCase1() { 
	     Integer dividendo = 9;
	     Integer divisor = 3;
		 
		 Double cociente;
		try {
			cociente = c1.dividir(dividendo, divisor);
			Assert.assertEquals(3.0, cociente,0);
		} catch (BadOperatorException e) {
			e.printStackTrace();
		}
		 
	 }
	 
	 @Test
	 public void dividirCase2() { 
	     Integer dividendo = 5;
	     Integer divisor = 2;
		 
		 Double cociente;
		try {
			cociente = c1.dividir(dividendo, divisor);
			Assert.assertEquals(2.5, cociente,0);
		} catch (BadOperatorException e) {
			e.printStackTrace();
		}
	 }
	 
	 @Test
	 public void dividirCase3() { 
	     Integer dividendo = 12;
	     Integer divisor = 0;
		 
		 Double cociente;
		try {
			cociente = c1.dividir(dividendo, divisor);
			Assert.fail("Se deberia lanzar BadOperatorException");
		} catch (BadOperatorException e) {
			e.printStackTrace();
		}
	 }
	 
	 @Test
	 public void dividirCase4() { 
	     Integer dividendo = -19;
	     Integer divisor = 4;
		 
		 Double cociente;
		try {
			cociente = c1.dividir(dividendo, divisor);
			Assert.assertEquals(-4.75, cociente,0);
		} catch (BadOperatorException e) {
			e.printStackTrace();
		}
	 }
}
