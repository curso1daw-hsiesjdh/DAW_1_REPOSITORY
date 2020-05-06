package com.jdh.daw.ed.test;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.jdh.daw.ed.EcuacionPrimerGrado;
import com.jdh.daw.ed.Parseador;
import com.jdh.daw.ed.exceptions.BadCoefficientException;

public class EcuacionPrimerGradoTest {
	
	@InjectMocks
	private EcuacionPrimerGrado eq = new EcuacionPrimerGrado();
	
	@Mock
	private Parseador parseador;
	
	@BeforeEach
	public void inicilizaMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void obtenerResultadoTest() throws BadCoefficientException {
		// inicialización o creación del contexto
		String ecuacion = "2x - 1 = 0"; // El resultado esperado es 0.5
		
		// Simulación de la invocación de los métodos del objeto mockeado.
		when(parseador.obtenerCoeficienteA(ecuacion)).thenReturn(2);
		when(parseador.obtenerCoeficienteB(ecuacion)).thenReturn(1);
		when(parseador.obtenerOperador(ecuacion)).thenReturn("-");

		// Invocación del método a testear
		double resultado = eq.obtenerResultado(ecuacion);

		// Compobación del valor esperado
		Assert.assertEquals(0.5, resultado, 0.0);
	}

}
