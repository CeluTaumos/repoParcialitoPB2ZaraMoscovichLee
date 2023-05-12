package ar.edu.unlam.pb2.test.parcialito;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Efectivo extends Empleado {

	private ObraSocial obraSocial;
	private Double bonoMensual;
	private Integer horas;

	public Efectivo(String nombre, String apellido, Long CUIL, Long legajo, LocalDate fingreso, LocalDate fnac,
			Departamento departamento, ObraSocial obraSocial, Credencial credencial, Double sueldo) {
		super(nombre, apellido, CUIL, legajo, fingreso, fnac, departamento, credencial, sueldo);
		this.obraSocial = obraSocial;
		this.horas = 0;
		this.bonoMensual = 15000.0;
	}

	@Override
	public boolean abrirPuerta(Puerta puerta, Credencial credencial) {
		// La puerta se abre si el tipo coincide con el tipo de la credencial
		Boolean seAbrio = false;
		LocalDateTime fechaIngreso = LocalDateTime.now();
		if (puerta.meAbroConCredencial(credencial)) {
			credencial.guardarAcceso(seAbrio, puerta, fechaIngreso);
			seAbrio = true;
			this.horas++;
		}

		else {
			seAbrio = false;
			credencial.guardarAcceso(seAbrio, puerta, fechaIngreso);
		}
		return seAbrio;
	}

	@Override
	public Double cobrar(Double sueldo) {

		if (horas >= 3) {

			sueldo += this.bonoMensual;

			return sueldo;

		}
		return sueldo;

	}

	ObraSocial getObraSocial() {
		return obraSocial;
	}

	void setObraSocial(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
	}

	Double getBonoMensual() {
		return bonoMensual;
	}

	void setBonoMensual(Double bonoMensual) {
		this.bonoMensual = bonoMensual;
	}

	Integer getHoras() {
		return horas;
	}

	void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public Boolean abrirPuertaElDiaSig(Puerta puerta, Credencial credencial) {
		// La puerta se abre si el tipo coincide con el tipo de la credencial

		Boolean seAbrio = false;
		LocalDateTime fechaIngreso = LocalDateTime.now();
		LocalDateTime fechaIncrementada = fechaIngreso.plusDays(9);
		if (puerta.meAbroConCredencial(credencial)) {
			credencial.guardarAcceso(seAbrio, puerta, fechaIncrementada);
			seAbrio = true;
		}

		else {
			seAbrio = false;
			credencial.guardarAcceso(seAbrio, puerta, fechaIncrementada);
		}

		return seAbrio;

	}

}
