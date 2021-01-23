package veterinaria.mundo;

import java.util.*;

public class Mamifero extends Animal{
	
	private int cantidadMinimaAlimento;
	
	/*
	 * Constructores
	 */

	public Mamifero(int idAnimal, int edad, String nombreAnimal, Date fechaIngreso, Date fechaSalida, double nivelAlimento, int cantidadMinimaAlimento) {
		super(idAnimal, edad, nombreAnimal, fechaIngreso, fechaSalida, nivelAlimento);
		this.cantidadMinimaAlimento = cantidadMinimaAlimento;
	}

	public Mamifero(int edad, String nombreAnimal, Date fechaIngreso, int cantidadMinimaAlimento) {
		super(edad, nombreAnimal, fechaIngreso);
		this.cantidadMinimaAlimento = cantidadMinimaAlimento;
	}
	

	/*
	 * Métodos
	 */
	
	
	/**
	 * Esta función me dice si ya es necesario alimentar el mamifero
	 * @return true si ya necesita la alimentación, false en otro caso
	 */
	public boolean proximaAlimentacion ( ) {
		if(super.getNivelAlimento <= this.cantidadMinimaAlimento){
			return true;
		}else{
			return false;
		}
	}
	
}
