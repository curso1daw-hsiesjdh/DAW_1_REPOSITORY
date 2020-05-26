
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Exception.BadOperatorException;

class CalculadoraTest {
    Calculadora cal = new Calculadora();
    @BeforeEach
    void setUp() {
        System.out.println("Tests de la calse Calculadora");
    }

    @Test
    void sumar() {
        Integer valorEsperado =-35;
        Integer resultado = cal.sumar(-30,-5);
        System.out.println(resultado);
        assertEquals(valorEsperado, resultado);
    }

    @Test
    void restar() {
        Integer valorEsperado =1458;
        Integer resultado = cal.restar(-2000,-3458);
        System.out.println(resultado);
        assertEquals(valorEsperado, resultado);
    }

    @Test
    void multiplicar() {
        Integer valorEsperado =-91;
        Integer resultado = cal.multiplicar(7,-13);
        System.out.println(resultado);
        assertEquals(valorEsperado, resultado);
    }

    @Test
    void dividir() {
        Double valorEsperado =-0.0;
        Double resultado = cal.dividir(0,-97);
        System.out.println(resultado);
        assertEquals(valorEsperado, resultado);

    }

    @Test
    void computarExpresion(){
        try {
            Double valorEsperado = 48.0;
            Double resultado = cal.computarExpresion("-8 * -6");
            System.out.println(resultado);
            assertEquals(valorEsperado, resultado);
        }catch (BadOperatorException e){
            System.err.println(e.getMessage());
        }
    }
}