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
}

