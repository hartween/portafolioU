public class Main{
	public static void main(String [] args){
		
		int numeroEntero = 4;
		float numeroDecimal = 3.14f;
		char caracterSimple = 'a';
		String cadenaTexto = "135325";


		//casting

		//de entero a flotante
		float nuevoDecimal = (float)numeroEntero;
		System.out.println("De 4 a 4.0: "+nuevoDecimal);
		//de flotante a entero
		int nuevoEntero = (int) numeroDecimal;
		System.out.println("de 3.14 a 3: "+nuevoEntero);

		//de texto a entero.
		nuevoEntero = Integer.parseInt(cadenaTexto);
		nuevoEntero -= 1;
		System.out.println("deberia dar 135324");

		System.out.println();

	}
}