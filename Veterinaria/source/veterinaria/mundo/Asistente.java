package veterinaria.mundo;
import java.util.*;

public class Asistente extends Empleado{
	//Enumeraciones
	public enum Puesto{
		 SERVICIOS_GENERALES, CAJA,INFORMACION,RECEPCION
	}
	
	// Atributos
	private Puesto puesto;
	
	// Constructor
	public Asistente(Puesto puesto,int id,String nombre,Date fechaInicioLabores) {
		super(id,nombre,fechaInicioLabores);
		this.puesto = puesto;
	}
}
