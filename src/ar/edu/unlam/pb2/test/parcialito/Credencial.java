package ar.edu.unlam.pb2.test.parcialito;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Credencial {

	private Integer id;
	private Boolean bloqueada;
	private TipoCredencial tipoDeCredencial;
	private ArrayList<Acceso> listaAccesos;
	private ArrayList<Acceso> listaAccesosEnUnDía;

	public Credencial(Integer id, TipoCredencial visitante) {
		this.id = id;
		this.bloqueada=false;
		this.tipoDeCredencial = visitante;
		this.listaAccesos = new ArrayList<Acceso>();
	}

	Integer getId() {
		return id;
	}

	void setId(Integer id) {
		this.id = id;
	}

	TipoCredencial getTipoDeCredencial() {
		return tipoDeCredencial;
	}

	void setTipoDeCredencial(TipoCredencial tipoDeCredencial) {
		this.tipoDeCredencial = tipoDeCredencial;
	}

	public Integer getCantidadAccesos() {
		return listaAccesos.size();
	}
	
	

	public Boolean getBloqueada() {
		return bloqueada;
	}

	public void setBloqueada(Boolean bloqueada) {
		this.bloqueada = bloqueada;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public ArrayList<Acceso> getListaAccesos() {
		return listaAccesos;
	}

	protected void setListaAccesos(ArrayList<Acceso> listaAccesos) {
		this.listaAccesos = listaAccesos;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Credencial other = (Credencial) obj;
		return Objects.equals(id, other.id);
	}

	public void guardarAcceso(Boolean seAbrio, Puerta puerta, LocalDateTime fechaIngreso) {

		Acceso accesoReciente = new Acceso(seAbrio, fechaIngreso, puerta);
		this.listaAccesos.add(accesoReciente);

	}

	public boolean bloquear() {
		
		return this.bloqueada=true;
		
		
	}
    
	//PARA FILTRAR ACCESOS DE UN DÍA ESPECÍFICO
	public Integer  getAccesosDeUnDía(LocalDateTime hoy) {
		for (Acceso acceso : listaAccesos) {
			if(acceso.getFecha().equals(hoy))
				listaAccesosEnUnDía.add(acceso);
			return listaAccesosEnUnDía.size();
		}
		
		return listaAccesosEnUnDía.size();
		
	}
	
	

}
