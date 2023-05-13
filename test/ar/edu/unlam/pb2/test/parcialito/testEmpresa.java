package ar.edu.unlam.pb2.test.parcialito;

import static org.junit.Assert.*;
import java.time.LocalDate;
import org.junit.Test;

public class testEmpresa {

	@Test
	public void queSePuedaCrearUnaEmpresa() {
		// DATOS DE ENTRADA
		String nombre;
		Empresa empresa;

		// EJECUCION
		nombre = "X";
		empresa = new Empresa(nombre);

		// VALIDACION
		assertNotNull(empresa);
	}

	// AGREGADO DE EMPLEADOS

	
	// Mica
	@Test
	public void queSePuedaAgregarUnEmpleadoAUnaEmpresa() {
		// DATOS DE ENTRADA
		Integer CANTIDAD_CONTRATADOS_ESPERADA = 2;

		String nombre;
		Empresa empresa;
		LocalDate fingreso;
		LocalDate fnac;
		Empleado mica;
		Departamento departamento;
		Credencial credencial;
		Double sueldoInicial = 0.0;
		LocalDate fCaducidad;
		Pasante contratado;
		Efectivo efec;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		// EJECUCION EMPRESA
		nombre = "X";
		empresa = new Empresa(nombre);
		// EJECUCION CONTRATADO
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.CONTABILIDAD;
		credencial = new Credencial(5, TipoCredencial.PASANTE);
		fCaducidad = LocalDate.of(2024, 03, 01);
		contratado = new Pasante("Micaela", "Zara", 132165465l, 2313153l, fingreso, fnac, departamento, fCaducidad,
				credencial, sueldoInicial);

		// EJECUCION EFECTIVO
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.CONTABILIDAD;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		efec = new Efectivo("Celu", "Rojas", 132165465l, 2313153l, fingreso, fnac, departamento, obraSocial, credencial,
				sueldoInicial);

		// AGREGO LOS EMPLEADOS A LA EMPRESA Y VEO QUE SE AGREGARON
		assertTrue(empresa.agregarEmpleado(efec));
		assertTrue(empresa.agregarEmpleado(contratado));
		// VALIDACION OFICIAL :)
		assertEquals(CANTIDAD_CONTRATADOS_ESPERADA, empresa.getCantListaEmpleados());
	}

	@Test
	public void queNoSePuedanAgregarDosEmpleadosEfectivosConElMismoCUIL() {

		// DATOS DE ENTRADA
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1;
		LocalDate fNac1;
		Empleado mica;
		Departamento departamento1;
		Double sueldoInicial = 0.0;

		Efectivo efec1;
		Efectivo efec2;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		LocalDate fIngreso2;
		LocalDate fNac2;
		Departamento departamento2;

		Empresa empresa;
		String nombreEmpresa;

		Credencial credencial;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

		// EJECUCION

		// efec 1
		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";

		// efec2
		fIngreso2 = LocalDate.of(2022, 03, 15);
		fNac2 = LocalDate.of(2004, 06, 15);
		departamento2 = Departamento.RECURSOS_HUMANOS;

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);

