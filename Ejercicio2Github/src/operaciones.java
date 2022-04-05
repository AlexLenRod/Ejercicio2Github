

/**
 * Se importa la utilidad de Scanner para poder ingresar datos desde teclado
 */
import java.util.Scanner; 
/**
 * La idea de esta app es que el usuario inicialmente ingresando un numero de entre 1 y 4 seleccione
 * la operacion que desea realizar, una vez hace su eleccion se le piden dos numeros que seran los
 * parametros que recibiran los metodos que realizan dichas operaciones. Finalmente se imprime por
 * consola el resultado de la operacion.
 *  
 * @author ALLER
 *
 */
public class operaciones {

	public static void main(String[] args) {
		// Declaracion de variables
		 int opcion;
	     double numero1, numero2, resultado=0;

	     /* Aqui se despliega un menu donde se le pide al usuario que haga una eleccion entre cuatro 
	      * operaciones
	      */
	     System.out.println("C A L C U L A D O R A");
	     Scanner entrada = new Scanner(System.in);

	     System.out.println("1.-Suma");
	     System.out.println("2.-Resta");
	     System.out.println("3.-Multiplicacion");
	     System.out.println("4.-Division");


	     System.out.print("ingrese numero de operacion quieres realizar : ");      
	     opcion = entrada.nextInt();
	     System.out.print("\n");
	       
	     /**
	      * Comprobacion de que el numero ingresado por el usuario si se encuentre entre el rango 
	      * establecido
	      */
	     if (opcion >=1 && opcion <=4)
	     {
	    	/**
	    	 * Se pide al usuario que ingrese dos numeros que seran los operandos de la operacion
	    	 * que el metodo correspondiente recibira como parametros
	    	 */
	        System.out.print("ingrese primer numero : ");
	        numero1 = entrada.nextDouble();
	        System.out.print("ingrese segundo numero : ");
	        numero2 = entrada.nextDouble();
	          
	        /**
	         * Si el usuario elige la opcion 1, se realiza una suma
	         */
	        if (opcion==1)
	        {

	           System.out.println("Usted a elegido sumar los dos numeros");
	           suma(numero1, numero2);
	           //Se llama al metodo suma pasandole los dos numeros ingresados como parametros
	           resultado = suma(numero1, numero2);
	        }
	          
	        /**
	         * Si el usuario elige la opcion , se realiza una resta
	         */
	        if (opcion==2)
	        {

	           System.out.println("Usted a elegido restar los dos numeros");
	           //Se llama al metodo resta pasandole los dos numeros ingresados como parametros
	           resta(numero1, numero2);
	           resultado = resta(numero1, numero2);
	        }
	          
	        /**
	         * Si el usuario elige la opcion 3, se realiza una multiplicacion
	         */
	        if (opcion==3)
	        {

	           System.out.println("Usted a elegido multiplicar los dos numeros");
	           //Se llama al metodo multip pasandole los dos numeros ingresados como parametros
	           multip(numero1, numero2); 
	           resultado = multip(numero1, numero2);
	        }
	        
	        /**
	         * Si el usuario elige la opcion 4, se realiza una division
	         */
	        if (opcion==4)
	        {

	           System.out.println("Usted a elegido dividir los dos numeros");
	           //Se llama al metodo division pasandole los dos numeros ingresados como parametros
	           division(numero1, numero2); 
	           resultado = division(numero1, numero2);
	        }
	        
	        //Se imprime por consola un texto mas el resultado de la operacion realizada
	        System.out.print("El resultado de la operacion es : "+resultado);
	        System.out.print("\n");
	     }
	     
	     else
	    	/**
	    	 * Si el usuario no ha ingresado uno de los numeros que se corresponde con una de 
	    	 * las operaciones, se mostrara un mensaje en consola indicando el error
	    	 */
	        System.out.println("el numero "+opcion+ " no corresponde a ninguna operacion");
	        System.out.print("\n");
	}

	/**
	 * Metodo suma que recibe dos parametros y devuelve el valor que resulta de sumarlos
	 *  
	 * @param a. Este parametro sera el primer operando de la suma
	 * @param b. Este parametro sera el segundo operando de la suma
	 * @return. Se devuelve el resultado de sumar los dos parametros recibidos
	 */
    public static double suma(double a, double b) {
    	double r1 = a + b;
    	return r1;
    }

    /**
	 * Metodo resta que recibe dos parametros y devuelve el valor que resulta de restarlos
	 *  
	 * @param a. Este parametro sera el primer operando de la resta
	 * @param b. Este parametro sera el segundo operando de la resta
	 * @return. Se devuelve el resultado de restar los dos parametros recibidos
	 */
    public static double resta(double a, double b) {
    	double r2 = a - b;
    	return r2;
    }

   
    /**
	 * Metodo multip que recibe dos parametros y devuelve el valor que resulta de multiplicarlos
	 *  
	 * @param a. Este parametro sera el primer operando de la multiplicacion
	 * @param b. Este parametro sera el segundo operando de la multiplicacion
	 * @return. Se devuelve el resultado de sumar los dos parametros recibidos
	 */
    public static double multip(double a, double b) {
    	double r3 = a * b;
    	return r3;
    }

	/**
	 * Metodo division que recibe dos parametros y devuelve el valor que resulta de dividirlos
	 *  
	 * @param a. Este parametro sera el primer operando de la division
	 * @param b. Este parametro sera el segundo operando de la division
	 * @return. Se devuelve el resultado de dividir los dos parametros recibidos
	 */
    public static double division(double a, double b) {
    	double r1 = a / b;
    	return r1;
    }


}
