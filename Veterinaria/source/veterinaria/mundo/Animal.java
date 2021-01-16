package veterinaria.mundo;

/**
 * 
 * @author Cristian David Herrera
 *
 */
public class Animal {
	
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
	private String fechaIngreso;
	
	/**
	 * Representa la última fecha de salida registrada para el animal
	 */
	private String fechaSalida;

	/*
	 * Constructores
	 */
	
	/**
	 * Construye un animal dados los parámetros.
	 * @param idAnimal Id del animal
	 * @param edad Edad del animal
	 * @param nombreAnimal Nombre del animal
	 * @param fechaIngreso Fecha de ingreso
	 * @param fechaSalida Fecha de Salida
	 */
	public Animal(int idAnimal, int edad, String nombreAnimal, String fechaIngreso, String fechaSalida) {
		this.idAnimal = idAnimal;
		this.edad = edad;
		this.nombreAnimal = nombreAnimal;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
	}
	
	/**
	 * Construye un animal dados los parámetros.
	 * @param edad Edad del animal
	 * @param nombreAnimal Nombre del animal
	 * @param fechaIngreso Fecha de ingreso
	 */
	public Animal ( int edad, String nombreAnimal, String fechaIngreso) {
		this.edad = edad;
		this.nombreAnimal = nombreAnimal;
		this.fechaIngreso = fechaIngreso;
	}

	/*
	 * Atributos
	 */
	
	/**
	 * Retorna la edad del animal
	 * @return Edad del animal
	 */
	public int getEdad( ) {
		return edad;
	}

	/**
	 * Cambia la edad por parámetro
	 * @param edad Nueva edad del animal
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Retorna la fecha de salida del animal
	 * @return Fecha de salida del animal
	 */
	public String getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * Cambia la fecha de salida del animal
	 * @param fechaSalida Nueva fecha de salida del animal
	 */
	public void setFechaSalida(String fechaSalida) {
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
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	
	
	
	
	
}
