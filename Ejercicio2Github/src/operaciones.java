

/**
 * Se importa la utilidad de Scanner para poder ingresar datos desde teclado
 */
import java.util.Scanner; 
/**
 * La idea de esta app es que el usuario inicialmente ingresando un numero de entre 1 y 3 seleccione
 * la operacion que desea realizar, una vez hace su eleccion se le piden dos numeros que seran los
 * parametros que recibiran las funciones que realizan dichas operaciones. Finalmente se imprime por
 * pantalla el resultado de la operacion.
 *  
 * @author ALLER
 *
 */
public class operaciones {

	public static void main(String[] args) {
		// Declaracion de variables
		 int opc;
	     double num1, num2, result=0;

	     /* Aqui se despliega un menu donde se le pide al usuario que haga una eleccion entre tres 
	      * operaciones
	      */
	     System.out.println("C A L C U L A D O R A");
	     Scanner entrada = new Scanner(System.in);

	     System.out.println("1.-Suma");
	     System.out.println("2.-Resta");
	     System.out.println("3.-Multiplicacion");


	     System.out.print("ingrese numero de operacion quieres realizar : ");      
	     opc = entrada.nextInt();
	     System.out.print("\n");
	       
	     /**
	      * Comprobacion de que el numero ingresado por el usuario si se encuentre entre el rango 
	      * establecido
	      */
	     if (opc >=1 && opc <=3)
	     {
	    	//Se pide al usuario que ingrese dos numeros que seran los operandos de la operacion
	        System.out.print("ingrese primer numero : ");
	        num1 = entrada.nextDouble();
	        System.out.print("ingrese segundo numero : ");
	        num2 = entrada.nextDouble();
	          
	        /**
	         * Si el usuario elige la opcion 1, se realiza una suma
	         */
	        if (opc==1)
	        {

	           System.out.println("Usted a elegido sumar los dos numeros");
	           suma(num1, num2);
	           result = suma(num1, num2);
	        }
	          

	        if (opc==2)
	        {

	           System.out.println("Usted a elegido restar los dos numeros");
	           resta(num1, num2);
	           result = resta(num1, num2);
	        }
	          

	        if (opc==3)
	        {

	           System.out.println("Usted a elegido multiplicar los dos numeros");
	           multip(num1, num2); 
	           result = multip(num1, num2);
	        }
	        

	        System.out.print("El resultado de la operacion es : "+result);
	        System.out.print("\n");
	     }
	     
	     else

	        System.out.println("el numero "+opc+ " no corresponde a ninguna operacion");
	        System.out.print("\n");
	}


   public static double suma(double a, double b) {
     double r1 = a + b;
     return r1;
   }

   
   public static double resta(double a, double b) {
     double r2 = a - b;
     return r2;
   }

   
   
   public static double multip(double a, double b) {
     double r3 = a * b;
     return r3;
   }

}
