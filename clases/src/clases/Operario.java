package clases;
import java.util.Scanner;

public class Operario {
  private int dimSueldo;
  private int[]  sueldo; 
  private float[] turnoMan;
  private float[] turnoTar;
  
  
  public void cargar() {
	 Scanner teclado=new Scanner(System.in); 
	 System.out.print("Cantidad de sueldos a cargar: ");
	 dimSueldo=teclado.nextInt();
	  sueldo=new int[dimSueldo];
	  
	  for (int i=0; i<sueldo.length; i++ ) {
	      System.out.print("Ingrese los sueldo");
		  sueldo[i]=teclado.nextInt();
		    }
  }

  public void cargarPorTurno(){
	  Scanner teclado=new Scanner(System.in);
	  turnoMan=new float[4];
	  turnoTar=new float[4];
	  
	  for (int i=0; i<4; i++) {
		  System.out.print("Ingresar empleado" + i + " del turno mañana: " );
		  turnoMan[i]=teclado.nextFloat();
	  }
	  
	  for (int i=0; i<4; i++) {
		  System.out.print("Ingresar empleado" + i + " del turno tarde: " );
		  turnoTar[i]=teclado.nextFloat();
	  }
  }
  
  	public void mostrarSueldosPorTurnos() {
  		for (int i=0; i<4; i++) {
  			System.out.println("Sueldo Turno Mañana" + i +": "+ turnoMan[i]);
  		}
  		System.out.println("Tarde");
  		System.out.println(" ");
  		
  		
  		for (int i=0; i<4; i++) {
  			System.out.println("Sueldo Turno Tarde" + i +": "+ turnoTar[i]);
  		}
  	}
	  public void mostrarSueldos() {
		  for (int i=0; i<sueldo.length; i++ ) {
		  System.out.println(sueldo[i]);	  
		  }		  
	
	  
	  
	  }
  }
