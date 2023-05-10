package ar.edu.unlam.pb2.test.parcialito;

import java.time.LocalDate;

public class Pasante extends Empleado {

	private LocalDate fCaducidad;

	public Pasante(String nombre, String apellido, Long CUIL, Long legajo, LocalDate fingreso, LocalDate fnac,
			Departamento departamento, LocalDate fCaducidad, Credencial credencial) {
		super(nombre, apellido, CUIL, legajo, fingreso, fnac, departamento, credencial);
		this.fCaducidad = fCaducidad;
	}

	@Override
	public boolean abrirPuerta(Puerta puerta, Credencial credencial) {
		// TODO Auto-generated method stub
		return false;
	}



	
	}


