package veterinaria.mundo;

import java.util.*;

public class ClinicaVeterinaria {
	
	/*
	 * Atributos
	 */
	/**
	 * Atributo que representa la lista de animales que se han registrado en la cl�nica veterinaria
	 */
	private List<Animal> listaAnimales;
	
	/**
	 * Atributo que representa una lista de empleados con los empleados de la cl�nica veterinaria
	 */
	private List<Empleado> listaEmpleados;	
	
	
	/*
	 * Constructor
	 */
	
	/**
	 * Constructor de la cl�nica veterinaria
	 */
	public ClinicaVeterinaria() {
		listaAnimales = new ArrayList<Animal>();
		listaEmpleados = new ArrayList<Empleado>();
	}
	
	/*
	 * Metodos
	 */
	
	/**
	 * Retorna la lista de animales de la cl�nica
	 * @return lista de animales registrados en la cl�nica
	 */
	public List<Animal> getListaAnimales() {
		return listaAnimales;
	}
	
	public void agregarAnimal (Animal a) {
		listaAnimales.add(a);
	}
	
	/**
	 * Retorna la lista de empleados de la cl�nica
	 * @return lista de empleados de la cl�nica
	 */
	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	
	public void agregarEmpleado( Empleado e) {
		listaEmpleados.add(e);
	}

	/**
	 * Retorna un animal dado su id
	 * @param idAnimal Id del animal a buscar
	 * @return animal buscado. Si no se encuentra, retorna null
	 */
	public Animal retornarAnimal( String idAnimal ) {
		return null;
	}
	
	/**
	 * Retorna una lista de animales dado el nombre del animal y el due�o del animal
	 * @param nombreAnimal Nombre del animal buscado
	 * @param nombreDuenho Nombre del due�o del animal buscado
	 * @return lista de animales que tienen como nombre y due�o los dados por par�metro
	 */
	public List<Animal> retornarListaAnimales ( String nombreAnimal, String nombreDuenho ){
		return null;
	}
	
	
	public String asignarCita ( Date fecha) {
		return "";
	}
	
	public String asignarCita ( Date fecha, String nombreVeterinario) {
		return "";
	}
	
	private Veterinario buscarVeterinarioDisponible ( Date fecha) {
		return null;
	}
	
	public void ordenarEmpleadosPorTurno ( ) {
		
	}
	
	public List<Historial> buscarHistorial ( String id){
		return null;
	}
	
	public boolean darDeAlta ( int id) {
		return true;
	}
	
	public static void main(String[] args) {
		String s = new String("5-1994'");
		String[] partes = s.split("[-' ]+");
		System.out.println(partes.length);
		System.out.println(partes.toString());
		for ( String p: partes) {
			System.out.println("Palabra: " + p + "\t");
		}
	}
	
}

