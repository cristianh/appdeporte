package co.edu.avanzada.negocio.beans.remote;

import java.util.List;

import entidades.Usuario;

public interface IUsuario {

	public void crearUsuario(Usuario usuario);

	public Usuario buscarUsuario(String codigousuario);

	public void editarActividad(Usuario usuario);

	public void eliminar(String codigousuario);

	public List<Usuario> Listarusuario();

	public List<Usuario> BuscarListausuario(String codigousuario);
}
