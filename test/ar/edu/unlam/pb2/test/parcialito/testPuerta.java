package ar.edu.unlam.pb2.test.parcialito;

import static org.junit.Assert.*;

import java.time.LocalDate;

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
	public void queSePuedaAbrirUnaPuertaConLaCredencialCorrecta() {

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
		// Si la credencial intenta abrir una puerta que no puede, no se abre.
		assertFalse(zara.abrirPuerta(puertaDeposito, credencial));

	}

}
