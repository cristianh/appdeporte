package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.beans.remote.IActividad;
import co.edu.avanzada.standalone.util.ServiceLocator;
import entidades.Actividad;

public class controladoractividad {

	private IActividad iactvidad;

	public controladoractividad() throws NamingException {
		// TODO Auto-generated constructor stub
		iactvidad = (IActividad) ServiceLocator.buscarEJB("ActividadEJB", IActividad.class.getCanonicalName());
	}

	public void crearActividad(Actividad actividad) {
		iactvidad.crearActividad(actividad);
	}

	public Actividad buscarActividadCodigo(String codigoactividad) {
		return iactvidad.buscarActividad(codigoactividad);
	}
	
	public List<Actividad> buscarActividadporano(String anoactividad) {
		return iactvidad.buscarActividadporano(anoactividad);
	}

}
