
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jessica
 */
public class questaoif3 {
    public static void main (String []args){
           
        
        System.out.println ("maior");
        Scanner sc = new Scanner (System.in);
        System.out.println ("digite um numero");
        int maior = sc.nextInt ();
        System.out.println ("digite outro numero");
        int menor = sc.nextInt ();
        
        
        if (maior>menor){
            System.out.println (maior);
        }
        else{
            System.out.println (menor);
            
        }
        
       
        
        
                
               
        
        
        
    }
    
}
