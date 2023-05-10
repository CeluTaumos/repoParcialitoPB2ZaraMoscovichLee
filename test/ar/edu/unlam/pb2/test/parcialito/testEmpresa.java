package ar.edu.unlam.pb2.test.parcialito;

import static org.junit.Assert.*;

import org.junit.Test;

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

}
