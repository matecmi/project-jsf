/**
 * 
 */
package com.devpredator.projectjsf.entity;

/**
 * @author kevin
 *Clase que representa entidades de empleado
 */
public class Empleado {

	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String puesto;
	private boolean estatus;
	/**
	 * @return the nombreL
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombreL the nombreL to set
	 */
	public void setNombre(String nombreL) {
		this.nombre = nombreL;
	}
	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}
	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}
	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}
	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	/**
	 * @return the estatus
	 */
	public boolean getEstatus() {
		return estatus;
	}
	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}
	
	
	
}