		efec1 = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, obraSocial,
				credencial, sueldoInicial);
		// CUIL DIF
		efec2 = new Efectivo("Cele", "Moscovich", 132165455l, 1655565l, fIngreso2, fNac2, departamento2, obraSocial,
				credencial, sueldoInicial);

		// VALIDACION
		assertTrue(empresa.agregarEmpleado(efec1));
		assertTrue(empresa.agregarEmpleado(efec2));

	}

	// Cele
	@Test
	public void queNoSePuedanAgregarDosEmpleadosEfectivosConElMismoCUILCaminoNoFeliz() {

		// DATOS DE ENTRADA
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1;
		LocalDate fNac1;
		Empleado mica;
		Departamento departamento1;
		Double sueldoInicial = 0.0;

		Efectivo efec1;
		Efectivo efec2;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		LocalDate fIngreso2;
		LocalDate fNac2;
		Departamento departamento2;

		Empresa empresa;
		String nombreEmpresa;

		Credencial credencial;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

		// EJECUCION

		// EFECT 1
		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";

		// EFECT 2
		fIngreso2 = LocalDate.of(2022, 03, 15);
		fNac2 = LocalDate.of(2004, 06, 15);
		departamento2 = Departamento.RECURSOS_HUMANOS;

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);

		efec1 = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, obraSocial,
				credencial, sueldoInicial);
		efec2 = new Efectivo("Cele", "Moscovich", 132165465l, 1653165l, fIngreso2, fNac2, departamento2, obraSocial,
				credencial, sueldoInicial);

		// VALIDACION
		assertTrue(empresa.agregarEmpleado(efec1));
		assertFalse(empresa.agregarEmpleado(efec2));

	}

	@Test
	public void queNoSePuedanAgregarDosEmpleadosPasantesConElMismoCUILCaminoFeliz() {

		// DATOS DE ENTRADA
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1;
		LocalDate fNac1;
		Departamento departamento1;
		Double sueldoInicial = 0.0;

		Pasante mari;
		LocalDate fCaducidad1;

		LocalDate fIngreso2;
		LocalDate fNac2;
		Departamento departamento2;
		LocalDate fCaducidad2;
		Pasante andy;

		Empresa empresa;
		String nombreEmpresa;

		Credencial credencial;
		credencial = new Credencial(5, TipoCredencial.RESIDENTE);

		// EJECUCION
		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		fCaducidad1 = LocalDate.of(2024, 03, 01);

		fIngreso2 = LocalDate.of(2020, 01, 02);
		fNac2 = LocalDate.of(1999, 10, 13);
		departamento2 = Departamento.RECURSOS_HUMANOS;
		fCaducidad2 = LocalDate.of(2024, 06, 06);

		mari = new Pasante("Mari", "Lee", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, fCaducidad1,
				credencial, sueldoInicial);
		// CUIL DIF
		andy = new Pasante("Andy", "Borgeat", 132185465l, 2373153l, fIngreso2, fNac2, departamento2, fCaducidad2,
				credencial, sueldoInicial);

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		// VALIDACION
		assertTrue(empresa.agregarEmpleado(mari));
		assertTrue(empresa.agregarEmpleado(andy));

	}

	
	// Mari
	@Test
	public void queNoSePuedanAgregarDosEmpleadosPasantesConElMismoCUILCaminoTriste() {

		// DATOS DE ENTRADA
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1;
		LocalDate fNac1;
		Empleado mica;
		Departamento departamento1;
		Double sueldoInicial = 0.0;

		Pasante mari;
		LocalDate fCaducidad1;

		LocalDate fIngreso2;
		LocalDate fNac2;
		Departamento departamento2;
		LocalDate fCaducidad2;
		Pasante andy;

		Empresa empresa;
		String nombreEmpresa;

		Credencial credencial;
		credencial = new Credencial(5, TipoCredencial.RESIDENTE);

		// EJECUCION
		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		fCaducidad1 = LocalDate.of(2024, 03, 01);

		fIngreso2 = LocalDate.of(2020, 01, 02);
		fNac2 = LocalDate.of(1999, 10, 13);
		departamento2 = Departamento.RECURSOS_HUMANOS;
		fCaducidad2 = LocalDate.of(2024, 06, 06);

		mari = new Pasante("Mari", "Lee", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, fCaducidad1,
				credencial, sueldoInicial);
		andy = new Pasante("Andy", "Borgeat", 132165465l, 2313153l, fIngreso2, fNac2, departamento2, fCaducidad2,
				credencial, sueldoInicial);

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		// VALIDACION
		assertTrue(empresa.agregarEmpleado(mari));
		assertFalse(empresa.agregarEmpleado(andy));

	}

	@Test
	public void queNoSePuedanCrearDosEmpleadosAgremiadosConElMismoCUIL() {
		// DATOS DE ENTRADA
		String nombre, apellido, nombre2, apellido2;
		Long CUIL, CUIL2;
		Long legajo, legajo2;
		LocalDate fingreso;
		LocalDate fnac, fnac2;
		Departamento departamento;
		Credencial credencial;
		Double sueldoInicial = 0.0;

		Efectivo efec, efec2;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		Empresa empresa;
		String nombreEmpresa;

		// EL AGREMIADO PERTENECE A UN GREMIO
		Gremio gremio;
		Agremiado zara;
		Agremiado deLosCampos;

		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

		// Ejecucion
		nombre = "Bella";
		nombre2 = "Fealina";
		apellido = "Zara";
		apellido2 = "De los Campos";
		legajo = 5l;
		legajo2 = 2l;
		CUIL = 45L;
		CUIL2 = 5L;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";
		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		gremio = new Gremio(TipoDeGremio.MERCANTIL, "BPr");
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		fnac2 = LocalDate.of(2002, 02, 21);
		departamento = Departamento.VENTAS;

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		// EL AGREMIADO
		zara = new Agremiado(nombreObraSocial, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial, sueldoInicial);
		deLosCampos = new Agremiado(nombreObraSocial, apellido2, CUIL2, legajo2, fingreso, fnac2, departamento,
				obraSocial, gremio, credencial, sueldoInicial);

		// VALIDACION
		assertTrue(empresa.agregarEmpleado(deLosCampos));
		assertTrue(empresa.agregarEmpleado(zara));

	}

	// Cele
	@Test
	public void queNoSePuedanCrearDosEmpleadosAgremiadosConElMismoCUILCaminoTriste() {
		// DATOS DE ENTRADA
		String nombre, apellido, nombre2, apellido2;
		Long CUIL, CUIL2;
		Long legajo, legajo2;
		LocalDate fingreso;
		LocalDate fnac, fnac2;
		Departamento departamento;
		Credencial credencial;
		Double sueldoInicial = 0.0;

		Efectivo efec, efec2;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		Empresa empresa;
		String nombreEmpresa;

		// EL AGREMIADO PERTENECE A UN GREMIO
		Gremio gremio;
		Agremiado zara;
		Agremiado deLosCampos;

		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

		// Ejecucion
		nombre = "Bella";
		nombre2 = "Fealina";
		apellido = "Zara";
		apellido2 = "De los Campos";
		legajo = 5l;
		legajo2 = 2l;
		CUIL = 45L;
		// MISMO CUIL
		CUIL2 = 45L;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";
		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		gremio = new Gremio(TipoDeGremio.MERCANTIL, "BPr");
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		fnac2 = LocalDate.of(2002, 02, 21);
		departamento = Departamento.VENTAS;

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		// EL AGREMIADO
		zara = new Agremiado(nombreObraSocial, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial, sueldoInicial);

		deLosCampos = new Agremiado(nombreObraSocial, apellido2, CUIL2, legajo2, fingreso, fnac2, departamento,
				obraSocial, gremio, credencial, sueldoInicial);

		// VALIDACION

		assertTrue(empresa.agregarEmpleado(deLosCampos));
		assertFalse(empresa.agregarEmpleado(zara));

	}

	// METODOS FILTRAR EMPLEADOS POR TIPO,CANTIDAD,LISTAR
	
	// Mari
	@Test
	public void queSePuedaFiltrarLaCantidadDePasantes() {

		// DATOS DE ENTRADA
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1, fIngreso2;
		LocalDate fNac1, fNac2;
		Departamento departamento1, departamento2;
		Double sueldoInicial = 0.0;
		Pasante mari;
		LocalDate fCaducidad1, fCaducidad2;
		Pasante celu;
		Credencial credencial;
		Empresa empresa;
		String nombreEmpresa;
		Integer CANTIDAD_ESPERADA_CONTRATADOS = 2;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

		// EJECUCION

		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		fCaducidad1 = LocalDate.of(2024, 03, 01);
		fIngreso2 = LocalDate.of(2020, 01, 02);
		fNac2 = LocalDate.of(1999, 10, 13);
		departamento2 = Departamento.RECURSOS_HUMANOS;
		fCaducidad2 = LocalDate.of(2024, 06, 06);
		mari = new Pasante("Mari", "Lee", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, fCaducidad1,
				credencial, sueldoInicial);
		celu = new Pasante("Celena", "Chu", 111111111l, 2313153l, fIngreso2, fNac2, departamento2, fCaducidad2,
				credencial, sueldoInicial);
		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);
		empresa.agregarEmpleado(mari);
		empresa.agregarEmpleado(celu);

		// VALIDACION
		assertEquals(CANTIDAD_ESPERADA_CONTRATADOS, empresa.filtrarCantidadDePasantes());

	}

	@Test
	public void queSePuedaFiltrarLaCantidadDeEfectivos() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1, fIngreso2;
		LocalDate fNac1, fNac2;
		Empleado mica;
		Departamento departamento1, departamento2;
		Double sueldoInicial = 0.0;

		Efectivo efec1, efec2;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		Empresa empresa;
		String nombreEmpresa;
		Integer CANTIDAD_ESPERADA_EFECTIVOS = 2;

		Credencial credencial;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

		// EJECUCION

		// EFEC 1
		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";

		// EFEC2
		fIngreso2 = LocalDate.of(2022, 03, 15);
		fNac2 = LocalDate.of(2004, 06, 15);
		departamento2 = Departamento.RECURSOS_HUMANOS;

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);

		efec1 = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, obraSocial,
				credencial, sueldoInicial);
		efec2 = new Efectivo("Cele", "Moscovich", 222222222l, 1653165l, fIngreso2, fNac2, departamento2, obraSocial,
				credencial, sueldoInicial);

		empresa.agregarEmpleado(efec1);
		empresa.agregarEmpleado(efec2);

		// VALIDACION

		assertEquals(CANTIDAD_ESPERADA_EFECTIVOS, empresa.filtrarCantidadDeEfectivos());

	}

	@Test
	public void queSePuedanDespedirEfectivos() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1, fIngreso2;
		LocalDate fNac1, fNac2;
		Empleado mica;
		Departamento departamento1, departamento2;
		Double sueldoInicial = 0.0;
		
		Efectivo efec1, efec2;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		Empresa empresa;
		String nombreEmpresa;
		Integer CANTIDAD_ESPERADA_EFECTIVOS = 2;

		Credencial credencial;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

		Integer CANTIDAD_ESPERADA_DESPEDIDOS = 1;

		// EJECUCION

		// EFEC 1
		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";

		// EFEC2
		fIngreso2 = LocalDate.of(2022, 03, 15);
		fNac2 = LocalDate.of(2004, 06, 15);
		departamento2 = Departamento.RECURSOS_HUMANOS;

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);

		efec1 = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, obraSocial,
				credencial, sueldoInicial);
		efec2 = new Efectivo("Cele", "Moscovich", 222222222l, 1653165l, fIngreso2, fNac2, departamento2, obraSocial,
				credencial, sueldoInicial);

		empresa.agregarEmpleado(efec1);
		empresa.agregarEmpleado(efec2);

		// VALIDACION

		assertEquals(CANTIDAD_ESPERADA_EFECTIVOS, empresa.filtrarCantidadDeEfectivos());
		assertTrue(empresa.despedir(efec1));
		assertEquals(CANTIDAD_ESPERADA_DESPEDIDOS, empresa.filtrarCantidadDeEfectivos());
	}

	// Cele
	@Test
	public void queSePuedaDepositarElSueldo() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1, fIngreso2;
		LocalDate fNac1, fNac2;
		Empleado mica;
		Departamento departamento1, departamento2;
		Double sueldoInicial = 0.0;

		Efectivo efec1, efec2;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		Empresa empresa;
		String nombreEmpresa;
		Integer CANTIDAD_ESPERADA_EFECTIVOS = 2;

		Credencial credencial;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

		Double IMPORTE_A_DEPOSITAR = 300000.0;

		// EJECUCION

		// EFEC 1
		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";

		// EFEC2
		fIngreso2 = LocalDate.of(2022, 03, 15);
		fNac2 = LocalDate.of(2004, 06, 15);
		departamento2 = Departamento.RECURSOS_HUMANOS;

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);

		efec1 = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, obraSocial,
				credencial, sueldoInicial);
		efec2 = new Efectivo("Cele", "Moscovich", 222222222l, 1653165l, fIngreso2, fNac2, departamento2, obraSocial,
				credencial, sueldoInicial);

		empresa.agregarEmpleado(efec1);
		empresa.agregarEmpleado(efec2);

		assertEquals(IMPORTE_A_DEPOSITAR, empresa.depositarSueldo(efec1, IMPORTE_A_DEPOSITAR));

	}
