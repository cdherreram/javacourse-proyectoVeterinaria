package veterinaria.mundo;

public class Mamifero extends Animal{

	public Mamifero(int idAnimal, int edad, String nombreAnimal, String fechaIngreso, String fechaSalida) {
		super(idAnimal, edad, nombreAnimal, fechaIngreso, fechaSalida);
	}

	public Mamifero(int edad, String nombreAnimal, String fechaIngreso) {
		super(edad, nombreAnimal, fechaIngreso);
	}
	
	
	public boolean proximaAlimentacion ( ) {
		
		return true;
	}
	
}
