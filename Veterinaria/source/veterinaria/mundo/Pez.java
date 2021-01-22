package veterinaria.mundo;

public class Pez extends Animal{
	
	private int peceraAsignada;

	public Pez(int idAnimal, int edad, String nombreAnimal, String fechaIngreso, String fechaSalida, int peceraAsignada) {
		super(idAnimal, edad, nombreAnimal, fechaIngreso, fechaSalida);
		this.peceraAsignada = peceraAsignada;
	}

	public Pez(int edad, String nombreAnimal, String fechaIngreso, int peceraAsignada) {
		super(edad, nombreAnimal, fechaIngreso);
		this.peceraAsignada = peceraAsignada;
	}
	
	public boolean proximaAlimentacion() {
		return true;
	}

}
