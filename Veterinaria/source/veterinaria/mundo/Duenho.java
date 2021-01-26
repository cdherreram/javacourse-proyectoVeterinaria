/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.mundo;

/**
 *
 * @author Johan Katherine Nore�a Bahamon
 */
public class Duenho {
    private String nombreCompleto;
    private String direccionDeDomicilio; 
    private int cedulaCiudadania;
    private String telefonoContacto;
    
    /**
     * Construye un objeto de tipo Duenho con los atributos de la clase
     * @param nombreCompleto Nombre completo del due�o de la mascota 
     * @param direccionDeDomicilio Direcci�n donde reside el due�o 
     * @param cedulaCiudadania Cedula de ciudadania del due�o 
     * @param telefonoContacto telefono fijo o m�vil del due�o de la mascota
     */

    public Duenho(String nombreCompleto, int cedulaCiudadania, String telefonoContacto, String direccionDeDomicilio) {
        this.nombreCompleto = nombreCompleto;
        this.direccionDeDomicilio = direccionDeDomicilio;
        this.cedulaCiudadania = cedulaCiudadania;
        this.telefonoContacto = telefonoContacto;
    }
    
    /**
     * Construye un objeto de tipo Duenho dejando la direcci�n y la cedula por defecto
     * @param nombreCompleto
     * @param telefonoContacto 
     */
    public Duenho(String nombreCompleto, String telefonoContacto){
        this.nombreCompleto = nombreCompleto;
        this.telefonoContacto = telefonoContacto;
        this.direccionDeDomicilio = "No hay data";
        this.cedulaCiudadania = 0;
    }
    
    // M�todos

    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccionDeDomicilio() {
        return direccionDeDomicilio;
    }

    public void setDireccionDeDomicilio(String direccionDeDomicilio) {
        this.direccionDeDomicilio = direccionDeDomicilio;
    }

    public int getCedulaCiudadania() {
        return cedulaCiudadania;
    }

    public void setCedulaCiudadania(int cedulaCiudadania) {
        this.cedulaCiudadania = cedulaCiudadania;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
    
}