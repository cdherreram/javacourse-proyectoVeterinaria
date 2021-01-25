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
	 * Representa el conteo de los id para la clase animal
	 */
	private static int IdSiguiente = 1;
	
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
	private Date fechaNacimiento;
	
	
	/**
	 * Representa el nivel de alimento que necesita el animal para sobrevivir
	 */
	private int nivelAlimento;
	
	private int nivelMinimoAlimento;

	/*
	 * Constructores
	 */
	
	/**
	 * Construye un animal dados los parï¿½metros.
	 * @param idAnimal Id del animal
	 * @param edad Edad del animal
	 * @param nombreAnimal Nombre del animal
	 * @param fecha Fecha de ingreso
	 */
	public Animal(int idAnimal, int edad, String nombreAnimal, Date fecha) {
		this.idAnimal = idAnimal;
		this.edad = edad;
		this.nombreAnimal = nombreAnimal;
		this.fechaNacimiento = fecha;
		this.nivelAlimento = 80;
		this.nivelMinimoAlimento = 0;
	}
	

	public Animal ( int edad, String nombreAnimal, Date fecha) {
		this.idAnimal = IdSiguiente; IdSiguiente++;
		this.edad = edad;
		this.nombreAnimal = nombreAnimal;
		this.fechaNacimiento = fecha;
		this.nivelAlimento = 80;
		this.nivelMinimoAlimento = 0;
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
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	/**
	 * Retorna el nivel de alimento que tiene el animal actualmente
	 * @return nivel de alimento
	 */
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

	/*
	 * Métodos
	 */
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
