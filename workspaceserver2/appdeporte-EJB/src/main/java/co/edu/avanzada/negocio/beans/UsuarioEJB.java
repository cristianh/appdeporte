package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.beans.remote.IUsuario;
import entidades.Usuario;

@LocalBean
@Stateless
@Remote(IUsuario.class)
public class UsuarioEJB implements IUsuario {

	@PersistenceContext
	EntityManager manager;
	
	public void crearUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		manager.persist(usuario);
	}

	public Usuario buscarUsuario(String codigousuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public void editarActividad(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	public void eliminar(String codigousuario) {
		// TODO Auto-generated method stub
		
	}

	public List<Usuario> Listarusuario() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Usuario> BuscarListausuario(String codigousuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
