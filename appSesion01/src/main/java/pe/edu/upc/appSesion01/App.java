package pe.edu.upc.appSesion01;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Clase objeto=new Constructor()    	
    	Scanner s=new Scanner(System.in);    	
    	
    	System.out.println( "Ejercicio 1" );
    	String[] arrNombre;    	
    	arrNombre=new String[3];
    	
    	//tipos de datos basico/primitivos
    	int numero;
    	int[] valores;
    	double monedas;
    	
    	//Wrapper( Clases Envolventes)==> 
    	//Casting ( Conversion de tipos de datos ) 
    	Integer valores_2=new Integer(1);
    	Double x=new Double(10);
    	
    	//Estructuras de control
    	for (int i = 0; i < arrNombre.length; i++) {
		   System.out.print("Ingrese un nombre"+(i+1));
		   arrNombre[i]=s.nextLine();
		}
    	
    	for (int i = 0; i < arrNombre.length; i++) {
    		System.out.print(arrNombre[i]);
    		System.out.print("hola");
		}
    	
        
    }
}
