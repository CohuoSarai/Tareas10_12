package ejercicio10_12;


public abstract class EmpleadoBase {
	private final String PrimerNombre;
	private final String ApellidoPaterno;
	private final String NumeroSeguroSocial;
	private final String FechadeNacimiento;

	
	public EmpleadoBase(String PrimerNombre, String ApellidoPaterno, String NumeroSeguroSocial, String FechadeNacimiento) {
		this.PrimerNombre = PrimerNombre;
		this.ApellidoPaterno = ApellidoPaterno;
		this.NumeroSeguroSocial = NumeroSeguroSocial;
		this.FechadeNacimiento = FechadeNacimiento;
	}


	public String obtenerPrimerNombre() {
		return PrimerNombre;
	}

	
	public String obtenerApellidoPaterno() {
		return ApellidoPaterno;
	}


	public String obtenerNumeroSeguroSocial() {
		return NumeroSeguroSocial;
	}


	public String obtenerFechadeNacimiento() {
		return FechadeNacimiento;
	}
	
	
	public String toString() {
		return String.format("%s %s%nNumero de Seguro Social: %s", obtenerPrimerNombre(), obtenerApellidoPaterno(),
				obtenerNumeroSeguroSocial());
	}


	public abstract double Ingresos(); // 
} 
