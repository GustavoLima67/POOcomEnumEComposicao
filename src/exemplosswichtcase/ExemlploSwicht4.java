
package exemplosswichtcase;

import java.util.Scanner;


public class ExemlploSwicht4 {

    public static void main(String[] args) {
   
      
      
              //declaração de variaveis//

       double numero1;
       double numero2;
       int op;
       double resultado;


	  //Entrada de Dados//

	Scanner sc = new Scanner (System.in);

	System.out.println("Digite o 1 numero:");
	  numero1 = sc.nextDouble();

        System.out.println("Digite o 2 numero:");
	  numero2 = sc.nextDouble();
	  
     
	  
	System.out.println("|--------------------|"); 
	System.out.println("| 1 -   Soma         |");
        System.out.println("| 2 -   Sub          |");
        System.out.println("| 3 -   Mult         |");
	System.out.println("| 4 -   Div          |");
	System.out.println("|--------------------|");


	System.out.println("Escolha agora uma das opções:");

	op=sc.nextInt();

	  switch (op){

	    case 1:

				  resultado =numero1+numero2;

		 System.out.println("A soma dos numeros é:"+resultado);

				  
		break;

	    case 2:

				  resultado =numero1-numero2;

		 System.out.println("A subtração dos numeros é:"+resultado);

	        break;
			
	    case 3:

				  resultado =numero1*numero2;

		 System.out.println("A multiplicação dos numeros é:"+resultado);

		break;	  
		  

	    case 4:

				  resultado =numero1/numero2;

		 System.out.println("A divisao dos numeros é:"+resultado);

	        break;

	    default:


		 System.out.println("Opção invalida");
				  
				  
		  }
   
    
    }
    
}
       
     

