package veterinaria.mundo;

import java.util.*;

public class Pez extends Animal{
	
	/*
	 * Atributo
	 */
	
	private int peceraAsignada;
	
	
	/*
	 * Constructores
	 */

	public Pez(int idAnimal, int edad, String nombreAnimal, Date fechaIngreso, Date fechaSalida, double nivelAlimento, int peceraAsignada) {
		super(idAnimal, edad, nombreAnimal, fechaIngreso, fechaSalida, nivelAlimento);
		this.peceraAsignada = peceraAsignada;
	}

	public Pez(int edad, String nombreAnimal, Date fechaIngreso, int peceraAsignada) {
		super(edad, nombreAnimal, fechaIngreso);
		this.peceraAsignada = peceraAsignada;
	}
	
	
	/*
	 * Métodos
	 */
	
	/**
	 * Esta función me dice si ya es necesario alimentar el pez
	 * @return true si ya necesita la alimentación, false en otro caso
	 */
	public boolean proximaAlimentacion() {
		return true;
	}
	
	
	
}
