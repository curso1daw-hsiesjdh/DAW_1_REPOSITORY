	import static org.junit.Assert.*;

	public class CalculadoraT {
		CalculadoraReal calc = new CalculadoraReal();
		
		
		public void sumaTest() {
			int esperado = 4;
			int resultado = calc.sumar(7, -3);
			assertEquals(esperado, resultado);
		}
		
		private int sumar(int i, int j) {
			// TODO Auto-generated method stub
			return 0;
		}

		public void restaTest() {
			int esperado = 18;
			int resultado = calc.restar(15,-3);
			assertEquals(esperado, resultado);
		}
		
		private int restar(int i, int j) {
			// TODO Auto-generated method stub
			return 0;
		}

		public void multiplicarTest() {
			int esperado = -6;
			int resultado = calc.multiplicar(2,-3);
			assertEquals(esperado, resultado);
		}
		
		private int multiplicar(int i, int j) {
			// TODO Auto-generated method stub
			return 0;
		}

		public void dividirTest() {
			double esperado = 2;
			double resultado = calc.dividir(10, 5);
			assertEquals(esperado, resultado);
		}

		private double dividir(int i, int j) {
			// TODO Auto-generated method stub
			return 0;
		}

		private void assertEquals(double esperado, double resultado) {
			// TODO Auto-generated method stub
			
		}
		
	}

