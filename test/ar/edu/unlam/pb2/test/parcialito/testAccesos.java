package ar.edu.unlam.pb2.test.parcialito;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import org.junit.Test;

public class testAccesos { 

	// Celena
	
	@Test
	public void queSePuedanAgregarLosAccesos() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fingreso;
		LocalDate fnac;
		Departamento departamento;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;
		Double sueldoInicial = 0.0;
		Gremio gremio;
		Agremiado zara;
		Credencial credencial;
		Boolean permiso;
		LocalDateTime horaEntrada;
		Integer CANTIDAD_ACCESOS_ESPERADOS = 2;

		Puerta puertaDeEntrada;
		Puerta puertaDeposito;

		Integer codigo;
		TipoDePuerta tipodepuerta;

		// Ejecucion
		nombre = "Bella";
		apellido = "De La Rosa";
		legajo = 5l;
		CUIL = 45L;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";
		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		gremio = new Gremio(TipoDeGremio.INGENIERIA, "Ingenieros");
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.VENTAS;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);
		puertaDeEntrada = new Puerta(1234, TipoDePuerta.ENTRADA);
		puertaDeposito = new Puerta(1256, TipoDePuerta.DEPOSITO);
		horaEntrada = LocalDateTime.now();

		// EL AGREMIADO
		zara = new Agremiado(nombre, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial, sueldoInicial);
		zara.abrirPuerta(puertaDeposito, credencial);
		zara.abrirPuerta(puertaDeEntrada, credencial);

		assertEquals(CANTIDAD_ACCESOS_ESPERADOS, credencial.getCantidadAccesos());

	}

	@Test
	public void queSePuedanAgregarLosAccesosAunqueSeanAccesosNegativos() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fingreso;
		LocalDate fnac;
		Departamento departamento;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;
		Double sueldoInicial = 0.0;
		Gremio gremio;
		Agremiado zara;
		Credencial credencial;
		Boolean permiso;
		LocalDateTime horaEntrada;
		Integer CANTIDAD_ACCESOS_ESPERADOS = 2;

		Puerta puertaDeEntrada;
		Puerta puertaDeposito;

		Integer codigo;
		TipoDePuerta tipodepuerta;

		// Ejecucion
		nombre = "Bella";
		apellido = "De La Rosa";
		legajo = 5l;
		CUIL = 45L;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";
		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		gremio = new Gremio(TipoDeGremio.TRANSPORTE, "Transportistas");
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.VENTAS;
		credencial = new Credencial(5, TipoCredencial.PASANTE);
		puertaDeEntrada = new Puerta(1234, TipoDePuerta.ENTRADA);
		puertaDeposito = new Puerta(1256, TipoDePuerta.DEPOSITO);
		horaEntrada = LocalDateTime.now();

		// EL AGREMIADO
		zara = new Agremiado(nombre, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial, sueldoInicial);

		zara.abrirPuerta(puertaDeposito, credencial);
		zara.abrirPuerta(puertaDeEntrada, credencial);

		assertEquals(CANTIDAD_ACCESOS_ESPERADOS, credencial.getCantidadAccesos());

	}

	@Test
	public void queSePuedanObtenerTodosLosAccesosDeUnaCredencial() {

		// datosentrada
		LocalDate fingreso;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;
		Gremio gremio;
		Agremiado agremiado;
		Credencial credencial;
		Puerta puertaDeEntrada;
		Puerta puertaDeposito;
		Integer CANTIDAD_ACCESOS_ESPERADOS = 4;

		// EJECUCION
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";
		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		gremio = new Gremio(TipoDeGremio.TRANSPORTE, "Transportistas");
		fingreso = LocalDate.of(2023, 05, 13);
		credencial = new Credencial(5, TipoCredencial.PASANTE);
		puertaDeEntrada = new Puerta(1234, TipoDePuerta.ENTRADA);
		puertaDeposito = new Puerta(1256, TipoDePuerta.DEPOSITO);
		// EL AGREMIADO
		agremiado = new Agremiado("Camila", "Nesa", 45l, 33l, fingreso, LocalDate.of(2003, 07, 21), Departamento.VENTAS,
				obraSocial, gremio, credencial, 0.0);

		// EL AGREMAIDO USA LA CREDENCIAL CUATRO VECES
		agremiado.abrirPuerta(puertaDeposito, credencial);
		agremiado.abrirPuerta(puertaDeEntrada, credencial);
		agremiado.abrirPuerta(puertaDeposito, credencial);
		agremiado.abrirPuerta(puertaDeposito, credencial);
		// PEDIMOS AL AGREMAIDO SU CREDENCIAL PARA VER CUANTAS VECES USO LA CREDENCIAL
		agremiado.getCredencial().getListaAccesos();

		assertEquals(CANTIDAD_ACCESOS_ESPERADOS, credencial.getCantidadAccesos());

	}

	@Test
	public void queSePuedanFiltrarLosAccesosDeUnaCredencialPorTipoDePuerta() {

		// Datos de entrada
		LocalDate fingreso;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;
		Gremio gremio;
		Agremiado agremiado;
		Credencial credencial;
		Boolean permiso;
		Puerta puertaDeEntrada;
		Puerta puertaDeposito;
		Integer CANTIDAD_ACCESOS_ESPERADOS = 3;
		Integer CANTIDAD_ACCESOS_ACTUAL;

		// EJECUCION
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";
		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		gremio = new Gremio(TipoDeGremio.TRANSPORTE, "Transportistas");
		fingreso = LocalDate.of(2023, 05, 13);
		credencial = new Credencial(5, TipoCredencial.PASANTE);
		puertaDeEntrada = new Puerta(1234, TipoDePuerta.ENTRADA);
		puertaDeposito = new Puerta(1256, TipoDePuerta.DEPOSITO);
		agremiado = new Agremiado("Camila", "Nesa", 45l, 33l, fingreso, LocalDate.of(2003, 07, 21), Departamento.VENTAS,
				obraSocial, gremio, credencial, 0.0);

		// EL AGREMAIDO USA LA CREDENCIAL CUATRO VECES
		agremiado.abrirPuerta(puertaDeposito, credencial);
		agremiado.abrirPuerta(puertaDeEntrada, credencial);
		agremiado.abrirPuerta(puertaDeposito, credencial);
		agremiado.abrirPuerta(puertaDeposito, credencial);
		// PEDIMOS AL AGREMAIDO SU CREDENCIAL PARA VER CUANTAS VECES USO LA CREDENCIAL
		CANTIDAD_ACCESOS_ACTUAL = agremiado.getCredencial().getListaAccesosFiltradaPorPuerta(puertaDeposito).size();

		assertEquals(CANTIDAD_ACCESOS_ESPERADOS, CANTIDAD_ACCESOS_ACTUAL);

	}

