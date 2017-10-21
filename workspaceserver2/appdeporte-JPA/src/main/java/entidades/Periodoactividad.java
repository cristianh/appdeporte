package entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/*
 * -t_periodoactividad
idperiodoactividad
fecha
 */
@Entity
@Table(name="t_periodoactividad")
@NamedQueries({ @NamedQuery(name = "Periodoactividad.listarperiodoactividad", query = "SELECT p FROM Periodoactividad p"),
	@NamedQuery(name = "Periodoactividad.buscarlistarperiodoactividad", query = "SELECT p FROM Periodoactividad p where p.idperiodoactividad=:id") })
public class Periodoactividad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idperiodoactividad",nullable=false,unique=true,length=20)
	private String idperiodoactividad;
	
	@Column(name="nombreperidoactividad",length=100,nullable=false)
	private String nombreperiodo;
	
	public Periodoactividad() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Periodoactividad(String idperiodoactividad, String nombreperiodo) {
		super();
		this.idperiodoactividad = idperiodoactividad;
		this.nombreperiodo = nombreperiodo;
	}



	public String getIdperiodoactividad() {
		return idperiodoactividad;
	}

	public void setIdperiodoactividad(String idperiodoactividad) {
		this.idperiodoactividad = idperiodoactividad;
	}

	public String getNombreperiodo() {
		return nombreperiodo;
	}

	public void setNombreperiodo(String nombreperiodo) {
		this.nombreperiodo = nombreperiodo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idperiodoactividad == null) ? 0 : idperiodoactividad.hashCode());
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
		Periodoactividad other = (Periodoactividad) obj;
		if (idperiodoactividad == null) {
			if (other.idperiodoactividad != null)
				return false;
		} else if (!idperiodoactividad.equals(other.idperiodoactividad))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Periodoactividad [idperiodoactividad=" + idperiodoactividad + ", nombreperiodo=" + nombreperiodo + "]";
	}
	
	
	
	
	
	
}
