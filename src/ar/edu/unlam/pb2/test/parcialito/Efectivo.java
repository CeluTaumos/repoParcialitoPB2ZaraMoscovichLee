package ar.edu.unlam.pb2.test.parcialito;

import java.time.LocalDate;

public class Efectivo extends Empleado {

	private ObraSocial obraSocial;

	public Efectivo(String nombre, String apellido, Long CUIL, Long legajo, LocalDate fingreso, LocalDate fnac,
			Departamento departamento, ObraSocial obraSocial, Credencial credencial, Double sueldo) {
		super(nombre, apellido, CUIL, legajo, fingreso, fnac, departamento, credencial, sueldo);
		this.obraSocial = obraSocial;

	}

	@Override
	public boolean abrirPuerta(Puerta puerta, Credencial credencial) {
		// TODO Auto-generated method stub
		return false;
	}

}
