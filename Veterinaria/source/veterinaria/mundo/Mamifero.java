package veterinaria.mundo;

import java.util.*;

public class Mamifero extends Animal{
	
	public final static int NIVEL_MINIMO_ALIMENTO_MAMIFERO = 30;
	
	/*
	 * Constructores
	 */

	public Mamifero(int idAnimal,String nombreAnimal, Date fechaNacimiento, Duenho duenho) {
		super(idAnimal, nombreAnimal,  fechaNacimiento,  duenho);
		setNivelMinimoAlimento(NIVEL_MINIMO_ALIMENTO_MAMIFERO);
	}
	

	/*
	 * Métodos
	 */
	
	
	/**
	 * Esta función me dice si ya es necesario alimentar el mamifero
	 * @return true si ya necesita la alimentación, false en otro caso
	 */
	public boolean proximaAlimentacion ( ) {
		if(super.getNivelAlimento() < getNivelMinimoAlimento()){
			return true;
		}else{
			return false;
		}
	}
}
