/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jessica
 */
public class REVISAO {
    public static void main (String []args){
        int menor= 10;
        int maior=20;
        
        while (maior>=menor)
        {
            System.out.println (menor);
            ++menor;
                    
        }
        for (int x =0;x<=100;x++){
            System.out.println (x);
        }
     
        int numeros []={
            5,7,8,9
        };
    for (int x =0;x<numeros.length;x++){
        System.out.println (numeros [x]);
    }
    
        int valores []=new  int [4];
        for (int y =0;y<4;y++){
            valores [y]= y;
            
            
        }
                
          for (int y = 0;y<valores.length;y++)  
              System.out.println (valores [y]);
              
        
}
    
}
