/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosswichtcase;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Gustavo
 */
public class ExemploSwicht1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner sc = new Scanner (System.in);
        int number;
        System.out.println("Escolha um sabor do Bolo");
        number = sc.nextInt();
        
        
        switch (number){
            case 1:
            case 2:
                System.out.println("Voce escolheu um Bolo de chocolate.");
                break;
            case 3:
            case 4:
                System.out.println("Voce escolheu um Bolo de morango.");
                break;
            case 5:
            case 6:
                System.out.println("Voce escolheu umn Bolo abacaxi.");
                break;
            default:
                System.out.println("Numero invalido.");
                    
        }
        if (true){
            System.out.println("Esta permetido a recolher seu Bolo:");
            
        }
        else {
            System.out.println("Nao esta permitido a recolher seu Bolo:");
            
        }
        Random r = new Random();
        for (int i = 0; i > 5; i++){
            System.out.println(r.nextInt(30)+1);
        }
        System.out.println("Hello Word");
    }
    
}
