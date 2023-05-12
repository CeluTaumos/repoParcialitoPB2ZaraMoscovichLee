package ar.edu.unlam.pb2.test.parcialito;


public class Puerta {

	// ATRIBUTOS DE LA CLASE

	private Integer codigo;
	private Boolean abierta = false;
	private Boolean compatible = false;
	private TipoDePuerta tipodepuerta;

	// CONSTRUCTOR

	public Puerta(Integer codigo, TipoDePuerta tipodepuerta) {

		this.codigo = codigo;
		this.tipodepuerta = tipodepuerta;
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Boolean getAbierta() {
		return abierta;
	}

	public void setAbierta(Boolean abierta) {
		this.abierta = abierta;
	}

	public Boolean getCompatible() {
		return compatible;
	}

	public void setCompatible(Boolean compatible) {
		this.compatible = compatible;
	}

	public TipoDePuerta getTipodepuerta() {
		return tipodepuerta;
	}

	public void setTipodepuerta(TipoDePuerta tipodepuerta) {
		this.tipodepuerta = tipodepuerta;
	}
	
	// EL METODO QUE NOS DICE SI SE ABRE CON...
		public boolean meAbroConCredencial(Credencial credencial) {
			
			Integer intentosDeBloqueo =3;

			if (credencial.getTipoDeCredencial().equals(TipoCredencial.ALLACCESS)
					&& tipodepuerta.equals(TipoDePuerta.DEPOSITO) || tipodepuerta.equals(TipoDePuerta.ENTRADA)
					|| tipodepuerta.equals(TipoDePuerta.FABRICA)){
				this.compatible = true;}

			else if (credencial.getTipoDeCredencial().equals(TipoCredencial.RESIDENTE)
					&& tipodepuerta.equals(TipoDePuerta.ENTRADA) || tipodepuerta.equals(TipoDePuerta.FABRICA)) {
				
			this.compatible = true;}

			else if (credencial.getTipoDeCredencial().equals(TipoCredencial.PASANTE) && 
					tipodepuerta.equals(TipoDePuerta.ENTRADA)){
				
			this.compatible = true;}
			
			else {
				this.compatible=false;
				intentosDeBloqueo--;
				
				if(intentosDeBloqueo==0) {
					credencial.bloquear();
				}
			}

			return compatible;
		}

		public boolean verEstado(Credencial credencial) {
			
		return credencial.getBloqueada();
			
		}
	

}
