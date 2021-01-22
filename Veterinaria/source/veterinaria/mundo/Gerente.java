package veterinaria.mundo;

import java.util.Date;

public class Gerente extends Empleado{
	// Atributos
	private boolean disponible;
	
	// Constructor
	public Gerente(boolean disponible,int id,String nombre,Date fechaInicioLabores) {
		super(id,nombre,fechaInicioLabores);
		this.disponible = disponible;
	}
	
	public Gerente (int id, String nombre, Date fechaInicioLabores) {
		super(id, nombre, fechaInicioLabores);
		this.disponible = false;
	}
	

}
