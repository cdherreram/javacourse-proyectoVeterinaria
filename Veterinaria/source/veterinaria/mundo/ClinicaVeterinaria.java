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
	private Empleado[] listaEmpleados;
	private List<Historial> listaHistoriales;
	
	
	public ClinicaVeterinaria() {
		listaAnimales = new ArrayList<Animal>();
		listaEmpleados = new Empleado[MAX_EMPLEADOS];
		listaHistoriales = new ArrayList<Historial>();
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
	public Empleado[] getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(Empleado[] listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
	public List<Historial> getListaHistoriales() {
		return listaHistoriales;
	}

	public void setListaHistoriales(List<Historial> listaHistoriales) {
		this.listaHistoriales = listaHistoriales;
	}

	public Animal retornarAnimal( String idAnimal ) {
		return null;
	}
	
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
	
}

