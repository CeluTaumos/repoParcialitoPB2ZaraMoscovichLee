package ar.edu.unlam.pb2.test.parcialito;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;

public class testPuerta {

	@Test
	public void queSePuedaCrearUnaPuerta() {

		Puerta puerta;
		Integer codigo;
		TipoDePuerta tipodepuerta;

		puerta = new Puerta(1234, TipoDePuerta.DEPOSITO);

		assertNotNull(puerta);

	}

	@Test
	public void queSePuedaAbrirUnaPuertaConLaCredencialCorrectaCaminoFeliz() {

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
		Gremio gremio;
		Agremiado zara;
		Credencial credencial;
		Double sueldoInicial = 0.0;

		Puerta puertaDeEntrada;
		Puerta puertaDeposito;

		TipoDeGremio tipodegremio;
		TipoDePuerta tipodepuerta;

		// Ejecucion
		nombre = "Bella";
		apellido = "De La Rosa";
		legajo = 5l;
		CUIL = 45L;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";
		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		gremio = new Gremio(TipoDeGremio.MERCANTIL, "mercantil");
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.VENTAS;
		credencial = new Credencial(5, TipoCredencial.PASANTE);
		puertaDeEntrada = new Puerta(1234, TipoDePuerta.ENTRADA);
		puertaDeposito = new Puerta(1256, TipoDePuerta.DEPOSITO);

		// EL AGREMIADO
		zara = new Agremiado(nombreObraSocial, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial, sueldoInicial);

		// Validacion
		// Probamos que con la credencial correcta se abra.
		assertTrue(zara.abrirPuerta(puertaDeEntrada, credencial));

	}

	@Test
	public void queNoSePuedaAbrirUnaPuertaConLaCredencialIncorrectaCaminoTriste() {

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
		Gremio gremio;
		Agremiado zara;
		Credencial credencial;
		Double sueldoInicial = 0.0;

		Puerta puertaDeEntrada;
		Puerta puertaDeposito;

		TipoDeGremio tipodegremio;
		TipoDePuerta tipodepuerta;

		// Ejecucion
		nombre = "Bella";
		apellido = "De La Rosa";
		legajo = 5l;
		CUIL = 45L;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";
		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		gremio = new Gremio(TipoDeGremio.MERCANTIL, "mercantil");
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.VENTAS;
		credencial = new Credencial(5, TipoCredencial.PASANTE);
		puertaDeEntrada = new Puerta(1234, TipoDePuerta.ENTRADA);
		puertaDeposito = new Puerta(1256, TipoDePuerta.DEPOSITO);

		// EL AGREMIADO
		zara = new Agremiado(nombreObraSocial, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial, sueldoInicial);

		// Validacion
		// Si la credencial intenta abrir una puerta que no puede, no se abre.
		assertFalse(zara.abrirPuerta(puertaDeposito, credencial));

	}

<<<<<<< HEAD
=======
	
>>>>>>> 172fb1a3291c03fe296f030a4765e5357b3d14ff
	@Test
	public void queSePuedaBloquearUnaPuerta() {

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
		Integer CANTIDAD_ACCESOS_ESPERADOS = 3;

<<<<<<< HEAD
		// EL AGREMIADO
		zara = new Agremiado(nombreObraSocial, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial, sueldoInicial);
		zara.abrirPuerta(puertaDeposito, credencial);
		zara.abrirPuerta(puertaDeEntrada, credencial);

		assertEquals(CANTIDAD_ACCESOS_ESPERADOS, credencial.getCantidadAccesos());

	}

	@Test
	public void queSeNoPuedanAgregarLosAccesos() {

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
=======
		
>>>>>>> 172fb1a3291c03fe296f030a4765e5357b3d14ff
		Puerta puertaDeposito;
		Acceso primerAcceso;
		Acceso segundoAcceso;

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
		puertaDeposito = new Puerta(1256, TipoDePuerta.DEPOSITO);

<<<<<<< HEAD
=======
		horaEntrada = LocalDateTime.now();

>>>>>>> 172fb1a3291c03fe296f030a4765e5357b3d14ff
		// EL AGREMIADO
		zara = new Agremiado(nombreObraSocial, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial, sueldoInicial);

		zara.abrirPuerta(puertaDeposito, credencial);
<<<<<<< HEAD
		zara.abrirPuerta(puertaDeEntrada, credencial);

=======
		
		zara.abrirPuerta(puertaDeposito, credencial);
		zara.abrirPuerta(puertaDeposito, credencial);
		

		assertFalse(puertaDeposito.verEstado(credencial));
>>>>>>> 172fb1a3291c03fe296f030a4765e5357b3d14ff
		assertEquals(CANTIDAD_ACCESOS_ESPERADOS, credencial.getCantidadAccesos());

	}

	@Test
	public void queSePuedaBloquearUnaPuerta() {

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
		Integer CANTIDAD_ACCESOS_ESPERADOS = 3;

		Puerta puertaDeposito;
		Acceso primerAcceso;
		Acceso segundoAcceso;

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
		puertaDeposito = new Puerta(1256, TipoDePuerta.DEPOSITO);

		horaEntrada = LocalDateTime.now();

		// EL AGREMIADO
		zara = new Agremiado(nombreObraSocial, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial, sueldoInicial);

		zara.abrirPuerta(puertaDeposito, credencial);

		zara.abrirPuerta(puertaDeposito, credencial);
		zara.abrirPuerta(puertaDeposito, credencial);

		assertFalse(puertaDeposito.verEstado(credencial));
		assertEquals(CANTIDAD_ACCESOS_ESPERADOS, credencial.getCantidadAccesos());

	}

	@Test
	public void queSePuedaDesbloquearLaCredencial() {
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
		Integer CANTIDAD_ACCESOS_ESPERADOS = 3;
		Puerta puertaDeposito;
		Acceso primerAcceso;
		Acceso segundoAcceso;

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
		puertaDeposito = new Puerta(1256, TipoDePuerta.DEPOSITO);
		horaEntrada = LocalDateTime.now();
		// EL AGREMIADO
		zara = new Agremiado(nombreObraSocial, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial, sueldoInicial);
		zara.abrirPuerta(puertaDeposito, credencial);
		zara.abrirPuerta(puertaDeposito, credencial);
		zara.abrirPuerta(puertaDeposito, credencial);
		puertaDeposito.verEstado(credencial);
		assertFalse(credencial.desbloquear());
		assertFalse(puertaDeposito.verEstado(credencial));
	}

}
