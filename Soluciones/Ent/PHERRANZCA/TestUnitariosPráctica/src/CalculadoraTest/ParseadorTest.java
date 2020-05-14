package CalculadoraTest;

import Calculadora.Calculadora;
import Calculadora.Parseador;
import Calculadora.Exceptions.BadOperatorException;

import static org.mockito.Mockito.when;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


class ParseadorTest {
	
	@InjectMocks
	private static Calculadora calculadora;
	
	@Mock
	private static Parseador parseador;
	
	@BeforeEach
	public void inicilizaMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@BeforeAll
	public static void prepareTestCase() {
		calculadora = new Calculadora();
		parseador = new Parseador();
	}
	
	public void obtenerResultadoTest() throws BadOperatorException {
		
		String operacion = "2-14"; // El resultado esperado es -12
		
		// Simulación de la invocación de los métodos del objeto mockeado.
		when(parseador.ObtenerPrimerOperando(operacion)).thenReturn(2);
		when(parseador.ObtenerSegundoOperando(operacion)).thenReturn(14);
		when(parseador.ObtenerOperador(operacion)).thenReturn("-");

		// Test de ComputarExpresion()
		double resultado = calculadora.ComputarExpresion(operacion);
		Assertions.assertEquals(14, resultado);
		
		// Test de ObtenerPrimerOperando()
		int operando1 = parseador.ObtenerPrimerOperando(operacion);
		Assertions.assertEquals(2, operando1);
		
		// Test de ObtenerPrimerOperando()
		int operando2 = parseador.ObtenerSegundoOperando(operacion);
		Assertions.assertEquals(14, operando2);
		
	}


}
