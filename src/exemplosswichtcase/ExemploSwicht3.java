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
public class ExemploSwicht3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner sc = new Scanner(System.in);
        int finalplaca;
        System.out.println("Digite o final da placa");
        finalplaca = sc.nextInt();
        
        switch (finalplaca){
            case 0:
            case 1:
                System.out.println("Nao roda a segunda:");
                break;
            case 2:
            case 3:
                System.out.println("Nao roda Terçeira:");
                break;
            case 4:
            case 5:
                System.out.println("Nao roda a quarta:");
                break;
            case 6:
            case 7:
                System.out.println("Nao roda a quinta:");
                break;
            case 8:
            case 9:
                System.out.println("Nao roda a sexta:");
                break;
            default:
                System.out.println("Numero invalido:");
                break;
                
        }
        
    }
    
}
