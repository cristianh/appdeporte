package co.edu.avanzada.negocio.beans.remote;

import java.util.List;

import entidades.Periodoactividad;

public interface IPeriodoactividad {

	public void crearPeriodo(Periodoactividad periodoactividad);

	public Periodoactividad buscarPeriodoActividad(String codigoperidoactividad);

	public void editarPeriodoActividad(Periodoactividad periodoactividad);

	public void eliminar(String codigoperidodoactividad);

	public List<Periodoactividad> Listarpiriodoactividad();

	public List<Periodoactividad> BuscarListaperidodactividad(String codigoaperiodoctividad); 
}
