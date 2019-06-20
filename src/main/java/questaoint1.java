
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
public class questaoint1 {
    public static void main(String []args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("digite um numero");
        int contador = sc . nextInt ();
        System.out.println ("digite um numero");
        int valorFinal =sc . nextInt ();
        
        while (valorFinal > contador ){
            System.out.println (contador);
            contador = contador + 1;
            
        }
       
    }
    
    
}
            
