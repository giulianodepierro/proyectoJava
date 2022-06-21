package clases;
import java.util.Scanner;

public class DosVectores {
    private int[] vectorUno;
    private int[] vectorDos;
    
    public void cargarDosVectores() { 
    	Scanner teclado= new Scanner(System.in);
    	vectorUno=new int[4];
    	vectorDos=new int[4];
    	
    	System.out.println("Cargar vector 1");
    	for (int i=0; i<4; i++) {
    		
      		System.out.println("Ingrese el componente" + i + " del vector ");
      		vectorUno[i]=teclado.nextInt();
      		
    	}
        System.out.println("Cargar vector 2");
    	for (int i=0; i<4; i++) {
    	
      		System.out.println("Ingrese el componente" + i + " del vector ");
      		vectorDos[i]=teclado.nextInt();
       	 }
    	
    }
     
    public void mostrarVectores() {
    	System.out.println("Vector 1");
    	for (int i=0; i<4; i++) {    		
    		System.out.print(vectorUno[i]+ " ");
    		System.out.print(" - ");
    		System.out.print(vectorDos[i]+ " ");
    		System.out.println(" ");
    	}
    }
}
