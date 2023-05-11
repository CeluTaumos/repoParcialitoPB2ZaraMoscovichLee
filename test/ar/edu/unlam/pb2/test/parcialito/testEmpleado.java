package ar.edu.unlam.pb2.test.parcialito;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class testEmpleado {

	@Test
	public void queSePuedaCrearUnEmpleadoDeTipoPasante() {

		// DATOS DE ENTRADA
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fingreso;
		LocalDate fnac;
		Empleado mica;
		Departamento departamento;
		Credencial credencial;
		LocalDate fCaducidad;
		Double sueldo;
		Pasante pasante;

		// EJECUCION
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.CONTABILIDAD;
		credencial = new Credencial(5, TipoCredencial.PASANTE);

		fCaducidad = LocalDate.of(2024, 03, 01);

		pasante = new Pasante("Micaela", "Zara", 132165465l, 2313153l, fingreso, fnac, departamento, fCaducidad,
				credencial, 12341.0);

		// Validacion
		assertNotNull(pasante);

	}

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
		Double sueldo;
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
				credencial, 2354165.0);

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
		Double sueldo;
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
				credencial, 20000.0);

		// Validacion
		assertNotNull(zara);
		assertNotNull(obraSocial);

	}

	@Test

	public void queSePuedaCobrarSiendoEfectivo() {

		LocalDate fingreso;

		LocalDate fnac;

		Departamento departamento;

		Double sueldo;

		Double SUELDO_FINAL_ESPERADO = 30500.0;

		Credencial credencial;

		Efectivo efec;

		Long codigoObraSocial;

		String nombreObraSocial;

		ObraSocial obraSocial;

		// Ejecucion

		fingreso = LocalDate.of(2023, 05, 13);

		fnac = LocalDate.of(2003, 07, 21);

		departamento = Departamento.CONTABILIDAD;

		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

		sueldo = 30000.0;

		codigoObraSocial = 165165l;

		nombreObraSocial = "Osde";

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);

		efec = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fingreso, fnac, departamento, obraSocial,
				credencial, sueldo);

		assertEquals(SUELDO_FINAL_ESPERADO, efec.cobrar(sueldo));

	}

	@Test

	public void queSePuedaCobrarSiendoPasante() {

		// DATOS DE ENTRADA
		LocalDate fingreso;

		LocalDate fnac;

		Departamento departamento;

		Credencial credencial;

		LocalDate fCaducidad;

		Double sueldo;

		Double SUELDO_FINAL_ESPERADO = 16000.0;

		Pasante pasante;

		// EJECUCION

		fingreso = LocalDate.of(2023, 05, 13);

		fnac = LocalDate.of(2003, 07, 21);

		departamento = Departamento.CONTABILIDAD;

		credencial = new Credencial(5, TipoCredencial.PASANTE);

		sueldo = 20000.0;

		fCaducidad = LocalDate.of(2024, 03, 01);

		pasante = new Pasante("Micaela", "Zara", 132165465l, 2313153l, fingreso, fnac, departamento, fCaducidad,

				credencial, sueldo);

		assertEquals(SUELDO_FINAL_ESPERADO, pasante.cobrar(sueldo));

	}

}
