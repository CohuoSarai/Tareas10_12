package ejercicio10_12;

public class FechadeNacimiento {

	private int Mes; 
	private int Dia; 
	private int Año; 

	   private static final int[] diaspormes = 
	      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   
	   
	   public FechadeNacimiento(int Mes, int Dia, int Año)
	   {
	   
	      if (Mes <= 0 || Mes > 12)
	       throw new IllegalArgumentException("Mes (" + Mes + ") debe ser 1-12");

	      if (Dia <= 0 || 
	         (Dia > diaspormes[Mes] && !(Mes == 2 && Dia == 29)))
	 throw new IllegalArgumentException("Dia (" + Dia + ") Fuera de rango para un Mes del Año");

	      if (Mes == 2 && Dia== 29 && !(Año % 400 == 0 || (Año % 4 == 0 && Año % 100 != 0)))
 throw new IllegalArgumentException("Dia (" + Dia + ") Fuera de Rango para un Mes y Año especifico");

	      this.Mes = Mes;
	      this.Dia = Dia;
	      this.Año = Año;
	   } 
	   
		public int obtenerMes() {
			return Mes;
		}
		
		public int obtenerDia() {
			return Dia;
		}
		
		public int obtenerAño() {
			return Año;
		}

	   public String toString()
	   { 
	      return String.format("%d/%d/%d", Mes, Dia, Año); 
	   } 
}
