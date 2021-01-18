package veterinaria.mundo;

import java.util.*;

public class ClinicaVeterinaria {
	
	/*
	 * Atributos
	 */
	
	private int MAX_NUM;
	private ArrayList<Animal> listaAnimales;
	private ArrayList<Empleado> listaEmpleados;
	
	
	public ClinicaVeterinaria() {
		MAX_NUM = 200;
		listaAnimales = new ArrayList<Animal>();
		listaEmpleados = new ArrayList<Empleado>();
	}
	
	
	public ClinicaVeterinaria(int MAX_NUM) {
		this.MAX_NUM = MAX_NUM;
		listaAnimales = new ArrayList<Animal>();
		listaEmpleados = new ArrayList<Empleado>();
	}
	
	
	public ClinicaVeterinaria(int MAX_NUM, ArrayList<Animal> listaAnimales) {
		this.MAX_NUM = MAX_NUM;
		this.listaAnimales = listaAnimales;
		listaEmpleados = new ArrayList<Empleado>();
	}
	
	
	public ClinicaVeterinaria(int MAX_NUM, ArrayList<Animal> listaAnimales,
			ArrayList<Empleado> listaEmpleados) {
		this.MAX_NUM = MAX_NUM;
		this.listaAnimales = listaAnimales;
		this.listaEmpleados = listaEmpleados;
	}
	
	/*
	 * Métodos
	 */
	
	public int getMAX_NUM() {
		return MAX_NUM;
	}
	public void setMAX_NUM(int mAX_NUM) {
		MAX_NUM = mAX_NUM;
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

