package veterinaria.mundo;
import java.util.*;

public class Empleado {
	//Enumeraciones
	public enum Horario{
		MANHANA,TARDE,NOCHE
	}
	
	// Atributos
	private int id;
	private Horario horario;
	private String nombre;
	private Date fechaInicioLabores;
	
	// Constructor
	public Empleado(int id, String nombre, Date fechaInicioLabores) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaInicioLabores = fechaInicioLabores;
	}
	
	// Métodos
	public void cambiarTurno(Horario nuevoHorario) {
		
	}
	

}
