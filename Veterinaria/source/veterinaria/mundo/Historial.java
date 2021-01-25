package veterinaria.mundo;

public class Historial {
	
	public enum Operacion{
		CONSULTA,
		COMPRA,
		HOSPITALIZACION
	}
	
	/*
	 * Atributos
	 */
	
	private Operacion tipoOperacion;
	
	/**
	 * Representa el id del animal
	 */
	private int idAnimal;
	
	/**
	 * Representa la fecha de registro del animal.
	 */
	private String fechaRegistro;
	
	/**
	 * Representa el procedimiento médico que se le hizo al animal.
	 */
	private String descripcionOperacion;
	
	/**
	 * Me dice si se le dieron medicamentos al animal.
	 */
	private boolean tieneMedicamentos;
	
	
	private String veterinario;
	
	
	private String especialidad;
	
	/**
	 * Construye un objeto de tipo Historial con los siguientes atributos:
	 * @param fechaIngreso: Se agrega la fecha (dd/mm/yy) cuando ingresa el animal por primera vez.
	 * @param fechaRegistro: Se agrega la fecha (dd/mm/yy) cuando ingresa el animal para el procedimiento actual.
	 * @param fechaSalida: Se agrega la fecha (dd/mm/yy) cuando sale el animal del procedimiento actual.
	 */
	public Historial(String fechaIngreso, String fechaRegistro, String fechaSalida) {
		this.fechaRegistro = fechaRegistro;
		this.descripcionOperacion = "";
		this.tieneMedicamentos = false;
	}


	/**
	 * Construye un objeto de tipo Historial con los siguientes atributos:
	 * @param fechaIngreso: Se agrega la fecha (dd/mm/yy) cuando ingresa el animal por primera vez.
	 * @param fechaRegistro: Se agrega la fecha (dd/mm/yy) cuando ingresa el animal para el procedimiento actual.
	 * @param fechaSalida: Se agrega la fecha (dd/mm/yy) cuando sale el animal del procedimiento actual.
	 * @param procedimiento: Se agrega el porqué entró y qué se le hizo al animal.
	 * @param antecedentes: Se describen los antecedentes médicos que tiene el animal.
	 * @param tieneMedicamentos: Dice si el procedimiento le receta algún medicamento.
	 * @param recomendasciones: Se describen las recomendaciones que se le dan al animal para después del procedimiento.
	 */
	public Historial(String fechaIngreso, String fechaRegistro, String fechaSalida,
			String procedimiento, String antecedentes, boolean tieneMedicamentos,
			String recomendaciones) {
		this.fechaRegistro = fechaRegistro;
		this.descripcionOperacion = procedimiento;
		this.tieneMedicamentos = tieneMedicamentos;
	}
	
	public Historial ( String fechaIngreso, String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
		this.descripcionOperacion = null;
		this.tieneMedicamentos = false;
 	}
	
	/*
	 * Métodos
	 */

	public String getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getProcedimiento() {
		return descripcionOperacion;
	}


	public void setProcedimiento(String procedimiento) {
		this.descripcionOperacion = procedimiento;
	}

	public boolean isTieneMedicamentos() {
		return tieneMedicamentos;
	}


	public void setTieneMedicamentos(boolean tieneMedicamentos) {
		this.tieneMedicamentos = tieneMedicamentos;
	}
}
