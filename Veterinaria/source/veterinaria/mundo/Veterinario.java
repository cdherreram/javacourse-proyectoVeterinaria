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
	
	/*
	 * constructores
	 */
	public Veterinario(String especialidad, boolean enConsulta, List<Animal> pacientesConsulta) {
		this.especialidad = especialidad;
		this.enConsulta = enConsulta;
		this.pacientesConsulta = pacientesConsulta;
	}
	
	/*
	 * Metodos
	 */
	
	public boolean asignarCita ( String h, Date fecha ) { // 301 6019578
		return true;
	}
	
	public List<Date> darHorariosOcupados ( ){
		return null;
	}
	
}
