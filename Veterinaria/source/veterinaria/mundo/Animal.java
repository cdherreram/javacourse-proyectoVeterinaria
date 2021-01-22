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
	private int idAnimal;
	
	/**
	 * Representa la edad del animal
	 */
	private int edad;
	
	/**
	 * Representa el nombre del animal
	 */
	private String nombreAnimal;
	
	/**
	 * Representa la fecha de ingreso por primera vez del animal
	 */
	private Date fechaIngreso;
	
	/**
	 * Representa la ï¿½ltima fecha de salida registrada para el animal
	 */
	private Date fechaSalida;
	
	/**
	 * Representa el nivel de alimento que necesita el animal para sobrevivir
	 */
	private double nivelAlimento;
	

	/*
	 * Constructores
	 */
	
	/**
	 * Construye un animal dados los parï¿½metros.
	 * @param idAnimal Id del animal
	 * @param edad Edad del animal
	 * @param nombreAnimal Nombre del animal
	 * @param fechaIngreso Fecha de ingreso
	 * @param fechaSalida Fecha de Salida
	 */
	public Animal(int idAnimal, int edad, String nombreAnimal, Date fechaIngreso, Date fechaSalida, double nivelAlimento) {
		this.idAnimal = idAnimal;
		this.edad = edad;
		this.nombreAnimal = nombreAnimal;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.nivelAlimento = nivelAlimento;
	}
	
	/**
	 * Construye un animal dados los parï¿½metros.
	 * @param edad Edad del animal
	 * @param nombreAnimal Nombre del animal
	 * @param fechaIngreso Fecha de ingreso
	 */
	public Animal ( int edad, String nombreAnimal, Date fechaIngreso) {
		this.edad = edad;
		this.nombreAnimal = nombreAnimal;
		this.fechaIngreso = fechaIngreso;
	}

	/*
	 * Metodos
	 * 
	 */
	
	/**
	 * Retorna la edad del animal
	 * @return Edad del animal
	 */
	public int getEdad( ) {
		return edad;
	}

	/**
	 * Cambia la edad por parï¿½metro
	 * @param edad Nueva edad del animal
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Retorna la fecha de salida del animal
	 * @return Fecha de salida del animal
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * Cambia la fecha de salida del animal
	 * @param fechaSalida Nueva fecha de salida del animal
	 */
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	/**
	 * Retorna el id del animal
	 * @return id del animal
	 */
	public int getIdAnimal() {
		return idAnimal;
	}

	/**
	 * Retorna el nombre del animal
	 * @return nombre del animal
	 */
	public String getNombreAnimal() {
		return nombreAnimal;
	}

	/**
	 * Retorna la fecha de ingreso del animal
	 * @return fecha de ingreso
	 */
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	
	public void setNivelAlimento(double nuevoNivelAlimento) {
		this.nivelAlimento = nuevoNivelAlimento;
	}
	
	public double getNivelAlimento ( ) {
		return this.nivelAlimento;
	}
	
	/*
	 * Métodos
	 */
	public abstract boolean proximaAlimentacion( );
	
	public String registrarOperacionEnHistorial (String operacion) {
		return "";
	}
	
	public String alimentar() {
		return "";
	}
	
	public abstract String hablar();
	
}
