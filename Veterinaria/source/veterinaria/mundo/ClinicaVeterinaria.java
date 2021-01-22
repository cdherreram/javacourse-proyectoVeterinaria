package veterinaria.mundo;

import java.util.*;

public class ClinicaVeterinaria {
	
	
	/*
	 * Constantes
	 */
	
	public final static int MAX_EMPLEADOS = 50;
	
	/*
	 * Atributos
	 */
	
	
	private List<Animal> listaAnimales;
	private List<Empleado> listaEmpleados;
	private List<Historial> listaHistoriales;
	
	
	public ClinicaVeterinaria() {
		listaAnimales = new ArrayList<Animal>();
		listaEmpleados = new ArrayList<Empleado>();
		listaHistoriales = new ArrayList<Historial>();
	}
	
	public ClinicaVeterinaria(ArrayList<Animal> listaAnimales) {
		this.listaAnimales = listaAnimales;
		listaEmpleados = new ArrayList<Empleado>();
	}
	
	public ClinicaVeterinaria(ArrayList<Animal> listaAnimales, ArrayList<Empleado> listaEmpleados) {
		this.listaAnimales = listaAnimales;
		this.listaEmpleados = listaEmpleados;
	}
	
	/*
	 * Metodos
	 */
	
	public List<Animal> getListaAnimales() {
		return listaAnimales;
	}
	public void setListaAnimales(ArrayList<Animal> listaAnimales) {
		this.listaAnimales = listaAnimales;
	}
	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}


	
	public Animal retornarAnimal( int idAnimal) {
		return null;
	}
	
	public List<Animal> retornarListaAnimales ( String nombreAnimal, String nombreDuenho){
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
	
	public boolean darDeAlta ( int id) {
		return true;
	}
	
}

