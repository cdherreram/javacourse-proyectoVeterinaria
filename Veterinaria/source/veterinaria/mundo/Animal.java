package veterinaria.mundo;

/**
 * 
 * @author Cristian David Herrera
 *
 */

import java.util.*;

public abstract class Animal {
	
	/*
	 * Atributos
	 */
	
	/**
	 * Representa el id del animal
	 */
	private String idAnimal;
	
	/**
	 * Representa el nombre del animal
	 */
	private String nombreAnimal;
	
	/**
	 * Representa la fecha de ingreso por primera vez del animal
	 */
	private Calendar fechaNacimiento;
	
	/**
	 * Representa el nivel de alimento que necesita el animal para sobrevivir
	 */
	private int nivelAlimento;
	
	private int nivelMinimoAlimento;
	
	private Duenho duenho;

	/*
	 * Constructores
	 */
	
	/**
	 * Construye un animal dados los parï¿½metros.
	 * @param idAnimal Id del animal
	 * @param edad Edad del animal
	 * @param nombreAnimal Nombre del animal
	 * @param fechaNacimiento Fecha de ingreso
	 */
	public Animal(String idAnimal,String nombreAnimal, Calendar fechaNacimiento, Duenho duenho) {
		this.idAnimal = idAnimal;
		this.nombreAnimal = nombreAnimal;
		this.fechaNacimiento = fechaNacimiento;
		this.nivelAlimento = 80;
		this.nivelMinimoAlimento = 0;
		this.duenho = duenho;
	}

	/*
	 * Metodos
	 * 
	 */
	public String getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(String idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getNombreAnimal() {
		return nombreAnimal;
	}

	public void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento.get(Calendar.MONTH) + "/" + fechaNacimiento.get(Calendar.YEAR);
	}

	public void setFechaNacimiento(int year, int month) {
		this.fechaNacimiento.set(year, month, 1);;
	}

	public int getNivelAlimento() {
		return nivelAlimento;
	}

	public void setNivelAlimento(int nivelAlimento) {
		this.nivelAlimento = nivelAlimento;
	}

	public int getNivelMinimoAlimento() {
		return nivelMinimoAlimento;
	}

	public void setNivelMinimoAlimento(int nivelMinimoAlimento) {
		this.nivelMinimoAlimento = nivelMinimoAlimento;
	}

	public Duenho getDuenho() {
		return duenho;
	}

	public void setDuenho(Duenho duenho) {
		this.duenho = duenho;
	}

	public abstract boolean proximaAlimentacion( );
	
	public String registrarOperacionEnHistorial (String operacion) {
		return "";
	}
	
	public String alimentar() {
		if ( proximaAlimentacion()) {
			setNivelAlimento(100);
			return "El nuevo nivel de alimento es " + getNivelAlimento();
		}
		return "El animal no necesita alimento aún";
	}

	@Override
	public String toString() {
		return this.idAnimal + ". "+ this.nombreAnimal ;
	}
	
}
