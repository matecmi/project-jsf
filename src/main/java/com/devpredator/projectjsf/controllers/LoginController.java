package com.devpredator.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;

/* Clase que permite controlar el funcionamiento con la pantalla login.xhtml
 * 
 */

@ManagedBean
public class LoginController {

	/* Usuario que ingresa al login */
	private String usuario;

	/* contraseña ingresada al login */
	private String password;

	/* Metodo que permite ingresar a la pantalla principal del proyecto */
	public void ingresar() {

		System.out.println("Usuario: " + usuario);

		if (usuario.equals("leliz") && password.equals("neutrino123")) {
		
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "la pagina no existe", ""));
				e.printStackTrace();
			}
			
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrecto", ""));

		}
	}
	
	
	private void redireccionar(String pagina) throws IOException {
		
		ExternalContext ec= FacesContext.getCurrentInstance().getExternalContext();
		
		ec.redirect(pagina);
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
