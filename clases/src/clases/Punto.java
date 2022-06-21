package clases;
import java.util.Scanner;

public class Punto {
	//inicializo y - x parta saber en que punto del cuadrante se encuentra el punto 
  int y,  x;
  //Scaner
  Scanner teclado=new Scanner(System.in);
  
  public void localizarPunto() {
	  System.out.println("Ingrese valor de x: ");
	  x=teclado.nextInt();
  
	  System.out.println("Ingrese valor de y: ");
		  y=teclado.nextInt();
	  
  }
  
  public void imprimirValores() {
	  System.out.println("vlaor de x: "+ x);
	  System.out.println("vlaor de y: "+ y);
  }
  
  public  void localizarCuadrante() {
	  if (x<0 && y<0) {
		  System.out.println("el punto esta en el 3 cuadrante"+ x + " - " + y);
	  }else if (x<0 && y>0) {
		  System.out.println("el punto esta en el 1 cuadrante"+ x + " - " + y);
	  }else if (x>0 && y>0) {
		  System.out.println("el punto esta en el 2 cuadrante"+ x + " - " + y);
	  }else if(x>0 && y<0) {
		  System.out.println("el punto esta en el 4 cuadrante"+ x + " - " + y);
	  }
	  
  }
	
}