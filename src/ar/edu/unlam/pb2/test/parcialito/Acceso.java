package ar.edu.unlam.pb2.test.parcialito;

import java.time.LocalDateTime;

public class Acceso {

	private boolean permiso = false;
	private LocalDateTime fecha;
	Puerta puerta;
	String permisoEstado;

	public Acceso(boolean permiso, LocalDateTime fecha, Puerta puerta) {
		this.permiso = permiso;
		this.fecha = LocalDateTime.now();
		this.puerta = puerta;

	}

	public Puerta getPuerta() {
		return puerta;
	}

	public void setPuerta(Puerta puerta) {
		this.puerta = puerta;
	}

	public boolean isPermiso() {
		return permiso;
	}

	public void setPermiso(boolean permiso) {
		this.permiso = permiso;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public void permiso() {

		if (this.permiso) {
			this.permisoEstado = "Concedido";

		} else {
			this.permisoEstado = "Denegado";
		}

	}

	@Override
	public String toString() {
		return "Acceso [permiso=" + permisoEstado + ", fecha=" + fecha + ", puerta=" + puerta + "]";
	}

}
