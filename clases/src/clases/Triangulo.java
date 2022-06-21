package clases;
import java.util.Scanner;

public class Triangulo {
//atributos 
	int lado1, lado2 , lado3;
 boolean marca;
	//instaciar escaner
	Scanner teclado = new Scanner(System.in);
	
	public void dimencionarLados() {
		System.out.println("Ingrese el lado 1");
		lado1=teclado.nextInt();
		System.out.println("Ingrese el lado 2");
		lado2=teclado.nextInt();
		System.out.println("Ingrese el lado 3");
		lado3=teclado.nextInt();
	   	
	}
	
  public void imprimirLados() {
	  System.out.println("La medida del lado1 es: "+lado1);
	  System.out.println("La medida del lado2 es: "+lado2);
	  System.out.println("La medida del lado3 es: "+lado3);
  }
  
  public void esEquilatero() {
	  if (lado1==lado2 && lado1==lado3) {
		  System.out.println("el triangulo es equilatero");
		  marca=true;
	  }else {
		  System.out.println("el triangulo no es equilatero");
		  marca=false;
	  }
	  
  }
	  public void ladoMayor() {
		if (marca==false) {
		  if (lado1>lado2 && lado1>lado3) {
			  System.out.println("el lado1 es mas grande");
		  }else if (lado2 >lado3) {
			  System.out.println("el lado2 es mas grande");
		  }else {
			  System.out.println("el lado3 es mas grande"); 
		  }
		}			
	  }
  }

