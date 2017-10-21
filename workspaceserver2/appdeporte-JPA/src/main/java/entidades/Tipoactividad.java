package entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 * Idtipoactividad
 * nombreatipoctividad
 */

@Entity
@Table(name="t_tipoactividad")
@NamedQueries({ @NamedQuery(name = "Tipoactividad.listartipoactividad", query = "SELECT t FROM Tipoactividad t"),
	@NamedQuery(name = "Tipoactividad.buscarlistartipoactividad", query = "SELECT t FROM Tipoactividad t where t.Idtipoactividad=:id") })
public class Tipoactividad implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idtipoactividad",nullable=false,unique=true)
	private String Idtipoactividad;
	
	@Column(name="nombretipoactividad",length=100)
	private String nombretipoactividad;
	
	@OneToMany(mappedBy="tipoactividad")
	private List<Actividad> actividad;
	
	public Tipoactividad() {
		// TODO Auto-generated constructor stub
	}

	public Tipoactividad(String idtipoactividad, String nombreactividad) {
		super();
		Idtipoactividad = idtipoactividad;
		this.nombretipoactividad = nombreactividad;
	}

	public String getIdtipoactividad() {
		return Idtipoactividad;
	}

	public void setIdtipoactividad(String idtipoactividad) {
		Idtipoactividad = idtipoactividad;
	}

	public String getNombreactividad() {
		return nombretipoactividad;
	}

	public void setNombreactividad(String nombreactividad) {
		this.nombretipoactividad = nombreactividad;
	}

	

	
	public String getNombretipoactividad() {
		return nombretipoactividad;
	}

	public void setNombretipoactividad(String nombretipoactividad) {
		this.nombretipoactividad = nombretipoactividad;
	}

	public List<Actividad> getActividad() {
		return actividad;
	}

	public void setActividad(List<Actividad> actividad) {
		this.actividad = actividad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Idtipoactividad == null) ? 0 : Idtipoactividad.hashCode());
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
		Tipoactividad other = (Tipoactividad) obj;
		if (Idtipoactividad == null) {
			if (other.Idtipoactividad != null)
				return false;
		} else if (!Idtipoactividad.equals(other.Idtipoactividad))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tipoactividad [Idtipoactividad=" + Idtipoactividad + ", nombretipoactividad=" + nombretipoactividad
				+ "]";
	}

	

	
	
	

}
