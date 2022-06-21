package clases;

import java.util.Scanner;

public class Vectores {
  private int[] vector;
  
  public void cargarVector() {
	  Scanner teclado=new Scanner(System.in);

	  vector= new int[10];
	  
	  for ( int i=0; i<10; i++ ) {
		  System.out.print("Rellene un vector");
		  vector[i]=teclado.nextInt();
      }	  

  }
  
  public void evaluarOrdenVector() {
	  boolean bandera = false;
	  for ( int i=0; i<9; i++ ) {
		  if (vector[i] > vector[i+1]) {
			  bandera= true;
	     } else {
		 bandera=false;
	     }
     }
	  	if (bandera==true) {
	  	System.out.print("esta ordenado");
	  	}else {
	  		System.out.print("no esta ordenado");
	  	}
  }
  
}
