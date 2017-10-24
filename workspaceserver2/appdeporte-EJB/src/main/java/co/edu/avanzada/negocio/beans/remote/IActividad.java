package co.edu.avanzada.negocio.beans.remote;

import java.util.List;

import entidades.Actividad;
import entidades.Usuario;


public interface IActividad {

	public void crearActividad(Actividad actividad);

	public Actividad buscarActividad(String codigoactividad);
	
	public List<Actividad> buscarActividadporano(String actividadporano);

	public void editarActividad(Actividad actividad);

	public void eliminar(String codigoactividad);

	public List<Actividad> Listaractividad(Usuario usuario);

	public List<Actividad> BuscarListaactividad(String codigoactividad);
}
