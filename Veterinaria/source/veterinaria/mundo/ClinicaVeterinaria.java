package veterinaria.mundo;

import java.util.*;

public class ClinicaVeterinaria {
	
	/*
	 * Atributos
	 */
	
	private int MAX_EMPLEADOS;
	private ArrayList<Animal> listaAnimales;
	private ArrayList<Empleado> listaEmpleados;
	
	
	public ClinicaVeterinaria() {
		MAX_EMPLEADOS = 50;
		listaAnimales = new ArrayList<Animal>();
		listaEmpleados = new ArrayList<Empleado>();
	}	
	
	public ClinicaVeterinaria(ArrayList<Animal> listaAnimales) {
		this.MAX_EMPLEADOS = 50;
		this.listaAnimales = listaAnimales;
		listaEmpleados = new ArrayList<Empleado>();
	}
	
	public ClinicaVeterinaria(ArrayList<Animal> listaAnimales, ArrayList<Empleado> listaEmpleados) {
		this.MAX_EMPLEADOS = 50;
		this.listaAnimales = listaAnimales;
		this.listaEmpleados = listaEmpleados;
	}
	
	/*
	 * Métodos
	 */
	
	public int getMAX_EMPLEADOS(){
		return MAX_EMPLEADOS;
	}
	public ArrayList<Animal> getListaAnimales() {
		return listaAnimales;
	}
	public void setListaAnimales(ArrayList<Animal> listaAnimales) {
		this.listaAnimales = listaAnimales;
	}
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}	
	
}

