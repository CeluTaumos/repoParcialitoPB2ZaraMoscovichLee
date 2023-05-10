package ar.edu.unlam.pb2.test.parcialito;

import java.util.HashSet;

public class Gremio {

	// ATRIBUTOS DE CLASE

	TipoDeGremio tipo;
	private String nombre;
	private HashSet<Agremiado> listaAgremiados;

	// CONSTRUCTOR
	public Gremio(TipoDeGremio tipo, String nombre) {

		this.tipo = tipo;
		this.nombre = nombre;
		this.listaAgremiados = new HashSet<Agremiado>();
	}

	protected TipoDeGremio getTipo() {
		return tipo;
	}

	protected void setTipo(TipoDeGremio tipo) {
		this.tipo = tipo;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean agregarAgremiado(Agremiado agremiado) {
		
		 return this.listaAgremiados.add(agremiado);
		
		
	}
	
	

}
