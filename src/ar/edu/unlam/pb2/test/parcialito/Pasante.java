package ar.edu.unlam.pb2.test.parcialito;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pasante extends Empleado {

	private LocalDate fCaducidad;
	private Double porcentajeDeDescuento;

	public Pasante(String nombre, String apellido, Long CUIL, Long legajo, LocalDate fingreso, LocalDate fnac,
			Departamento departamento, LocalDate fCaducidad, Credencial credencial, Double sueldo) {
		super(nombre, apellido, CUIL, legajo, fingreso, fnac, departamento, credencial, sueldo);
		this.fCaducidad = fCaducidad;
		this.porcentajeDeDescuento = 0.20;
	}

	public LocalDate getfCaducidad() {
		return fCaducidad;
	}

	public void setfCaducidad(LocalDate fCaducidad) {
		this.fCaducidad = fCaducidad;
	}

	@Override
	public boolean abrirPuerta(Puerta puerta, Credencial credencial) {
		Boolean seAbrio = false;
		LocalDateTime fechaIngreso = LocalDateTime.now();
		if (puerta.meAbroConCredencial(credencial))
			credencial.guardarAcceso(seAbrio, puerta, fechaIngreso);
		seAbrio = true;

		return seAbrio;
	}

	@Override

	public Double cobrar(Double sueldo) {

		Double sueldoConPorcentaje = sueldo * this.porcentajeDeDescuento;

		return sueldoConPorcentaje;

	}

}
