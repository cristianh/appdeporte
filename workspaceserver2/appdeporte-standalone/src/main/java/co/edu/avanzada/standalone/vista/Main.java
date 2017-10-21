package co.edu.avanzada.standalone.vista;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.naming.NamingException;
import co.edu.avanzada.standalone.controlador.*;
import entidades.Actividad;
import entidades.Periodoactividad;
import entidades.Tipoactividad;
import entidades.Usuario;


public class Main {

	private static controladoractividad controladoractividad;
	private static controladortipoactividad controladortipoactividad;
	private static controladorperiodoactividad controladorperidoactividad;
	private static controladorusuario controladorusuario;
	
	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		
		controladoractividad =new controladoractividad();
		controladortipoactividad =new controladortipoactividad();
		controladorperidoactividad= new controladorperiodoactividad();
		controladorusuario= new controladorusuario();
		
		Periodoactividad periodo1=new Periodoactividad();
		periodo1.setIdperiodoactividad("1");
		periodo1.setNombreperiodo("Año actual");
		controladorperidoactividad.crearPeriodoActividad(periodo1);
		
		Periodoactividad periodo2=new Periodoactividad();
		periodo2.setIdperiodoactividad("2");
		periodo2.setNombreperiodo("Mes actual");
		controladorperidoactividad.crearPeriodoActividad(periodo2);
		
		Tipoactividad tipoactividad1= new Tipoactividad();
		tipoactividad1.setIdtipoactividad("1");
		tipoactividad1.setNombreactividad("Ciclismo");
		
		Tipoactividad tipoactividad2= new Tipoactividad();
		tipoactividad2.setIdtipoactividad("2");
		tipoactividad2.setNombreactividad("Running");
		
		controladortipoactividad.crearTipoactividad(tipoactividad1);
		controladortipoactividad.crearTipoactividad(tipoactividad2);
		
		Date date = new Date();
		DateFormat horasformat= new SimpleDateFormat("HH:mm:ss");
		System.out.println(horasformat.format(date));
		DateFormat fechaformat= new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(fechaformat.format(date));
		
		
		Actividad actividad1=new Actividad();
		actividad1.setNombreactividad("Caminata en cicla");
		actividad1.setIdactividad("1");
		actividad1.setDistancia("20km");
		actividad1.setDuracionactividad("1:30:00");		
		actividad1.setFechahoraactividad(fechaformat.format(date));
		actividad1.setHoraactividad(horasformat.format(date));
		actividad1.setTipoactividad(tipoactividad1);
	
		controladoractividad.crearActividad(actividad1);
		

		Usuario usuario1= new Usuario();
		usuario1.setUser("crusto2009");
		usuario1.setPassword("1234");
		usuario1.setIdactividad(actividad1);
		controladorusuario.crearUsuario(usuario1);

	}

}
