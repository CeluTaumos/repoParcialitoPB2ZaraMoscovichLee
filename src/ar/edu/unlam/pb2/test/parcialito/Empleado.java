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
<<<<<<< HEAD
=======
		this.sueldo = sueldo;
>>>>>>> 42de5254427984c1944c3fbc02b6918934601984

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

<<<<<<< HEAD
	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	String getApellido() {
		return apellido;
	}

	void setApellido(String apellido) {
		this.apellido = apellido;
	}

	Long getCUIL() {
		return CUIL;
	}

	void setCUIL(Long cUIL) {
		CUIL = cUIL;
	}

	Long getLegajo() {
		return legajo;
	}

	void setLegajo(Long legajo) {
		this.legajo = legajo;
	}

	Credencial getCredencial() {
		return credencial;
	}

	void setCredencial(Credencial credencial) {
		this.credencial = credencial;
=======
	public Double getSaldo() {
		return sueldo;
	}

	public void setSaldo(Double saldo) {
		this.sueldo = saldo;
>>>>>>> 42de5254427984c1944c3fbc02b6918934601984
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
