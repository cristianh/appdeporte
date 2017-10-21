package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.TipoactividadEJB;
import entidades.*;

@Named
@FacesConverter(value = "tipoactividadConverter", forClass = Tipoactividad.class)
public class TipoactividadConverter implements Converter {

	@EJB
	private TipoactividadEJB tipoactividadEJB;

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null || arg2.trim().length() == 0 || arg2.equals("Seleccione")) {
			return null;
		}

		final String idtipoactividad = arg2;
		Tipoactividad tipoactividad = tipoactividadEJB.buscarTipoactividad(String.valueOf(idtipoactividad));
		return tipoactividad;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null) {
			return null;
		}
	
		if (arg2 instanceof Tipoactividad) {
			Tipoactividad tipoactividad = (Tipoactividad) arg2;

			// Se obtiene el id de la entidad seleccionada
			final String idtipoactividad = tipoactividad.getIdtipoactividad();

			return idtipoactividad;
		} else {

			throw new IllegalArgumentException();
		}
	}

}
