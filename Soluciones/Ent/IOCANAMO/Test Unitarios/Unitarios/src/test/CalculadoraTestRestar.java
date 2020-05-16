package test;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.junit.Assert;
import Principal.Calculadora;

public class CalculadoraTestRestar {

	 @InjectMocks
	 public Calculadora c1 = new Calculadora();
	 
	 
	 @BeforeEach
	 public void initMocks() {
		MockitoAnnotations.initMocks(this);
	 }
	
	 @Test
	 public void restarCase1() {	 
		 Integer minuendo = 2;
		 Integer sustraendo = 3;
		 
		 Integer resto = c1.restar(minuendo, sustraendo);
		 
		 Assert.assertEquals(-1, resto,0);
	 }
	 
	 @Test
	 public void restarCase2() {	 
		 Integer minuendo = 7;
		 Integer sustraendo = -3;
		 
		 Integer resto = c1.restar(minuendo, sustraendo);
		 
		 Assert.assertEquals(10, resto,0);
	 }
	 
	 @Test
	 public void restarCase3() {	 
		 Integer minuendo = -12;
		 Integer sustraendo = -8;
		 
		 Integer resto = c1.restar(minuendo, sustraendo);
		 
		 Assert.assertEquals(-4, resto,0);
	 }
	 
}
