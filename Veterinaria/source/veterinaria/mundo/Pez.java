package veterinaria.mundo;

import java.util.*;

public class Pez extends Animal{
	
	/*
	 * Atributo
	 */
	
	private int peceraAsignada;
	private double nivelMinimoAlimento;
	
	
	/*
	 * Constructores
	 */

	public Pez(int idAnimal, int edad, String nombreAnimal, Date fechaIngreso, Date fechaSalida, double nivelAlimento, int peceraAsignada
			, double nivelMinimoAlimento) {
		super(idAnimal, edad, nombreAnimal, fechaIngreso, fechaSalida, nivelAlimento);
		this.peceraAsignada = peceraAsignada;
		this.nivelMinimoAlimento = nivelMinimoAlimento;
	}

	public Pez(int edad, String nombreAnimal, Date fechaIngreso, int peceraAsignada, double nivelMinimoAlimento) {
		super(edad, nombreAnimal, fechaIngreso);
		this.peceraAsignada = peceraAsignada;
		this.nivelMinimoAlimento = nivelMinimoAlimento;
	}
	
	
	/*
	 * MÃ©todos
	 */
	
	/**
	 * Esta función me dice si ya es necesario alimentar el pez
	 * @return true si ya necesita la alimentación, false en otro caso
	 */
	public boolean proximaAlimentacion() {
		return getNivelAlimento() < nivelMinimoAlimento ? true : false;
	}
	
	public String hablar() {
		return "glugluglu";
	}
}
