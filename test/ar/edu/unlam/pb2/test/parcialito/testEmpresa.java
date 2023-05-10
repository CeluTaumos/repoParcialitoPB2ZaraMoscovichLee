package ar.edu.unlam.pb2.test.parcialito;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import ar.edu.unlam.pb2.Contratado;
import ar.edu.unlam.pb2.Credencial;
import ar.edu.unlam.pb2.Departamento;
import ar.edu.unlam.pb2.Efectivo;
import ar.edu.unlam.pb2.Empleado;
import ar.edu.unlam.pb2.Empresa;
import ar.edu.unlam.pb2.ObraSocial;
import ar.edu.unlam.pb2.TipoCredencial;

public class testEmpresa {

	@Test
	public void queSePuedaCrearUnaEmpresa() {
		// DATOS DE ENTRADA
		String nombre;
		Empresa empresa;

        //EJECUCION
		nombre = "X";
		empresa = new Empresa(nombre);

		// VALIDACION
		assertNotNull(empresa);
	}
	
	
	@Test
	public void queSePuedaAgregarUnEmpleadoAUnaEmpresa() {
		// DATOS DE ENTRADA
		Integer CANTIDAD_CONTRATADOS_ESPERADA=2;
		
		String nombre;
		Empresa empresa;
		LocalDate fingreso;
		LocalDate fnac;
		Empleado mica;
		Departamento departamento;
		Credencial credencial;
		LocalDate fCaducidad;
		Contratado contratado;
		Efectivo efec;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

        //EJECUCION EMPRESA
		nombre = "X";
		empresa = new Empresa(nombre);
		//EJECUCION CONTRATADO
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.CONTABILIDAD;
		credencial = new Credencial(5, TipoCredencial.VISITANTE);
		fCaducidad = LocalDate.of(2024, 03, 01);
		contratado = new Contratado("Micaela", "Zara", 132165465l, 2313153l, fingreso, fnac, departamento, fCaducidad,
				credencial);
		
		//EJECUCION EFECTIVO
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.CONTABILIDAD;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		efec = new Efectivo("Celu", "Rojas", 132165465l, 2313153l, fingreso, fnac, departamento, obraSocial,
				credencial);
		
		//AGREGO LOS EMPLEADOS A LA EMPRESA Y VEO QUE SE AGREGARON
		assertTrue( empresa.agregarEmpleado(efec));
		assertTrue(empresa.agregarEmpleado(contratado));
		// VALIDACION OFICIAL :)
		assertEquals(CANTIDAD_CONTRATADOS_ESPERADA,empresa.getCantListaEmpleados());
	}
	
	@Test
	public void queNoSePuedanAgregarDosEmpleadosEfectivosConElMismoCUIL() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1;
		LocalDate fNac1;
		Empleado mica;
		Departamento departamento1;

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

		// Ejecucion

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
				credencial);
		//CUIL DIF
		efec2 = new Efectivo("Cele", "Moscovich", 132165455l, 1655565l, fIngreso2, fNac2, departamento2, obraSocial,
				credencial);

		// Validacion
		assertTrue(empresa.agregarEmpleado(efec1));
		assertTrue(empresa.agregarEmpleado(efec2));
		

	}
    
	@Test
	public void queNoSePuedanAgregarDosEmpleadosEfectivosConElMismoCUILCaminoNoFeliz() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1;
		LocalDate fNac1;
		Empleado mica;
		Departamento departamento1;

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

		// Ejecucion

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
				credencial);
		efec2 = new Efectivo("Cele", "Moscovich", 132165465l, 1653165l, fIngreso2, fNac2, departamento2, obraSocial,
				credencial);

		// Validacion
		assertTrue(empresa.agregarEmpleado(efec1));
		assertFalse(empresa.agregarEmpleado(efec2));

	}
	@Test
	public void queNoSePuedanAgregarDosEmpleadosContratadosConElMismoCUILCaminoFeliz() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1;
		LocalDate fNac1;
		Empleado mica;
		Departamento departamento1;

		Contratado mari;
		LocalDate fCaducidad1;

		LocalDate fIngreso2;
		LocalDate fNac2;
		Departamento departamento2;
		LocalDate fCaducidad2;
		Contratado andy;

		Empresa empresa;
		String nombreEmpresa;

		Credencial credencial;
		credencial = new Credencial(5, TipoCredencial.RESIDENTE);

		// Ejecucion
		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		fCaducidad1 = LocalDate.of(2024, 03, 01);

		fIngreso2 = LocalDate.of(2020, 01, 02);
		fNac2 = LocalDate.of(1999, 10, 13);
		departamento2 = Departamento.RECURSOS_HUMANOS;
		fCaducidad2 = LocalDate.of(2024, 06, 06);

		mari = new Contratado("Mari", "Lee", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, fCaducidad1,
				credencial);
		//CUIL DIF
		andy = new Contratado("Andy", "Borgeat", 132185465l, 2373153l, fIngreso2, fNac2, departamento2, fCaducidad2,
				credencial);

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		// Validacion
		assertTrue(empresa.agregarEmpleado(mari));
		assertTrue(empresa.agregarEmpleado(andy));

	}
	@Test
	public void queNoSePuedanAgregarDosEmpleadosContratadosConElMismoCUILCaminoTriste() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1;
		LocalDate fNac1;
		Empleado mica;
		Departamento departamento1;

		Contratado mari;
		LocalDate fCaducidad1;

		LocalDate fIngreso2;
		LocalDate fNac2;
		Departamento departamento2;
		LocalDate fCaducidad2;
		Contratado andy;

		Empresa empresa;
		String nombreEmpresa;

		Credencial credencial;
		credencial = new Credencial(5, TipoCredencial.RESIDENTE);

		// Ejecucion
		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		fCaducidad1 = LocalDate.of(2024, 03, 01);

		fIngreso2 = LocalDate.of(2020, 01, 02);
		fNac2 = LocalDate.of(1999, 10, 13);
		departamento2 = Departamento.RECURSOS_HUMANOS;
		fCaducidad2 = LocalDate.of(2024, 06, 06);

		mari = new Contratado("Mari", "Lee", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, fCaducidad1,
				credencial);
		andy = new Contratado("Andy", "Borgeat", 132165465l, 2313153l, fIngreso2, fNac2, departamento2, fCaducidad2,
				credencial);

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		// Validacion
		assertTrue(empresa.agregarEmpleado(mari));
		assertFalse(empresa.agregarEmpleado(andy));

	}



}
