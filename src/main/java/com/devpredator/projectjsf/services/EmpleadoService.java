/**
 * 
 */
package com.devpredator.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.projectjsf.entity.Empleado;

/**
 * @author kevin
 * Clase que permite realizar la logica de negocio para empleado
 */
public class EmpleadoService {

	
	//metodo que permite consultar la lista de empleados de empresas de TI
	//@return {@link Empleado} Lista de empleados
	public List<Empleado> consultarEmpleado(){
		
		//Generar la lista de empleados a consultar
		List<Empleado> empleados= new ArrayList<Empleado>();
		
		Empleado empleadoIBM =new Empleado();
		Empleado empleadoMicrosoft= new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("Lopez");
		empleadoIBM.setPuesto("senior developer java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("kevin");
		empleadoMicrosoft.setPrimerApellido("salazar");
		empleadoMicrosoft.setSegundoApellido("villanueva");
		empleadoMicrosoft.setPuesto("senior developer php");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("leliz");
		empleadoApple.setPrimerApellido("vidarte");
		empleadoApple.setSegundoApellido("davila");
		empleadoApple.setPuesto("senior developer c#");
		empleadoApple.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoApple);
		empleados.add(empleadoMicrosoft);
		
		return empleados;
	}
}
