package veterinaria.mundo;

import java.util.List;

public class Veterinario {
	
	/*
	 * Atriburtos
	 * 
	 */

	private String especialidad;
	private boolean enConsulta;
	private List<Animal> pacientesConsulta;
	
	/*
	 * constructores
	 */
	
	public Veterinario(String especialidad, boolean enConsulta, List<Animal> pacientesConsulta) {
		super();
		this.especialidad = especialidad;
		this.enConsulta = enConsulta;
		this.pacientesConsulta = pacientesConsulta;
	}
	
	/*
	 * Metodos
	 */
	
	
		
	
}
