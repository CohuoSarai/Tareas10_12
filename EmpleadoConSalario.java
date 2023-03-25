package ejercicio10_12;

public class EmpleadoConSalario extends EmpleadoBase
{
	private double SalarioSemanal;

	
	public EmpleadoConSalario(String PrimerNombre, String ApellidoPaterno, String NumeroSeguroSocial, String FechadeNacimiento,
			double SalarioSemanal) {
		super(PrimerNombre, ApellidoPaterno, NumeroSeguroSocial, FechadeNacimiento);

		if (SalarioSemanal < 0.0)
			throw new IllegalArgumentException("El Salario Semanal debe ser de >= 0.0");

		this.SalarioSemanal = SalarioSemanal;
	}

	public void establecerSalarioSemanal(double SalarioSemanal) {
		if (SalarioSemanal < 0.0)
			throw new IllegalArgumentException("El Salario Semanal debe ser de >= 0.0");

		this.SalarioSemanal = SalarioSemanal;
	}


	public double obtenerSalarioSemanal() {
		return SalarioSemanal;
	}

	
	public double Ingresos() {
		return obtenerSalarioSemanal();
	}


	public String toString() {
		return String.format("Empleado Con Salario: %s%n%s: $%,.2f", super.toString(), "Salario Semanal", obtenerSalarioSemanal());
	}

}
