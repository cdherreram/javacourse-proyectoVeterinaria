package veterinaria.mundo;

import java.util.*;

public class Mamifero extends Animal{
	
	/*
	 * Constructores
	 */

	public Mamifero(int idAnimal, int edad, String nombreAnimal, Date fechaIngreso, Date fechaSalida, double nivelAlimento) {
		super(idAnimal, edad, nombreAnimal, fechaIngreso, fechaSalida, nivelAlimento);
	}

	public Mamifero(int edad, String nombreAnimal, Date fechaIngreso) {
		super(edad, nombreAnimal, fechaIngreso);
	}
	

	/*
	 * Métodos
	 */
	
	
	/**
	 * Esta función me dice si ya es necesario alimentar el mamifero
	 * @return true si ya necesita la alimentación, false en otro caso
	 */
	public boolean proximaAlimentacion ( ) {
		return true;
	}
	
	public String hablar () {
		return "muuu";
	}
}
