package ar.edu.unlam.pb2.test.parcialito;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class testGremio {

	@Test
	public void queSePuedaCrearUnGremio() {

		Gremio gremio;
		String nombre="Asociacion De Ingenieros";

		gremio = new Gremio(TipoDeGremio.INGENIERIA, nombre);

		assertNotNull(gremio);

	}

	@Test
	public void queSePuedaAgregarUnAgremiadoAUnGremio() {

		// DATOS DE ENTRADA
		Long CUIL;
		Long legajo;
		LocalDate fingreso;
		LocalDate fnac;
		Departamento departamento;
		Credencial credencial;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		// EL AGREMIADO PERTENECE A UN GREMIO
		Gremio gremio;
		Agremiado agremiado;

		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

		// Ejecucion
		legajo = 5l;
		CUIL = 45L;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";
		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		gremio = new Gremio(TipoDeGremio.MERCANTIL, "BPr");
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.VENTAS;
		// EL AGREMIADO
		agremiado = new Agremiado("Marisol", "Gomez", CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial, 2000000.0);

		assertTrue(gremio.agregarAgremiado(agremiado));
		
		
		

	}
	@Test
	public void queSePuedaVerTodosLosAgremiadosDeUnGremio() {

		// DATOS DE ENTRADA
		LocalDate fingreso;
		LocalDate fnac;
		Credencial credencial;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;
		Integer CANTIDAD_ESPERADA_PRIMER_GREMIO=2;
		Integer CANTIDAD_ESPERADA_GREMIO_DOS=1;
		Gremio gremioUno;
		Gremio gremioDos;
		Agremiado bella;
		Agremiado linda;
		Agremiado hermosa;
		
		//EJECUCION
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";
		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		gremioUno = new Gremio(TipoDeGremio.MERCANTIL, "BPr");
		gremioDos= new Gremio (TipoDeGremio.INGENIERIA,"Rts");
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		
		//AGREMIADOS MISMO GREMIO=2
		bella = new Agremiado("Bella", "Dona", 26l, 62l, fingreso, fnac, Departamento.LOGISTICA, obraSocial, gremioUno,
				credencial, 2000000.0);
		
		gremioUno.agregarAgremiado(bella);
		
		linda= new Agremiado ("Linda", "Perez",6l,5l,fingreso,fnac,Departamento.RECURSOS_HUMANOS,obraSocial,gremioUno,credencial,00.00);
         
		gremioUno.agregarAgremiado(linda);
		
		hermosa= new Agremiado("Hermosa", "Landas", 5l, 98l, fingreso, fnac, Departamento.VENTAS, obraSocial, gremioDos, credencial, 0.00);
		
		gremioDos.agregarAgremiado(hermosa);
		
		//FILTRO AGREMIADOS  Y COMPARO
		
		CANTIDAD_ESPERADA_PRIMER_GREMIO=2;
		Integer cantidadObtenidaGremioUno=gremioUno.getListaAgremiados().size();
	    
		CANTIDAD_ESPERADA_GREMIO_DOS=1;
		Integer cantidadObtenidaGremioDos=gremioDos.getListaAgremiados().size();
		//VERIFICACION
		assertEquals(CANTIDAD_ESPERADA_PRIMER_GREMIO, cantidadObtenidaGremioUno);
		assertEquals(CANTIDAD_ESPERADA_GREMIO_DOS,cantidadObtenidaGremioDos);
		
		

	}
	
	

}
