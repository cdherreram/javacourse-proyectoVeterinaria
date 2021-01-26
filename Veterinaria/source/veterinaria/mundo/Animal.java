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
	 * Representa el id del animal (en meses)
	 */
	private int idAnimal;
	
	/**
	 * Representa el nombre del animal
	 */
	private String nombreAnimal;
	
	/**
	 * Representa la fecha de ingreso por primera vez del animal
	 */
	private Date fechaNacimiento;
	
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
	public Animal(int idAnimal,String nombreAnimal, Date fechaNacimiento, Duenho duenho) {
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
	public int getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getNombreAnimal() {
		return nombreAnimal;
	}

	public void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
	
}