//	@Test
//	public void queSePuedaBuscarUnEmpleadoPorCUIL() {
//
//		// Datos de entrada
//		String nombre, apellido;
//		Long CUIL;
//		Long legajo;
//		LocalDate fIngreso1, fIngreso2;
//		LocalDate fNac1, fNac2;
//		Empleado mica;
//		Departamento departamento1, departamento2;
//
//		Efectivo efec1, efec2;
//		ObraSocial obraSocial;
//		Long codigoObraSocial;
//		String nombreObraSocial;
//
//		Empresa empresa;
//		String nombreEmpresa;
//		Integer CANTIDAD_ESPERADA_EFECTIVOS = 2;
//
//		Credencial credencial;
//		credencial = new Credencial(5, TipoCredencial.ALLACCESS);
//
//		// EJECUCION
//
//		// EFEC 1
//		fIngreso1 = LocalDate.of(2023, 05, 13);
//		fNac1 = LocalDate.of(2003, 07, 21);
//		departamento1 = Departamento.CONTABILIDAD;
//		codigoObraSocial = 165165l;
//		nombreObraSocial = "Osde";
//		CUIL = 132165465l;
//
//		// EFEC2
//		fIngreso2 = LocalDate.of(2022, 03, 15);
//		fNac2 = LocalDate.of(2004, 06, 15);
//		departamento2 = Departamento.RECURSOS_HUMANOS;
//
//		nombreEmpresa = "X";
//		empresa = new Empresa(nombreEmpresa);
//
//		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
//
//		efec1 = new Efectivo("Micaela", "Zara", CUIL, 2313153l, fIngreso1, fNac1, departamento1, obraSocial,
//				credencial);
//		efec2 = new Efectivo("Cele", "Moscovich", 222222222l, 1653165l, fIngreso2, fNac2, departamento2, obraSocial,
//				credencial);
//
//		empresa.agregarEmpleado(efec1);
//		empresa.agregarEmpleado(efec2);
//
//		// VALIDACION
//		assertNotNull(empresa.buscarPorCuil(CUIL));
//
//	}

}
