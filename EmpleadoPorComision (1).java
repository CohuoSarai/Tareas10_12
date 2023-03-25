package ejercicio10_12;

public class EmpleadoPorComision extends EmpleadoBase {

	private double VentasBrutas; 
	private double TarifaPorComision; 


	public EmpleadoPorComision(String PrimerNombre, String ApellidoPaterno, String NumeroSeguroSocial, String FechadeNacimiento,
			double VentasBrutas, double TarifaPorComision) {
		super(PrimerNombre, ApellidoPaterno, NumeroSeguroSocial, FechadeNacimiento);

		if (TarifaPorComision <= 0.0 || TarifaPorComision >= 1.0) 
			throw new IllegalArgumentException("La Tarifa de Comision debe ser de > 0.0 y < 1.0");

		if (VentasBrutas < 0.0) 
			throw new IllegalArgumentException("Las Ventas brutas deben ser de >= 0.0");

		this.VentasBrutas = VentasBrutas;
		this.TarifaPorComision = TarifaPorComision;
	}


	public void establecerVentasBrutas(double VentasBrutas) {
		if (VentasBrutas < 0.0) 
			throw new IllegalArgumentException("Las Ventas Brutas deben ser de >= 0.0");

		this.VentasBrutas = VentasBrutas;
	}

	
	public double obtenerVentasBrutas() {
		return VentasBrutas;
	}

	
	public void establecerTarifaPorComision(double TarifaPorComision) {
		if (TarifaPorComision <= 0.0 || TarifaPorComision >= 1.0) 
			throw new IllegalArgumentException("La Tarida por Comision debe ser de> 0.0 y < 1.0");

		this.TarifaPorComision = TarifaPorComision;
	}


	public double obtenerTarifaPorComision() {
		return TarifaPorComision;
	}

	public double Ingresos() {
		return obtenerTarifaPorComision() * obtenerVentasBrutas();
	}

	
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "comisiones por empleado", super.toString(), "Ventas Brutas",
				obtenerVentasBrutas(), "Tarifa por Comision", obtenerTarifaPorComision());
	}
}
