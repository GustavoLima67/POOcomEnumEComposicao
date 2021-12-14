/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosswichtcase;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class ExemploSwict2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    
    
        Scanner sc = new Scanner(System.in);
        
        int number;
        System.out.println("Digite um numero");
        number = sc.nextInt();
        
        switch(number) {
                    case 1:
            System.out.println("voce escolheu 1");
                        break;
                        
                    case 2:
            System.out.println("voce escolheu 2");
                        break;
                        
                    case 3:
            System.out.println("voce escolheu 3");
                        break;
                        
                    default:
            System.out.println("numero invalido");
                        
        }
    
    
    }
    
}
