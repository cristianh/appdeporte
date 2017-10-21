package co.edu.avanzada.standalone.controlador;

import javax.naming.NamingException;


import co.edu.avanzada.negocio.beans.remote.IUsuario;
import co.edu.avanzada.standalone.util.ServiceLocator;
import entidades.Usuario;

public class controladorusuario {

	private IUsuario iusuario;

	public controladorusuario() throws NamingException {
		// TODO Auto-generated constructor stub
		iusuario = (IUsuario) ServiceLocator.buscarEJB("UsuarioEJB", IUsuario.class.getCanonicalName());
	}
	 
	public void crearUsuario(Usuario usuario) {
		iusuario.crearUsuario(usuario);
	}

	public Usuario buscarUsuariouser(String userusuario) {
		return iusuario.buscarUsuario(userusuario);
	}
}
