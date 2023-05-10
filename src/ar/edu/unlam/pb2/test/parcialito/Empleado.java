package ar.edu.unlam.pb2.test.parcialito;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Empleado {

	// ATRIBUTOS DE CLASE PADRE

	public String nombre;
	public String apellido;
	public Long CUIL;
	public Long legajo;
	public LocalDate fingreso;
	public LocalDate fnac;
	public Departamento departamento;
	public Credencial credencial;
	public Double sueldo;

	// CONSTRUCTOR
	public Empleado(String nombre, String apellido, Long CUIL, Long legajo, LocalDate fingreso, LocalDate fnac,
			Departamento departamento, Credencial credencial, Double sueldo) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.CUIL = CUIL;
		this.legajo = legajo;
		this.fingreso = fingreso;
		this.fnac = fnac;
		this.departamento = departamento;
		this.credencial = credencial;
		this.sueldo = sueldo;

	}

	LocalDate getFingreso() {
		return fingreso;
	}

	void setFingreso(LocalDate fingreso) {
		this.fingreso = fingreso;
	}

	LocalDate getFnac() {
		return fnac;
	}

	void setFnac(LocalDate fnac) {
		this.fnac = fnac;
	}

	Departamento getDepartamento() {
		return departamento;
	}

	void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Double getSaldo() {
		return sueldo;
	}

	public void setSaldo(Double saldo) {
		this.sueldo = saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CUIL);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(CUIL, other.CUIL);
	}

	public abstract boolean abrirPuerta(Puerta puerta, Credencial credencial);
}
