package veterinaria.mundo;

import java.util.Date;

public class Ave extends Animal{
	
	public final static int NIVEL_MINIMO_ALIMENTO_AVE = 80;
	
	/*
	 * Atributos
	 */
	
	private String estadoPlumaje;
	
	
	/*
	 * Constructores
	 */

	public Ave(int idAnimal,String nombreAnimal, Date fechaNacimiento, Duenho duenho, String estadoPlumaje) {
		super( idAnimal, nombreAnimal,  fechaNacimiento,  duenho);
		this.estadoPlumaje = estadoPlumaje;
		setNivelMinimoAlimento(NIVEL_MINIMO_ALIMENTO_AVE);
	}
	
	/*
	 * Métodos
	 */
	
	
	/**
	 * Esta función me dice si ya es necesario alimentar el ave
	 * @return true si ya necesita la alimentación, false en otro caso
	 */
	public boolean proximaAlimentacion() {
		if(getNivelAlimento() < getNivelMinimoAlimento()) {
			return true;
		}
		return false;
	}
	
}