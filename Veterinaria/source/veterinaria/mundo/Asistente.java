package veterinaria.mundo;

public class Asistente extends Empleado{
	//Enumeraciones
	public enum Puesto{
		 SERVICIOS_GENERALES, CAJA,INFORMACION,RECEPCION
	}
	
	// Atributos
	private Puesto puesto;
	
	// Constructor
	public Asistente(Puesto puesto) {
		super();
		this.puesto = puesto;
	}
}
