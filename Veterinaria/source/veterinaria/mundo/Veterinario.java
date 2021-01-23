package veterinaria.mundo;

import java.util.*;

public class Veterinario {
	
	public enum Especialidad {
		CONSULTA_GENERAL,
		ONCOLOGIA,
		CARDIOLOGIA,
		ODONTOLOGIA,
		OFTALMOLOGIA,
		FISIOTERAPIA,
		ETOLOGIA,
		REPRODUCCION,
		ORTOPEDIA
	}
	
	/*
	 * Atributos
	 * 
	 */
	private String especialidad;
	private boolean enConsulta;
	private List<Animal> pacientesConsulta;
	private List<Date> fechasConsulta;
	
	/*
	 * Constructores
	 */
	public Veterinario(String especialidad, boolean enConsulta) {
		this.especialidad = especialidad;
		this.enConsulta = enConsulta;
		this.pacientesConsulta = new ArrayList<Animal>();
		this.fechasConsulta = new ArrayList<Date>();
	}
	
	/*
	 * Metodos
	 */
	
	public boolean asignarCita ( String h, Date fecha ) { 
		return true;
	}
	
	public List<Date> darHorariosOcupados ( ){
		return this.fechasConsulta;
	}
	
}
