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

	public Boolean despedir(Efectivo efec1) {
		return this.listaEmpleados.remove(efec1);
		
	}
	
	public Double depositarSueldo(Empleado efec1, Double importeADepositar) {
		
		Double saldo = efec1.getSueldo();
		
		return saldo+=importeADepositar;
		
	}
	
//	public Boolean listarEfectivos() {
//		HashSet <Efectivo> listaEfectivos = new HashSet <Efectivo>(this.getListaEmpleados()) {
//			
//		}
//	}

//	public Empleado buscarPorCuil(Long cUIL) {
//
//		Empleado encontrado = null;
//		encontrado.setCUIL(cUIL);
//
//		for (int i = 0; i < this.listaEmpleados.size(); i++) {
//			if (this.listaEmpleados.contains(encontrado)) {
//				return encontrado;
//			} else {
//				encontrado = null;
//			}
//
//		}
//		return encontrado;
//
//	}

}
