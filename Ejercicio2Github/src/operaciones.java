


import java.util.Scanner; 

public class operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
	     double num1, num2, result=0;

	     System.out.println("C A L C U L A D O R A");
	     Scanner entrada = new Scanner(System.in);

	     System.out.println("1.-Suma");
	     System.out.println("2.-Resta");
	     System.out.println("3.-Multiplicacion");


	     System.out.print("ingrese numero de operacion quieres realizar : ");      
	     opc = entrada.nextInt();
	     System.out.print("\n");
	       

	     if (opc >=1 && opc <=3)
	     {

	        System.out.print("ingrese primer numero : ");
	        num1 = entrada.nextDouble();
	        System.out.print("ingrese segundo numero : ");
	        num2 = entrada.nextDouble();
	          

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
