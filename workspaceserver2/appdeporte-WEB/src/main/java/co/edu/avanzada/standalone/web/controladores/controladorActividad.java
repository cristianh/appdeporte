package co.edu.avanzada.standalone.web.controladores;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.ActividadEJB;
import co.edu.avanzada.negocio.beans.PeriodoactividadEJB;
import co.edu.avanzada.negocio.beans.TipoactividadEJB;
import entidades.Actividad;
import entidades.Periodoactividad;
import entidades.Tipoactividad;

@ViewScoped
@Named("controladorActividad")
public class controladorActividad implements Serializable {

	private String idactividad;

	private String nombreactividad;

	private Date fechaactividad;

	private Date horaactividad;

	private String duracionactividad;

	private String distancia;

	private Tipoactividad tipoactividadseleccionada;

	private Periodoactividad peridoactividadseleccionado;

	private Actividad actividad;

	@EJB
	private ActividadEJB actividadejb;

	@EJB
	private TipoactividadEJB tipoactividadejb;

	@EJB
	private PeriodoactividadEJB periodoactividadejb;

	private List<Actividad> listaractividad;
	private List<Tipoactividad> listartipoactividad;
	private List<Periodoactividad> listarperiodoactividad;

	@PostConstruct
	public void initializar() {
		listaractividad = actividadejb.Listaractividad();
		listartipoactividad = tipoactividadejb.Listartipoactividad();
		listarperiodoactividad = periodoactividadejb.Listarpiriodoactividad();

	}

	public Periodoactividad getPeridoactividadseleccionado() {
		return peridoactividadseleccionado;
	}

	public void setPeridoactividadseleccionado(Periodoactividad peridoactividadseleccionado) {
		this.peridoactividadseleccionado = peridoactividadseleccionado;
	}

	public PeriodoactividadEJB getPeriodoactividadejb() {
		return periodoactividadejb;
	}

	public void setPeriodoactividadejb(PeriodoactividadEJB periodoactividadejb) {
		this.periodoactividadejb = periodoactividadejb;
	}

	public List<Periodoactividad> getListarperiodoactividad() {
		return listarperiodoactividad;
	}

	public void setListarperiodoactividad(List<Periodoactividad> listarperiodoactividad) {
		this.listarperiodoactividad = listarperiodoactividad;
	}

	public String getIdactividad() {
		return idactividad;
	}

	public void setIdactividad(String idactividad) {
		this.idactividad = idactividad;
	}

	public String getNombreactividad() {
		return nombreactividad;
	}

	public void setNombreactividad(String nombreactividad) {
		this.nombreactividad = nombreactividad;
	}

	public Date getFechaactividad() {
		return fechaactividad;
	}

	public void setFechaactividad(Date fechaactividad) {
		this.fechaactividad = fechaactividad;
	}

	public Date getHoraactividad() {
		return horaactividad;
	}

	public void setHoraactividad(Date horaactividad) {
		this.horaactividad = horaactividad;
	}

	public String getDuracionactividad() {
		return duracionactividad;
	}

	public void setDuracionactividad(String duracionactividad) {
		this.duracionactividad = duracionactividad;
	}

	public String getDistancia() {
		return distancia;
	}

	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}

	public Tipoactividad getTipoactividadseleccionada() {
		return tipoactividadseleccionada;
	}

	public void setTipoactividadseleccionada(Tipoactividad tipoactividadseleccionada) {
		this.tipoactividadseleccionada = tipoactividadseleccionada;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public ActividadEJB getActividadejb() {
		return actividadejb;
	}

	public void setActividadejb(ActividadEJB actividadejb) {
		this.actividadejb = actividadejb;
	}

	public TipoactividadEJB getTipoactividadejb() {
		return tipoactividadejb;
	}

	public void setTipoactividadejb(TipoactividadEJB tipoactividadejb) {
		this.tipoactividadejb = tipoactividadejb;
	}

	public List<Actividad> getListaractividad() {
		return listaractividad;
	}

	public void setListaractividad(List<Actividad> listaractividad) {
		this.listaractividad = listaractividad;
	}

	public List<Tipoactividad> getListartipoactividad() {
		return listartipoactividad;
	}

	public void setListartipoactividad(List<Tipoactividad> listartipoactividad) {
		this.listartipoactividad = listartipoactividad;
	}

	public void seleccionTipoactividad() {
		listaractividad = actividadejb.buscarActividadportipo(tipoactividadseleccionada.getIdtipoactividad());
		setListaractividad(listaractividad);
		return;
	}

	public void seleccionPeriodoactividad() {
		if (peridoactividadseleccionado.getIdperiodoactividad().equals("1")) {
			Date fechaactual = new Date();
			DateFormat fechaformat = new SimpleDateFormat("YYYY");
			listaractividad = actividadejb.buscarActividadporano(fechaformat.format(fechaactual));
			setListaractividad(listaractividad);
		} else {
			Date fechaactual = new Date();
			DateFormat fechaformat = new SimpleDateFormat("MM/yyyy");
			listaractividad = actividadejb.buscarActividadpormes(fechaformat.format(fechaactual));
			setListaractividad(listaractividad);
		}
		return;
	}

	public void crearActividad() {
		DateFormat horasformat = new SimpleDateFormat("HH:mm:ss");
		DateFormat fechaformat = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat duracionformat = new SimpleDateFormat("HH:mm:ss");
		Actividad actividad1 = new Actividad(idactividad, nombreactividad, fechaformat.format(fechaactividad),
				horasformat.format(horaactividad), duracionformat.format(duracionactividad), distancia,
				tipoactividadseleccionada);
		actividadejb.crearActividad(actividad1);
	}

	public void eliminaractividad() {
		actividadejb.eliminar(actividad.getIdactividad());
	}

}
