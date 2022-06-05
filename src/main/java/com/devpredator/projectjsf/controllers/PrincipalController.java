/**
 * 
 */
package com.devpredator.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.projectjsf.entity.Empleado;
import com.devpredator.projectjsf.services.EmpleadoService;

/**
 * @author kevin
 *Clase controller que se encarga de procesar la informacion para la pantalla principal .xhtml
 */
@ManagedBean
@ViewScoped
public class PrincipalController {

	/**
	 * Lista de empleados para la tabla
	 */
	private List<Empleado> empleados;
	/**
	 * Servicio con los metodos que realizan la logica de negocio de empleado
	 */
	
	private EmpleadoService empleadoService = new EmpleadoService();
	/**
	 * Metodo que se encarga de inicializar la informacion de la pantalla principal 
	 */
	@PostConstruct
	public void init() {
		
		this.consultarEmpleados();
	}
	
	/**
	 * Metodo que consulta la lista de empleado
	 */
	
	public void consultarEmpleados() {
		
		this.empleados=this.empleadoService.consultarEmpleado();
		
	} 

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	

	
}
