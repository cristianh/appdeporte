package co.edu.avanzada.negocio.beans.remote;

import java.util.List;

import entidades.Tipoactividad;

public interface ITipoactividad {
	
	public void creartipoactividad(Tipoactividad tipoactividad);

	public Tipoactividad buscarTipoactividad(String codigotipoactividad);

	public void editarTipoactividad(Tipoactividad tipoactividad);

	public void eliminar(String codigotipoactividad);

	public List<Tipoactividad> Listartipoactividad();

	public List<Tipoactividad> BuscarListatipoactividad(String codigotipoactividad);

}
