package ar.edu.unlam.pb2.test.parcialito;

import java.util.HashSet;
import java.util.Iterator;

public class Empresa {

	// ATRIBUTOS DE LA CLASE
	private String nombre;
	private HashSet<Empleado> listaEmpleados;

	// CONSTRUCTOR
	public Empresa(String nombre) {

		this.nombre = nombre;
		this.listaEmpleados = new HashSet<Empleado>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(HashSet<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public Integer getCantListaEmpleados() {
		return listaEmpleados.size();
	}

	public Boolean agregarEmpleado(Empleado empleado) {
		return this.listaEmpleados.add(empleado);

	}

	public Integer filtrarCantidadDePasantes() {
		Integer cantidad = 0;

		for (Empleado empleado : listaEmpleados) {
			if (empleado instanceof Pasante) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public Integer filtrarCantidadDeEfectivos() {
		Integer cantidad = 0;

		for (Empleado empleado : listaEmpleados) {
			if (empleado instanceof Efectivo) {
				cantidad++;
			}
		}
		return cantidad;
	}



}