//	@Test
//	public void queSePuedanFiltrarTodosLosAccesosDeUnaCredencialEnUnDía() {
//
//		// DATOS ENTRADA
//		LocalDate fingreso;
//		ObraSocial obraSocial;
//		Long codigoObraSocial;
//		String nombreObraSocial;
//		Gremio gremio;
//		Efectivo agremiado;
//		Credencial credencial;
//		Puerta puertaDeEntrada;
//		Puerta puertaDeposito;
//		Integer CANTIDAD_ACCESOS_DEL_DIA_ESPERADOS = 4;
//		Integer CANTIDAD_ACCESOS_ACTUAL;
//		LocalDateTime hoy;
//
//		// EJECUCION
//
//		codigoObraSocial = 165165l;
//		nombreObraSocial = "Osde";
//		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
//		gremio = new Gremio(TipoDeGremio.TRANSPORTE, "Transportistas");
//		fingreso = LocalDate.of(2023, 05, 13);
//		credencial = new Credencial(5, TipoCredencial.RESIDENTE);
//		puertaDeEntrada = new Puerta(1234, TipoDePuerta.ENTRADA);
//		puertaDeposito = new Puerta(1256, TipoDePuerta.DEPOSITO);
//		hoy = LocalDateTime.now();
//
//		// EL AGREMIADO
//		agremiado = new Agremiado("Camila", "Nesa", 45l, 33l, fingreso, LocalDate.of(2003, 07, 21), Departamento.VENTAS,
//				obraSocial, gremio, credencial, 0.0);
//
//		// EL AGREMIADO USA LA CREDENCIAL CUATRO VECES
//
//		for (int i = 0; i < 5; i++) {
//			agremiado.abrirPuerta(puertaDeEntrada, credencial);
//		}
//
//		// CREO UN METODO PARA MANIPULAR LA FECHA Y PROBAR FUNCIONAMIENTO DEL METODO
//		// ANTERIOR
//		agremiado.abrirPuertaElDiaSig(puertaDeEntrada, credencial); // true
//
//		CANTIDAD_ACCESOS_ACTUAL = agremiado.getCredencial().getAccesosDeUnDía(hoy);
//		assertEquals(CANTIDAD_ACCESOS_DEL_DIA_ESPERADOS, CANTIDAD_ACCESOS_ACTUAL);
//
//	}

}
