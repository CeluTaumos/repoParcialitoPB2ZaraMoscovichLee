package ar.edu.unlam.pb2.test.parcialito;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Efectivo extends Empleado {

	private ObraSocial obraSocial;
	private Double bonoMensual;
	
	public Efectivo(String nombre, String apellido, Long CUIL, Long legajo, LocalDate fingreso, LocalDate fnac,
			Departamento departamento, ObraSocial obraSocial, Credencial credencial, Double sueldo) {
		super(nombre, apellido, CUIL, legajo, fingreso, fnac, departamento, credencial, sueldo);
		this.obraSocial = obraSocial;

	}

	@Override
	public boolean abrirPuerta(Puerta puerta, Credencial credencial) {
		// La puerta se abre si el tipo coincide con el tipo de la credencial

		Boolean seAbrio = false;
		LocalDateTime fechaIngreso = LocalDateTime.now();
		if (puerta.meAbroConCredencial(credencial)) {
			credencial.guardarAcceso(seAbrio, puerta, fechaIngreso);
			seAbrio = true;
		}

		else {
			seAbrio = false;
			credencial.guardarAcceso(seAbrio, puerta, fechaIngreso);
		}

		return seAbrio;

	}

	@Override
	public Double cobrar(Double sueldo) {
		
		Double sueldoConBono = sueldo + this.bonoMensual;

		Double sueldoFinal = this.sueldoInicial + sueldoConBono;

		return sueldoFinal;

	}


}
