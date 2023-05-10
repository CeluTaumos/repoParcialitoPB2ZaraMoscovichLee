package ar.edu.unlam.pb2.test.parcialito;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class testEmpleado {

	@Test
	public void queSePuedacCrearUnEmpleadoDeTipoContratado() {


	//DATOS DE ENTRADA
	 String nombre, apellido;
	 Long CUIL;
	 Long legajo;
	 LocalDate fIngreso;
	 LocalDate fNac;
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

	@Test
	public void queSePuedaCrearUnEmpleadoTipoEfectivo() {
		// Datos de entrada
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
}
