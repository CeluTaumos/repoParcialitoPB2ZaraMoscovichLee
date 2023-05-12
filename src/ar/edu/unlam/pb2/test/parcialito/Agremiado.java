package ar.edu.unlam.pb2.test.parcialito;

import java.time.LocalDate;

public class Agremiado extends Efectivo {
	
	// ATRIBUTO DE CLASE
		private Gremio gremio;

		// CONSTRUCTOR

		public Agremiado(String nombre, String apellido, Long CUIL, Long legajo, LocalDate fingreso, LocalDate fnac,
				Departamento departamento, ObraSocial obraSocial, Gremio gremio, Credencial credencial, Double sueldo) {
			super(nombre, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, credencial, sueldo);

			this.gremio = gremio;
		}

		protected Gremio getGremio() {
			return gremio;
		}

		protected void setGremio(Gremio gremio) {
			this.gremio = gremio;
		}

		

}
