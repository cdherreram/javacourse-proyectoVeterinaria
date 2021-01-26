package veterinaria.mundo;

import java.util.*;

public class Pez extends Animal{
	
	public final static int NIVEL_MINIMO_ALIMENTO_PEZ = 50;
	
	/*
	 * Atributo
	 */
	
	private int peceraAsignada;
	
	
	/*
	 * Constructores
	 */

	public Pez(String idAnimal,String nombreAnimal, Calendar fechaNacimiento, Duenho duenho, int peceraAsignada) {
		super( idAnimal, nombreAnimal,  fechaNacimiento,  duenho);
		this.peceraAsignada = peceraAsignada;
		setNivelMinimoAlimento(NIVEL_MINIMO_ALIMENTO_PEZ);
	}
	
	/*
	 * Métodos
	 */
	
	/**
	 * Esta funci�n me dice si ya es necesario alimentar el pez
	 * @return true si ya necesita la alimentaci�n, false en otro caso
	 */
	public boolean proximaAlimentacion() {
		return getNivelAlimento() < getNivelMinimoAlimento() ? true : false;
	}
}
