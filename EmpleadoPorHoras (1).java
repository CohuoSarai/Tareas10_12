package ejercicio10_12;

public class EmpleadoPorHoras extends EmpleadoBase{

	private double Sueldo; 
	private double Horas; 

	
	public EmpleadoPorHoras(String PrimerNombre, String ApellidoPaterno, String NumeroSeguroSocial, String FechadeNacimiento, 
			double Sueldo, double Horas) {
		super(PrimerNombre, ApellidoPaterno, NumeroSeguroSocial, FechadeNacimiento);

		if (Sueldo < 0.0) 
			throw new IllegalArgumentException("El Sueldo por Hora debe ser de >= 0.0");

		if ((Horas < 0.0) || (Horas > 168.0)) 
			throw new IllegalArgumentException("Las Horas trabajadas deben ser de >= 0.0 y <= 168.0");

		this.Sueldo = Sueldo;
		this.Horas = Horas;
	}
	
	public void establecerSueldo(double Sueldo) {
		if (Sueldo < 0.0) 
			throw new IllegalArgumentException("El Sueldo por hora debe ser de >= 0.0");

		this.Sueldo = Sueldo;
	}

	
	public double obtenerSueldo() {
		return Sueldo;
	}

	
	public void establecerHoras(double Horas) {
		if ((Horas < 0.0) || (Horas > 168.0)) 
			throw new IllegalArgumentException("Las Horas trabajadas debe se de >= 0.0 y <= 168.0");

		this.Horas = Horas;
	}

	
	public double obtenerHoras() {
		return Horas;
	}

	
	public double Ingresos() {
		if (obtenerHoras() <= 40) 
			return obtenerSueldo() * obtenerHoras();
		else
			return 40 * obtenerSueldo() + (obtenerHoras() - 40) * obtenerSueldo() * 1.5;
	}


	public String toString() {
		return String.format("Empleado Por Horas: %s%n%s: $%,.2f; %s: %,.2f", super.toString(), "Sueldo Por Horas", obtenerSueldo(),
				"Horas trabajadas", obtenerHoras());
	}

	public EmpleadoPorHoras obtenerTime(int i, int j, int k, double d, int l) {
		// TODO Auto-generated method stub
		return null;
	}
}
