package veterinaria.mundo;

public class Historial {
	
	/*
	 * Atributos
	 */
	
	/**
	 * Representa la fecha de ingreso del animal.
	 */
	private String fechaIngreso;
	
	
	/**
	 * Representa la fecha de registro del animal.
	 */
	private String fechaRegistro;
	
	
	/**
	 * Representa la fecha de salida del animal.
	 */
	private String fechaSalida;
	
	
	/**
	 * Representa el procedimiento médico que se le hizo al animal.
	 */
	private String procedimiento;
	
	
	/**
	 * Describe el antecedente médico del animal.
	 */
	private String antecedentes;
	
	
	/**
	 * Me dice si se le dieron medicamentos al animal.
	 */
	private boolean tieneMedicamentos;
	
	
	/**
	 * Representa las recomendaciones que se le dieron al animal cuando se fue.
	 */
	private String recomendaciones;
	
	
	/**
	 * Construye un objeto de tipo Historial con los siguientes atributos:
	 * @param fechaIngreso: Se agrega la fecha (dd/mm/yy) cuando ingresa el animal por primera vez.
	 * @param fechaRegistro: Se agrega la fecha (dd/mm/yy) cuando ingresa el animal para el procedimiento actual.
	 * @param fechaSalida: Se agrega la fecha (dd/mm/yy) cuando sale el animal del procedimiento actual.
	 */
	public Historial(String fechaIngreso, String fechaRegistro, String fechaSalida) {
		this.fechaIngreso = fechaIngreso;
		this.fechaRegistro = fechaRegistro;
		this.fechaSalida = fechaSalida;
		this.procedimiento = "";
		this.antecedentes = "";
		this.tieneMedicamentos = false;
		this.recomendaciones = "";
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
		this.fechaIngreso = fechaIngreso;
		this.fechaRegistro = fechaRegistro;
		this.fechaSalida = fechaSalida;
		this.procedimiento = procedimiento;
		this.antecedentes = antecedentes;
		this.tieneMedicamentos = tieneMedicamentos;
		this.recomendaciones = recomendaciones;
	}
	
	public Historial ( String fechaIngreso, String fechaRegistro) {
		this.fechaIngreso = fechaIngreso;
		this.fechaRegistro = fechaRegistro;
		this.fechaSalida = null;
		this.procedimiento = null;
		this.antecedentes = null;
		this.tieneMedicamentos = false;
		this.recomendaciones = null;
 	}
	
	/*
	 * Métodos
	 */

	public String getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public String getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	public String getFechaSalida() {
		return fechaSalida;
	}


	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}


	public String getProcedimiento() {
		return procedimiento;
	}


	public void setProcedimiento(String procedimiento) {
		this.procedimiento = procedimiento;
	}


	public String getAntecedentes() {
		return antecedentes;
	}


	public void setAntecedentes(String antecedentes) {
		this.antecedentes = antecedentes;
	}


	public boolean isTieneMedicamentos() {
		return tieneMedicamentos;
	}


	public void setTieneMedicamentos(boolean tieneMedicamentos) {
		this.tieneMedicamentos = tieneMedicamentos;
	}


	public String getRecomendaciones() {
		return recomendaciones;
	}


	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}
}
