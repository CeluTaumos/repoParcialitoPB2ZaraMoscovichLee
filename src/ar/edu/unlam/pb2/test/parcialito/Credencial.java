package ar.edu.unlam.pb2.test.parcialito;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;




public class Credencial {

	private Integer id;
	private TipoCredencial tipoDeCredencial;
	private ArrayList<Acceso> listaAccesos;

	public Credencial(Integer id, TipoCredencial visitante) {
		this.id = id;
		this.tipoDeCredencial = visitante;
		this.listaAccesos= new ArrayList<Acceso>();
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
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

	public boolean add(Acceso acceso) {

		return this.listaAccesos.add(acceso);

	}
	
	

}
