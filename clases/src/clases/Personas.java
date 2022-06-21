package clases;
import java.util.Scanner;
public class Personas {
    private Scanner teclado;
    private String nombre;
    private float[] estatura ;
    private int edad;
    
    public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese nombre:");
        nombre=teclado.next();
        System.out.print("Ingrese edad:");
        edad=teclado.nextInt();
    }


    public void imprimir() {
        System.out.println("Nombre:"+nombre);
        System.out.println("Edad:"+edad);
    }
    
    public void esMayorEdad() {
        if (edad>=18) {
            System.out.print(nombre+" es mayor de edad.");
        } else {
            System.out.print(nombre+" no es mayor de edad.");
        }
    }
    
    public void cargar(){
		teclado=new Scanner(System.in);
		estatura=new float[5];
		
		for (int i=0; i<5;i++) {
			System.out.print("ingrese la estatura de la persona " +  i);
			estatura[i]=teclado.nextFloat();
			}
		}
	
	public void calcularPromedio() {
		float suma = 0;
		float promedio = 0;
		for (int i=0;i<5;i++) {
	 suma=suma + estatura[i]; 
	  promedio =suma/5;
	 }

	System.out.println("Promedio de es+tatura"+ promedio);
	
	}

}