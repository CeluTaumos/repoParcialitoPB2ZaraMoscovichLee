package ar.edu.unlam.pb2.test.parcialito;

import java.time.LocalDate;

public abstract  class Empleado {
	
	//ATRIBUTOS DE CLASE
	public String nombre;
	public String apellido;
	public Long CUIL;
	public Long legajo;
	public LocalDate fingreso;
	public LocalDate fnac;
	public Departamento departamento;
	public Credencial credencial;

	//CONSTRUCTOR
	public Empleado(String nombre, String apellido, Long CUIL, Long legajo, LocalDate fingreso, LocalDate fnac,
	Departamento departamento,Credencial credencial) {

	

	this.nombre = nombre;

	this.apellido = apellido;

	this.CUIL = CUIL;

	this.legajo = legajo;

	this.fingreso = fingreso;

	this.fnac = fnac;

	this.departamento = departamento;

	this.credencial=credencial;

}
}
