package ejercicio10_12;

public class EmpleadoBaseMasComision extends EmpleadoPorComision{
	
	private double SalarioBase; 

	
	public EmpleadoBaseMasComision(String PrimerNombre, String ApellidoPaterno, String NumeroSeguroSocial, String FechadeNacimiento,
			double VentasBrutas, double TarifaPorComision, double SalarioBase) {
		super(PrimerNombre, ApellidoPaterno, NumeroSeguroSocial, FechadeNacimiento, VentasBrutas, TarifaPorComision);

		if (SalarioBase < 0.0) 
			throw new IllegalArgumentException("El Salario Base debe ser de >= 0.0");

		this.SalarioBase = SalarioBase;
	}


	public void establecerSalarioBase(double SalarioBase) {
		if (SalarioBase < 0.0) 
			throw new IllegalArgumentException("El Salario Base debe ser de >= 0.0");

		this.SalarioBase = SalarioBase;
	}

	
	public double obtenerSalarioBase() {
		return SalarioBase;
	}

	public double ingresos() {
		return obtenerSalarioBase() + super.Ingresos();
	}

	public String toString() {
		return String.format("%s %s; %s: $%,.2f", "con Salario Base", super.toString(), "Salario Base", obtenerSalarioBase());
	}

}