package co.edu.avanzada.standalone.controlador;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.beans.remote.IActividad;
import co.edu.avanzada.negocio.beans.remote.IPeriodoactividad;
import co.edu.avanzada.standalone.util.ServiceLocator;
import entidades.Actividad;
import entidades.Periodoactividad;

public class controladorperiodoactividad {

	private IPeriodoactividad iperiodoactvidad;

	public controladorperiodoactividad() throws NamingException  {
		// TODO Auto-generated constructor stub
		iperiodoactvidad = (IPeriodoactividad) ServiceLocator.buscarEJB("PeriodoactividadEJB", IPeriodoactividad.class.getCanonicalName());
	}
	
	

	public void crearPeriodoActividad(Periodoactividad periodoactividad) {
		iperiodoactvidad.crearPeriodo(periodoactividad);
	}

	public Periodoactividad buscarPeriodoActividadCodigo(String codigoperiodoactividad) {
		return iperiodoactvidad.buscarPeriodoActividad(codigoperiodoactividad);
	}
}
