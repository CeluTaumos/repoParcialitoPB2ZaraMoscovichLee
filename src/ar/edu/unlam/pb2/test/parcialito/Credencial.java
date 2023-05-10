package ar.edu.unlam.pb2.test.parcialito;

public class Credencial {

	private Integer id;
	private TipoCredencial tipoDeCredencial;

	public Credencial(Integer id, TipoCredencial visitante) {
		this.id = id;
		this.tipoDeCredencial = visitante;
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
	
	

}
