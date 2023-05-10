package ar.edu.unlam.pb2.test.parcialito;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class testEmpleado {

	@Test
	public void queSePuedaCrearUnEmpleadoDeTipoContratado() {

		// DATOS DE ENTRADA
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fingreso;
		LocalDate fnac;
		Departamento departamento;
		Credencial credencial;

		Contratado contratado;
		LocalDate fCaducidad;

		// EJECUCION
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.CONTABILIDAD;
		credencial = new Credencial(5, TipoCredencial.VISITANTE);

		fCaducidad = LocalDate.of(2024, 03, 01);

		contratado = new Contratado("Micaela", "Zara", 132165465l, 2313153l, fingreso, fnac, departamento, fCaducidad,
				credencial);

		// Validacion
		assertNotNull(contratado);

<<<<<<< HEAD
	}
=======
Empleado mica;

Departamento departamento;

Credencial credencial;



Contratado contratado;

 LocalDate fCaducidad;



//EJECUCION

fIngreso = LocalDate.of(2023, 05, 13);

fNac = LocalDate.of(2003, 07, 21);

 departamento = Departamento.CONTABILIDAD;
 credencial = new Credencial(5, TipoCredencial.VISITANTE);


fCaducidad = LocalDate.of(2024, 03, 01);



contratado = new Contratado("Micaela", "Zara", 132165465l, 2313153l, fIngreso, fNac, departamento, fCaducidad, credencial);


//VALIDACION

assertNotNull(contratado);


 

    }
>>>>>>> refs/remotes/origin/main

	@Test
	public void queSePuedaCrearUnEmpleadoTipoEfectivo() {
		// DATOS DE ENTRADA
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fingreso;
		LocalDate fnac;
		Empleado mica;
		Departamento departamento;
		Credencial credencial;

		Efectivo efec;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		// Ejecucion
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.CONTABILIDAD;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		efec = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fingreso, fnac, departamento, obraSocial,
				credencial);

		// Validacion
		assertNotNull(efec);
		assertNotNull(obraSocial);
	}



	@Test
	public void queSePuedaCrearUnAgremiadoDeTipoEfectivo() {

		// DATOS DE ENTRADA
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fingreso;
		LocalDate fnac;
		Empleado mica;
		Departamento departamento;
		Credencial credencial;

		Efectivo efec;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		// EL AGREMIADO PERTENECE A UN GREMIO
		Gremio gremio;
		Agremiado zara;

		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

		// Ejecucion
		nombre = "Bella";
		apellido = "De La Rosa";
		legajo = 5l;
		CUIL = 45L;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";
		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		gremio = new Gremio(TipoDeGremio.MERCANTIL, "BPr");
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.VENTAS;
		// EL AGREMIADO
		zara = new Agremiado(nombreObraSocial, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial);

		// Validacion
		assertNotNull(zara);
		assertNotNull(obraSocial);

	}

}
