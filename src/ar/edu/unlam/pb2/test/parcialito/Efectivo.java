package ar.edu.unlam.pb2.test.parcialito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

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

<<<<<<< HEAD
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
=======
				Boolean seAbrio = false;
				LocalDateTime fechaIngreso= LocalDateTime.now();
				if (puerta.meAbroConCredencial(credencial)) {
					credencial.guardarAcceso(seAbrio, puerta, fechaIngreso);
					seAbrio = true;
				}
				
				else {
					seAbrio=false;
					credencial.guardarAcceso(seAbrio, puerta, fechaIngreso);
				}
>>>>>>> 172fb1a3291c03fe296f030a4765e5357b3d14ff

	}

<<<<<<< HEAD
	@Override
	public Double cobrar(Double sueldo) {
		
		Double sueldoConBono = sueldo + this.bonoMensual;

		Double sueldoFinal = this.sueldoInicial + sueldoConBono;

		return sueldoFinal;

	}

=======
	public Boolean abrirPuertaElDiaSig(Puerta puerta, Credencial credencial) {
		// La puerta se abre si el tipo coincide con el tipo de la credencial

		Boolean seAbrio = false;
		LocalDateTime fechaIngreso= LocalDateTime.now();
		fechaIngreso.plusDays(9);
		if (puerta.meAbroConCredencial(credencial)) {
			credencial.guardarAcceso(seAbrio, puerta, fechaIngreso);
			seAbrio = true;
		}
		
		else {
			seAbrio=false;
			credencial.guardarAcceso(seAbrio, puerta, fechaIngreso);
		}

		return seAbrio;
		
	}

	
>>>>>>> 172fb1a3291c03fe296f030a4765e5357b3d14ff

}
