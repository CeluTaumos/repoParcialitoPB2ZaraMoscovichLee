package ar.edu.unlam.pb2.test.parcialito;

import java.time.LocalDate;

public class Efectivo extends Empleado {

	private ObraSocial obraSocial;

	public Efectivo(String nombre, String apellido, Long CUIL, Long legajo, LocalDate fingreso, LocalDate fnac,
			Departamento departamento, ObraSocial obraSocial, Credencial credencial) {
		super(nombre, apellido, CUIL, legajo, fingreso, fnac, departamento, credencial);
		this.obraSocial = obraSocial;

	}

}
