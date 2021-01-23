package veterinaria.mundo;

import java.util.Date;

public class Ave extends Animal{
	
	/*
	 * Atributos
	 */
	
	private String estadoPlumaje;
	
	
	/*
	 * Constructores
	 */

	public Ave(int idAnimal, int edad, String nombreAnimal, Date fechaIngreso, Date fechaSalida, double nivelAlimento, String estadoPlumaje) {
		super(idAnimal, edad, nombreAnimal, fechaIngreso, fechaSalida, nivelAlimento);
		this.estadoPlumaje = estadoPlumaje;
	}

	public Ave(int edad, String nombreAnimal, Date fechaIngreso, String estadoPlumaje) {
		super(edad, nombreAnimal, fechaIngreso);
		this.estadoPlumaje = estadoPlumaje;
	}
	
	
	/*
	 * Métodos
	 */
	
	
	/**
	 * Esta función me dice si ya es necesario alimentar el ave
	 * @return true si ya necesita la alimentación, false en otro caso
	 */
	public boolean proximaAlimentacion() {
		if(getNivelAlimento()< 3/4) {
			return true;
		}
		return false;
	}
	
	
	
}