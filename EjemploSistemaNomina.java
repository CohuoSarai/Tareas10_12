package ejercicio10_12;

import java.security.SecureRandom;
import java.util.Calendar;

public class EjemploSistemaNomina {
	 public static void main(String[] args) 
	   {
		 int MesActual = new SecureRandom().nextInt(12) + 1;
		// Calendar FechadeNacimiento = Calendar.obtenerFechadeNacimiento();
		 
	      EmpleadoConSalario EmpleadoConSalario = 
	   new EmpleadoConSalario("John", "Smith", "111-11-1111", new Date(11, 14, 1987), 800.00);
	      EmpleadoPorHoras EmpleadoPorHoras = 
	   new EmpleadoPorHoras("Karen", "Price", "222-22-2222", new Date(6, 3, 1985) , 16.75, 40);
	      EmpleadoPorComision EmpleadoPorComision = 
	   new EmpleadoPorComision("Sue", "Jones", "333-33-3333", new Date(2, 27, 1993), 10000, .06);
	      EmpleadoBaseMasComision EmpleadoBaseMasComision = 
	   new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", new Date(4, 11, 1989), 5000, .04, 300);

	      System.out.println("Mes Actual: " + MesActual);
	      
	      EmpleadoBase[] Empleados = new EmpleadoBase[4]; 

	      Empleados[0] = EmpleadoConSalario;
	      Empleados[1] = EmpleadoPorHoras;
	      Empleados[2] = EmpleadoPorComision; 
	      Empleados[3] = EmpleadoBaseMasComision;

	      System.out.printf("Empleados en Proceso de forma Polimorfica:%n%n");
	      
	    
	      for (EmpleadoBase EmpleadoActual : Empleados) 
	      {
	         System.out.println(EmpleadoActual); 

	         
	         if (EmpleadoActual instanceof EmpleadoBaseMasComision) 
	         {
	            
	            EmpleadoBaseMasComision Empleado =  (EmpleadoBaseMasComision) EmpleadoActual;

	            Empleado.establecerSalarioBase(1.10 * Empleado.obtenerSalarioBase());

System.out.printf("El Nuevo Salario base con 10%% de aumento es: $%,.2f%n", Empleado.obtenerSalarioBase());
	         } 
	         
	         if(MesActual == EmpleadoActual.obtenerFechadeNacimiento().obtenerMes() ){
	             System.out.printf(
	            		 
	                     "ganado $%,.2f + 100$ bonus = $%,.2f%n%n",EmpleadoActual.Ingresos() ,EmpleadoActual.Ingresos() + 100);
	         } else {
	             System.out.printf(
	                     "ganado $%,.2f%n%n", EmpleadoActual.Ingresos());
	         }
	      } 
	   } 

}
