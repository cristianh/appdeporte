package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.avanzada.negocio.beans.remote.IActividad;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import entidades.Actividad;
import entidades.Usuario;


@LocalBean
@Stateless
@Remote(IActividad.class)
public class ActividadEJB implements IActividad {

	@PersistenceContext
	EntityManager manager;

	public void crearActividad(Actividad actividad) {
		// TODO Auto-generated method stub
		Actividad busc = buscarActividad(actividad.getIdactividad());
		if (busc == null) {
			manager.persist(actividad);
		} else {
			throw new ExcepcionNegocio("Esta actividad ya existe");
		}

	}

	public Actividad buscarActividad(String codigoactividad) {
		// TODO Auto-generated method stub
		return manager.find(Actividad.class, codigoactividad);
	}

	public void editarActividad(Actividad actividad) {
		// TODO Auto-generated method stub

	}

	public void eliminar(String codigoactividad) {
		// TODO Auto-generated method stub
		Actividad busc = buscarActividad(codigoactividad);
		if (busc != null) {
			manager.remove(busc);
		} else {
			throw new ExcepcionNegocio("error al tratar de eliminar el cliente");
		}
	}

	public List<Actividad> Listaractividad(Usuario usuario) {
		List<Actividad> resultadoTransaccion = null;
		try {
			Query consulta  = manager.createNamedQuery("Actividad.listaractividades");
			consulta.setParameter("usuario", usuario.getUser());
			resultadoTransaccion=consulta.getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());

		}
		return resultadoTransaccion;
	}

	public List<Actividad> BuscarListaactividad(String codigoactividad) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Actividad> buscarActividadporano(String actividadporano) {
		// TODO Auto-generated method stub
		List<Actividad> resultadoTransaccion = null;
		try {
			Query consulta = manager
					.createQuery("Select a from Actividad a where a.fechahoraactividad like :parametro");
			consulta.setParameter("parametro", "%" + actividadporano);
			resultadoTransaccion = consulta.getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());

		}
		return resultadoTransaccion;
	}

	public List<Actividad> buscarActividadpormes(String actividadpormes) {
		// TODO Auto-generated method stub
		List<Actividad> resultadoTransaccion = null;
		try {
			Query consulta = manager
					.createQuery("Select a from Actividad a where a.fechahoraactividad like :parametro");
			consulta.setParameter("parametro", "%" + actividadpormes + "%");
			resultadoTransaccion = consulta.getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());

		}
		return resultadoTransaccion;
	}

	public List<Actividad> buscarActividadportipo(String actividadportipo) {
		List<Actividad> resultadoTransaccion = null;
		try {
			Query consulta = manager
					.createQuery("Select a from Actividad a where a.tipoactividad.Idtipoactividad=:parametro");
			consulta.setParameter("parametro", actividadportipo);
			resultadoTransaccion = consulta.getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());

		}
		return resultadoTransaccion;
	}
	
}
