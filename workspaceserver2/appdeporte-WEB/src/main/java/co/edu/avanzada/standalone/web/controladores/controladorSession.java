package co.edu.avanzada.standalone.web.controladores;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;

import javax.servlet.http.HttpSession;

import co.edu.avanzada.negocio.beans.ActividadEJB;
import co.edu.avanzada.negocio.beans.SessionEJB;
import entidades.Actividad;
import entidades.Usuario;

@Named("sessionControler")
@SessionScoped
public class controladorSession implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String user;

	private String password;

	private Usuario usuario;

	@EJB
	private SessionEJB sessionEJB;

	

	@PostConstruct
	public void inicializar() {
	
	}

	public String login() {

		Usuario usuarioConsultado = sessionEJB.consultarUsuarioPorLLave(user);
		
		if (usuarioConsultado == null) {
			Messages.addGlobalError("Favor ingrese un usuario valido");
		} else {
			try{
				if(usuarioConsultado.getPassword().equals(password)) {
				usuario = usuarioConsultado;
				return "/paginas/seguro/inicio?faces-redirect=true";	
				
			}
				FacesContext.getCurrentInstance().addMessage(
						null,
						new FacesMessage(FacesMessage.SEVERITY_INFO, 
								"contraceña invalida", null));
				
			}catch (Exception exc){
				
				FacesContext.getCurrentInstance().addMessage(
						null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, 
							"", null));
			}
		}

		return null;

	}
	public String logout() {

		HttpSession session;
		session = (HttpSession) Faces.getSession();
		session.invalidate();
		usuario = null;

		return "/paginas/publico/login?faces-redirect=true";

	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public SessionEJB getSessionEJB() {
		return sessionEJB;
	}

	public void setSessionEJB(SessionEJB sessionEJB) {
		this.sessionEJB = sessionEJB;
	}

}
