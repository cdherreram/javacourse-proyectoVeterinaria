package veterinaria.mundo;

import java.util.Date;

public class AuxiliarVeterinario extends Empleado {
	
	/*
	 * Enumeraci�n
	 */
	public enum Area {
		CONSULTA, URGENCIAS, LABORATORIO
	}
	
	/*
	 * Atributos
	 */
	private Area area;
	
	/*
	 * Constructor
	 */
	public AuxiliarVeterinario(int id, String nombre, Date fechaInicioLabores, Area area) {
		super(id, nombre, fechaInicioLabores);
		this.area = area;
	}
	
	/*
	 * M�todos
	 */
	public boolean asignarTarea ( Area area, String tarea) {
		return true;
	}
}
