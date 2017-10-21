package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.PeriodoactividadEJB;
import entidades.Periodoactividad;
import entidades.Tipoactividad;


@Named
@FacesConverter(value = "periodoactividadConverter", forClass = Periodoactividad.class)
public class PeriodoactividadConverter implements Converter {

	@EJB
	private PeriodoactividadEJB periodoactividadEJB;
	
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null || arg2.trim().length() == 0 || arg2.equals("Seleccione")) {
			return null;
		}

		final String idperiodoactividad = arg2;
		Periodoactividad periodoactividad = periodoactividadEJB.buscarPeriodoActividad(String.valueOf(idperiodoactividad));
		System.out.println("Object"+periodoactividad);
		return periodoactividad;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null) {
			return null;
		}
	
		if (arg2 instanceof Periodoactividad) {
			Periodoactividad periodoactividad = (Periodoactividad) arg2;

			// Se obtiene el id de la entidad seleccionada
			final String idperiodoactividad = periodoactividad.getIdperiodoactividad();
			System.out.println("Id"+idperiodoactividad);
			return idperiodoactividad;
		} else {

			throw new IllegalArgumentException();
		}
	}

}
