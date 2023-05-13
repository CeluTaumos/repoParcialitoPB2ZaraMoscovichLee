package ar.edu.unlam.pb2.test.parcialito;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Iterator;

import org.junit.Test;

public class testEmpleado {
	
	// Mari

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
		sueldo = 200000.0;
		// EL AGREMIADO
		zara = new Agremiado(nombre, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial, sueldo);

		// Validacion
		assertNotNull(zara);
		assertNotNull(obraSocial);

	}

	// Mica
	@Test

	public void queSePuedaCobrarSiendoEfectivoSinBono() {

		LocalDate fingreso;

		LocalDate fnac;

		Departamento departamento;

		Double sueldo;

		Double SUELDO_FINAL_ESPERADO = 300000.0;

		Credencial credencial;

		Efectivo efec;

		Long codigoObraSocial;

		String nombreObraSocial;

		ObraSocial obraSocial;

		Empresa empresa;

		Puerta puertaEntrada;

		// Ejecucion

		fingreso = LocalDate.of(2023, 05, 13);

		fnac = LocalDate.of(2003, 07, 21);

		departamento = Departamento.CONTABILIDAD;

		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

		sueldo = 300000.0;

		codigoObraSocial = 165165l;

		nombreObraSocial = "Osde";

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);

		efec = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fingreso, fnac, departamento, obraSocial,
				credencial, sueldo);

		empresa = new Empresa("X");

		puertaEntrada = new Puerta(13513, TipoDePuerta.ENTRADA);

		efec.abrirPuerta(puertaEntrada, credencial);

		empresa.depositarSueldo(efec, sueldo);

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

		Double SUELDO_FINAL_ESPERADO = 40000.0;

		Pasante pasante;

		Empresa empresa;

		// EJECUCION

		fingreso = LocalDate.of(2023, 05, 13);

		fnac = LocalDate.of(2003, 07, 21);

		departamento = Departamento.CONTABILIDAD;

		credencial = new Credencial(5, TipoCredencial.PASANTE);

		sueldo = 200000.0;

		fCaducidad = LocalDate.of(2024, 03, 01);

		pasante = new Pasante("Micaela", "Zara", 132165465l, 2313153l, fingreso, fnac, departamento, fCaducidad,

				credencial, sueldo);

		empresa = new Empresa("X");
		;

		empresa.depositarSueldo(pasante, sueldo);

		assertEquals(SUELDO_FINAL_ESPERADO, pasante.cobrar(sueldo));
	}

	@Test
	public void queSePuedaCobrarSiendoEfectivoConBono() {

		LocalDate fingreso;

		LocalDate fnac;

		Departamento departamento;

		Double sueldo;

		Credencial credencial;

		Efectivo efec;

		Long codigoObraSocial;

		String nombreObraSocial;

		ObraSocial obraSocial;

		Puerta puertaEntrada;

		Double CANTIDAD_ESPERADA_SUELDO = 315000.0;

		Empresa empresa;

		// Ejecucion

		fingreso = LocalDate.of(2023, 05, 13);

		fnac = LocalDate.of(2003, 07, 21);

		departamento = Departamento.CONTABILIDAD;

		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

		sueldo = 300000.0;

		codigoObraSocial = 165165l;

		nombreObraSocial = "Osde";

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);

		efec = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fingreso, fnac, departamento, obraSocial,
				credencial, sueldo);

		puertaEntrada = new Puerta(13513, TipoDePuerta.ENTRADA);

		empresa = new Empresa("x");

		for (int i = 0; i < 21; i++) {
			efec.abrirPuerta(puertaEntrada, credencial);

		}

		empresa.depositarSueldo(efec, sueldo);

		assertEquals(CANTIDAD_ESPERADA_SUELDO, efec.cobrar(sueldo));

	}

}
