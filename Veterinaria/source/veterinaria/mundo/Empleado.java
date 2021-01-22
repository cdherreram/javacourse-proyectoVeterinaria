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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaInicioLabores() {
		return fechaInicioLabores;
	}

	public void setFechaInicioLabores(Date fechaInicioLabores) {
		this.fechaInicioLabores = fechaInicioLabores;
	}
	

}
