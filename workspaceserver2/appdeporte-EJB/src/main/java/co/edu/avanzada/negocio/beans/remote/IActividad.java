package co.edu.avanzada.negocio.beans.remote;

import java.util.List;

import entidades.Actividad;


public interface IActividad {

	public void crearActividad(Actividad actividad);

	public Actividad buscarActividad(String codigoactividad);
	
	public List<Actividad> buscarActividadporano(String actividadporano);

	public void editarActividad(Actividad actividad);

	public void eliminar(String codigoactividad);

	public List<Actividad> Listaractividad();

	public List<Actividad> BuscarListaactividad(String codigoactividad);
}
