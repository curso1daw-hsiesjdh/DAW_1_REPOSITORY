package calculadoraProject.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import calculadoraProject.Parseador;

import calculadoraProject.BadOperatorException;

public class ParseadorTest {
	
	private static  Parseador parseador;
	private  String  problema;
	
	@BeforeClass
	public static void prepareTestCase() {
		
		parseador = new Parseador();
	}
	
	@Test
	public void ObtenerCoeficiente1Test1 (){
		
		problema =  "2+3";
		
		int resultado = parseador.primerOperando(problema);
		
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest1 () throws BadOperatorException {
		
		problema =  "2+3";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("+", resultado);
	}
	
	@Test
	public void obtenerCoefiente2Test1 (){
		
		problema =  "2+3";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(3, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test2 () {
		
		problema =  "7+-3";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(7, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest2 () throws BadOperatorException{
		
		problema =  "7+-3";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("+", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test2 (){
		
		problema =  "7+-3";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(-3, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test3 (){
		
		problema =  "-4+3";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(-4, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest3 () throws BadOperatorException {
		
		problema =  "-4+3";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("+", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test3 (){
		
		problema =  "-4+3";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(3, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test4 () {
		
		problema =  "-12+-7";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(-12, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest4 () throws BadOperatorException {
		
		problema =  "-12+-7";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("+", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test4 () {
		
		problema =  "-12+-7";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(-7, resultado);
	}

	@Test
	public void obtenerCoeficiente1Test5 () {
		
		problema =  "2-3";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest5 ()throws BadOperatorException{
		
		problema =  "2-3";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("-", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test5 (){
		
		problema =  "2-3";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(3, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test6 () {
		
		problema =  "7--3";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(7, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest6 () throws BadOperatorException {
		
		problema =  "7--3";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("-", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test6 () {
		
		problema =  "7--3";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(-3, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test7 () {
		
		problema =  "-8--5";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(-8, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest7 () throws BadOperatorException {
		
		problema =  "-8--5";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("-", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test7 (){
		
		problema =  "-8--5";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(-5, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test8 (){
		
		problema =  "2*3";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest8 () throws BadOperatorException {
		
		problema =  "2*3";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("*", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test8 () {
		
		problema =  "2*3";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(3, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test9 () {
		
		problema =  "-2*-3";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(-2, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest9 () throws BadOperatorException {
		
		problema =  "-2*-3";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("*", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test9 () {
		
		problema =  "-2*-3";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(-3, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test10 (){
		
		problema =  "7*-8";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(7, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest10 () throws BadOperatorException {
		
		problema =  "7*-8";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("*", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test10 () {
		
		problema =  "7*-8";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(-8, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test11 (){
		
		problema =  "9/3";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(9, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest11 () throws BadOperatorException {
		
		problema =  "9/3";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("/", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test11 (){
		
		problema =  "9/3";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(3, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test12 (){
		
		problema =  "5/2";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(5, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest12 () throws BadOperatorException {
		
		problema =  "5/2";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("/", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test12 (){
		
		problema =  "5/2";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test13 (){
		
		problema =  "-12/-4";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(-12, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest13 () throws BadOperatorException {
		
		problema =  "-12/-4";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("/", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test13 () {
		problema =  "-12/-4";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(-4, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test14 (){
		
		problema =  "40/-5";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(40, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest14 () throws BadOperatorException {
		
		problema =  "40/-5";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("/", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test14 (){
		
		problema =  "40/-5";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(-5, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test15 () {
		
		problema =  "7+2";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(7, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest15 () throws BadOperatorException {
		
		problema =  "7+2";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("+", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test15 () {
		
		problema =  "7+2";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test16 () {
		
		problema =  "7+-2";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(7, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest16 () throws BadOperatorException {
		
		problema =  "7+-2";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("+", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test16 () {
		
		problema =  "7+-2";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(-2, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test17 () {
		
		problema =  "4*-9";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(4, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest17 () throws BadOperatorException {
		
		problema =  "4*-9";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("*", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test17 () {
		
		problema =  "4*-9";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(-9, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test18 () {
		
		problema =  "-8/2";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(-8, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest18 () throws BadOperatorException {
		
		problema =  "-8/2";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("/", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test18 () {
		
		problema =  "-8/2";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void obtenerCoeficiente1Test19 () {
		
		problema =  "-12--14";
		
		int resultado = parseador.primerOperando(problema);
		
		
		Assert.assertEquals(-12, resultado);
	}
	
	@Test
	public void ObtenerOPeradorTest19 () throws BadOperatorException {
		
		problema =  "-12--14";
		
		String resultado = parseador.obtenerOperador(problema);
		
		Assert.assertEquals("-", resultado);
	}
	
	@Test
	public void obtenerCoeficiente2Test19 () {
		
		problema =  "-12--14";
		
		int resultado = parseador.segundoOperando(problema);
		
		
		Assert.assertEquals(-14, resultado);
	}
	

}
