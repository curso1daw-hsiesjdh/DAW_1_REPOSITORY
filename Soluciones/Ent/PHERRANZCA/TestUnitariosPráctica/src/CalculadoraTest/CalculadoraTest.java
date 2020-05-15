package CalculadoraTest;

import Calculadora.*;
import Calculadora.Exceptions.BadOperatorException;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


class CalculadoraTest {
	
	@InjectMocks
	private Calculadora calculadora = new Calculadora();
	
	@Mock
	private Parseador parseador = new Parseador();
	
//	Como se puede observar, no sé muy bien cómo se utiliza Mockito. Sé que parseador es la dependencia, y
//	calculadora es dependiente de parseador. Por eso sé qué @Mock y @InjectMocks están bien puestos.
//	Pero no sé más.
//	
//	Si descomento estas líneas, no corre el test unitario...
//	
//	@BeforeAll
//	public void inicilizaMocks() throws BadOperatorException {
//		MockitoAnnotations.initMocks(this);
//		
//		String operacion = "7 + 5";
//		
//		//Comportamientos predecibles del parseador
//		when(parseador.ObtenerPrimerOperando(operacion)).thenReturn(7);
//		when(parseador.ObtenerSegundoOperando(operacion)).thenReturn(5);
//		when(parseador.ObtenerOperador(operacion)).thenReturn("+");
//	}

	
	//MÉTODO SUMAR()
	@Test
	public void SumarTest() {
		//CASO 1
		Assertions.assertEquals(5, calculadora.Sumar(2, 3));
		System.out.println("\nEl resultado de sumar \"2 + 3\" = " + calculadora.Sumar(2, 3));
		//CASO 2
		Assertions.assertEquals(4, calculadora.Sumar(7, -3));
		System.out.println("El resultado de sumar \"7 + (-3)\" = " + calculadora.Sumar(7, -3));
		//CASO 3
		Assertions.assertEquals(-3, calculadora.Sumar(-7, 4));
		System.out.println("El resultado de sumar \"-7 + 4\" = " + calculadora.Sumar(-7, 4));
		//CASO 4
		Assertions.assertEquals(-13, calculadora.Sumar(-8, -5));
		System.out.println("El resultado de sumar \"-8 + (-5)\" = " + calculadora.Sumar(-8, -5));
	}
	
	//MÉTODO MULTIPLICAR()
	@Test
	public void MultiplicarTest() {
		//CASO 1
		Assertions.assertEquals(6, calculadora.Multiplicar(2, 3));
		System.out.println("\nEl resultado de multiplicar \"2 * 3\" = " + calculadora.Multiplicar(2, 3));
		//CASO 2
		Assertions.assertEquals(6, calculadora.Multiplicar(-2, -3));
		System.out.println("El resultado de multiplicar \"-2 * (-3)\" = " + calculadora.Multiplicar(-2, -3));
		//CASO 3
		Assertions.assertEquals(-216, calculadora.Multiplicar(-18, 12));
		System.out.println("El resultado de multiplicar \"-18 * 12\" = " + calculadora.Multiplicar(-18, 12));
	}
	
	//MÉTODO RESTAR()
	@Test
	public void RestarTest() {
		//CASO 1
		Assertions.assertEquals(-1, calculadora.Restar(2, 3));
		System.out.println("\nEl resultado de restar \"2 - 3\" = " + calculadora.Sumar(2, 3));
		//CASO 2
		Assertions.assertEquals(10, calculadora.Restar(7, -3));
		System.out.println("El resultado de restar \"7 - (-3)\" = " + calculadora.Sumar(7, -3));
		//CASO 3
		Assertions.assertEquals(-3, calculadora.Restar(-8, -5));
		System.out.println("El resultado de restar \"-8 - 5\" = " + calculadora.Sumar(-7, 4));
	}
	
	//MÉTODO DIVIDIR()
	@Test
	public void DividirTest() {
		//CASO 1
		Assertions.assertEquals(3, calculadora.Dividir(9, 3));
		System.out.println("\nEl resultado de dividir \"9 / 3\" = " + calculadora.Dividir(9, 3));
		//CASO 2
		Assertions.assertEquals(2.5, calculadora.Dividir(5,2), 0);
		System.out.println("El resultado de dividir \"5 / 2\" = " + calculadora.Dividir(5, 2));
		//CASO 3
		Assertions.assertEquals(2, calculadora.Dividir(-28, -14));
		System.out.println("El resultado de dividir \"-28 / -14\" = " + calculadora.Dividir(-28, -14));
		//CASO 3
		Assertions.assertEquals(-10.55, calculadora.Dividir(-570, 54), 0.01);
		System.out.println("El resultado de dividir \"-570 / 2\" = " + calculadora.Dividir(-570, 54));
	}
	
	//MÉTODO COMPUTAREXPRESION()
	@Test
	public void ComputarExpresionTest() throws BadOperatorException {
		//CASO 1
		Assertions.assertEquals(9, calculadora.ComputarExpresion("7 + 2"));
		System.out.println("\nEl resultado de la operación \"7 + 2\" = " + calculadora.ComputarExpresion("7 + 2"));
		//CASO 2
		Assertions.assertEquals(5, calculadora.ComputarExpresion("7 + (-2)"));
		System.out.println("El resultado de la operación \"7 + (-2)\" = " + calculadora.ComputarExpresion("7 + (-2)"));
		//CASO 3
		Assertions.assertEquals(-17, calculadora.ComputarExpresion("-8 - 9"));
		System.out.println("El resultado de la operación \"-8 - 9\" = " + calculadora.ComputarExpresion("-8 - 9"));
		//CASO 4
		Assertions.assertEquals(405, calculadora.ComputarExpresion("-27 * (-15)"));
		System.out.println("El resultado de la operación \"-27 + (-15)\" = " + calculadora.ComputarExpresion("-27 * (-15)"));
		//CASO 5
		Assertions.assertEquals(-1.52, calculadora.ComputarExpresion("-32/21"), 0.01);
		System.out.println("El resultado de la operación \"-32 + 21\" = " + calculadora.ComputarExpresion("-32 / 21"));
	}

}
