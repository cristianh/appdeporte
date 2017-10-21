package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.avanzada.negocio.beans.remote.ITipoactividad;
import entidades.Actividad;
import entidades.Tipoactividad;

@LocalBean
@Stateless
@Remote(ITipoactividad.class)
public class TipoactividadEJB implements ITipoactividad {

	@PersistenceContext
	EntityManager manager;
	
	public void creartipoactividad(Tipoactividad tipoactividad) {
		// TODO Auto-generated method stub
		manager.persist(tipoactividad);
	}

	public Tipoactividad buscarTipoactividad(String codigotipoactividad) {
		// TODO Auto-generated method stub
		return manager.find(Tipoactividad.class, codigotipoactividad);
	}

	public void editarTipoactividad(Tipoactividad tipoactividad) {
		// TODO Auto-generated method stub
		
	}

	public void eliminar(String codigotipoactividad) {
		// TODO Auto-generated method stub
		
	}

	public List<Tipoactividad> Listartipoactividad() {
		// TODO Auto-generated method stub
		List<Tipoactividad> resultadoTransaccion = null;
		try {
			resultadoTransaccion =  manager.createNamedQuery("Tipoactividad.listartipoactividad").getResultList();
			System.out.println("resultadoTransaccion"+resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
			
		}
		return resultadoTransaccion;
	}

	public List<Tipoactividad> BuscarListatipoactividad(String codigotipoactividad) {
		// TODO Auto-generated method stub
		return null;
	}

}
