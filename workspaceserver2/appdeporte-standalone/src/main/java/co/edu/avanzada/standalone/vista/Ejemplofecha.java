package co.edu.avanzada.standalone.vista;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.naming.NamingException;

import co.edu.avanzada.standalone.controlador.controladoractividad;
import co.edu.avanzada.standalone.controlador.controladorperiodoactividad;
import co.edu.avanzada.standalone.controlador.controladortipoactividad;
import co.edu.avanzada.standalone.controlador.controladorusuario;
public class Ejemplofecha {
	
	public static void main(String[] args) throws NamingException {
	
		Date date = new Date();
		DateFormat horasformat= new SimpleDateFormat("HH:mm:ss");
		System.out.println(horasformat.format(date));
		DateFormat fechaformat= new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(fechaformat.format(date));
	}

}
