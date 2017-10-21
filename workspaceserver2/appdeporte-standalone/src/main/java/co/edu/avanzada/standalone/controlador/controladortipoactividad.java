package co.edu.avanzada.standalone.controlador;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.beans.remote.ITipoactividad;
import co.edu.avanzada.standalone.util.ServiceLocator;
import entidades.Tipoactividad;

public class controladortipoactividad {

	private ITipoactividad itipoactvidad;

	public controladortipoactividad() throws NamingException {
		// TODO Auto-generated constructor stub
		itipoactvidad = (ITipoactividad) ServiceLocator.buscarEJB("TipoactividadEJB", ITipoactividad.class.getCanonicalName());
	}

	public void crearTipoactividad(Tipoactividad tipoactividad) {
		itipoactvidad.creartipoactividad(tipoactividad);
	}

	public Tipoactividad buscarTipoCodigo(String codigotipoactividad) {
		return itipoactvidad.buscarTipoactividad(codigotipoactividad);
	}
}
