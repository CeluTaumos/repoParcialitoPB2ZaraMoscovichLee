package ar.edu.unlam.pb2.test.parcialito;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import org.junit.Test;

public class testAccesos {

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
		zara = new Agremiado(nombreObraSocial, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
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
		zara = new Agremiado(nombreObraSocial, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial, sueldoInicial);

		zara.abrirPuerta(puertaDeposito, credencial);
		zara.abrirPuerta(puertaDeEntrada, credencial);

		assertEquals(CANTIDAD_ACCESOS_ESPERADOS, credencial.getCantidadAccesos());

	}
	@Test
	public void queSePuedanObtenerTodosLosAccesosDeUnaCredencial() {

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
		Acceso tercerAcceso;
		Acceso cuartoAcceso;
		Integer codigo;
		TipoDePuerta tipodepuerta;

		Integer CANTIDAD_ACCESOS_ESPERADOS = 4;
		
		
		//EJECUCION
		
		
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";
		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		gremio = new Gremio(TipoDeGremio.TRANSPORTE, "Transportistas");
		fingreso = LocalDate.of(2023, 05, 13);
		credencial = new Credencial(5, TipoCredencial.PASANTE);
		puertaDeEntrada = new Puerta(1234, TipoDePuerta.ENTRADA);
		puertaDeposito = new Puerta(1256, TipoDePuerta.DEPOSITO);


		// EL AGREMIADO
		agremiado = new Agremiado("Camila", "Nesa", 45l, 33l, fingreso,  LocalDate.of(2003, 07, 21),  Departamento.VENTAS, obraSocial, gremio,
				credencial, 0.0);
        
		//EL AGREMAIDO USA LA CREDENCIAL CUATRO VECES
		agremiado.abrirPuerta(puertaDeposito, credencial);
		agremiado.abrirPuerta(puertaDeEntrada, credencial);
		agremiado.abrirPuerta(puertaDeposito, credencial);
		agremiado.abrirPuerta(puertaDeposito, credencial);
		//PEDIMOS AL AGREMAIDO SU CREDENCIAL PARA VER CUANTAS VECES USO LA CREDENCIAL
		agremiado.getCredencial().getListaAccesos();

		assertEquals(CANTIDAD_ACCESOS_ESPERADOS, credencial.getCantidadAccesos());

		
	}
	
	@Test
	public void queSePuedanFiltrarTodosLosAccesosDeUnaCredencialEnUnDía() {

		// Datos de entrada
		LocalDate fingreso;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;
		Gremio gremio;
		Efectivo efectivo;
		Credencial credencial;
		Boolean permiso;
		Puerta puertaDeEntrada;
		Puerta puertaDeposito;
		Acceso tercerAcceso;
		Acceso cuartoAcceso;
		Integer codigo;
		TipoDePuerta tipodepuerta;

		Integer CANTIDAD_ACCESOS_DEL_DIA_ESPERADOS=4;
		LocalDateTime hoy;
		
		//EJECUCION
		
		
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";
		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		gremio = new Gremio(TipoDeGremio.TRANSPORTE, "Transportistas");
		fingreso = LocalDate.of(2023, 05, 13);
		credencial = new Credencial(5, TipoCredencial.PASANTE);
		puertaDeEntrada = new Puerta(1234, TipoDePuerta.ENTRADA);
		puertaDeposito = new Puerta(1256, TipoDePuerta.DEPOSITO);
		hoy = LocalDateTime.now();
		

		// EL AGREMIADO
		efectivo = new Agremiado("Camila", "Nesa", 45l, 33l, fingreso,  LocalDate.of(2003, 07, 21),  Departamento.VENTAS, obraSocial, gremio,
				credencial, 0.0);
        
		//EL AGREMIADO USA LA CREDENCIAL CUATRO VECES
		efectivo.abrirPuerta(puertaDeposito, credencial);
		efectivo.abrirPuerta(puertaDeEntrada, credencial);
		efectivo.abrirPuerta(puertaDeposito, credencial);
		efectivo.abrirPuerta(puertaDeposito, credencial);
		//CREO UN METODO PARA MANIPULAR LA FECHA Y PROBAR FUNCIONAMIENTO DEL METODO ANTERIOR
		efectivo.abrirPuertaElDiaSig(puertaDeEntrada,credencial);
	
		//EN EL EQUALS INVOCAMOS AL METODO DE OBTENER ACCESO DE UN DIA PERO USAMOS LA FECHA DE LOS ACCESOS

		assertEquals(CANTIDAD_ACCESOS_DEL_DIA_ESPERADOS, efectivo.getCredencial().getAccesosDeUnDía(hoy));

}
	
	
}
