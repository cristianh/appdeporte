package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.beans.remote.IPeriodoactividad;
import entidades.Periodoactividad;
import entidades.Tipoactividad;

@LocalBean
@Stateless
@Remote(IPeriodoactividad.class)
public class PeriodoactividadEJB implements IPeriodoactividad {

	@PersistenceContext
	EntityManager manager;
	
	public void crearPeriodo(Periodoactividad periodoactividad) {
		// TODO Auto-generated method stub
		manager.persist(periodoactividad);
		
	}

	public Periodoactividad buscarPeriodoActividad(String codigoperidoactividad) {
		// TODO Auto-generated method stub
		return manager.find(Periodoactividad.class, codigoperidoactividad);
	}

	public void editarPeriodoActividad(Periodoactividad periodoactividad) {
		// TODO Auto-generated method stub
		
	}

	public void eliminar(String codigoperidodoactividad) {
		// TODO Auto-generated method stub
		
	}

	public List<Periodoactividad> Listarpiriodoactividad() {
		// TODO Auto-generated method stub
		List<Periodoactividad> resultadoTransaccion = null;
		try {
			resultadoTransaccion =  manager.createNamedQuery("Periodoactividad.listarperiodoactividad").getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
			
		}
		return resultadoTransaccion;
	}

	public List<Periodoactividad> BuscarListaperidodactividad(String codigoaperiodoctividad) {
		// TODO Auto-generated method stub
		return null;
	}

}
