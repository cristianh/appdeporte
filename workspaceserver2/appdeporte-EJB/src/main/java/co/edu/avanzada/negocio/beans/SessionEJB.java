package co.edu.avanzada.negocio.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entidades.Usuario;

@Stateless
@LocalBean
public class SessionEJB {

	@PersistenceContext
	EntityManager manager;
	
	public Usuario consultarUsuarioPorLLave(String user){
		System.out.println(manager.find(Usuario.class, user));
		return manager.find(Usuario.class, user);
		
	}
}
