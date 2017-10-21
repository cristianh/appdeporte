package entidades;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/*
 * -t_actividad
idactividad
nombreactividad
fechahora
duracion
distancia

 */
@Entity
@Table(name="t_actividad")
@NamedQueries({ @NamedQuery(name = "Actividad.listaractividades", query = "SELECT a FROM Actividad a"),
	@NamedQuery(name = "Actividad.buscarlistarciudades", query = "SELECT a FROM Actividad a where a.idactividad=:id") })
public class Actividad implements Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Idactividad",unique=true,length=12,nullable=false)
	private String idactividad;
	
	@Column(name="nombreactividad",length=100,nullable=false)
	private String nombreactividad;
	
	
	@Column(name = "fechaactividad")
	private String fechahoraactividad;
	    
	@Column(name = "horaactividad")
	private String horaactividad;
	
	@Column(name="duracionactividad",length=50,nullable=false)
	private String duracionactividad;
	
	@Column(name="distanciaactividad",length=50,nullable=false)
	private String distancia;
	
	@ManyToOne
	@JoinColumn(name="tipoactividad",nullable=false)
	private Tipoactividad tipoactividad;
	
	
	
	
	public Actividad() {
		// TODO Auto-generated constructor stub
	}




	public Actividad(String idactividad, String nombreactividad, String fechahoraactividad, String horaactividad,
			String duracionactividad, String distancia, Tipoactividad tipoactividad) {
		super();
		this.idactividad = idactividad;
		this.nombreactividad = nombreactividad;
		this.fechahoraactividad = fechahoraactividad;
		this.horaactividad = horaactividad;
		this.duracionactividad = duracionactividad;
		this.distancia = distancia;
		this.tipoactividad = tipoactividad;
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




	public String getFechahoraactividad() {
		return fechahoraactividad;
	}




	public void setFechahoraactividad(String fechahoraactividad) {
		this.fechahoraactividad = fechahoraactividad;
	}




	public String getHoraactividad() {
		return horaactividad;
	}




	public void setHoraactividad(String horaactividad) {
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




	public Tipoactividad getTipoactividad() {
		return tipoactividad;
	}




	public void setTipoactividad(Tipoactividad tipoactividad) {
		this.tipoactividad = tipoactividad;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idactividad == null) ? 0 : idactividad.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actividad other = (Actividad) obj;
		if (idactividad == null) {
			if (other.idactividad != null)
				return false;
		} else if (!idactividad.equals(other.idactividad))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Actividad [idactividad=" + idactividad + ", nombreactividad=" + nombreactividad
				+ ", fechahoraactividad=" + fechahoraactividad + ", horaactividad=" + horaactividad
				+ ", duracionactividad=" + duracionactividad + ", distancia=" + distancia + ", tipoactividad="
				+ tipoactividad + "]";
	}

	


	}
