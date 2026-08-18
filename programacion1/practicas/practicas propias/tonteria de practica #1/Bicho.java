public class Bicho{
	private String nombre;
	private int vida;


	public void asignarNombre(String nombreDelBicho){
		nombre = nombreDelBicho;
	}

	public void atacar(){
		System.out.println("El bicho "+nombre+" ataca ferozmente");
	}
}