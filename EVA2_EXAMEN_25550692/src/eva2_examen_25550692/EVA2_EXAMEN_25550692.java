/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_examen_25550692;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_EXAMEN_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input =  new Scanner(System.in);
        int valor, i, j, numero = 0, divi = 0, residuo;
        
        System.out.println("BIENVENDO");
        System.out.println("1 Numeros primos");
        System.out.println("2 Numeros no primos");
        System.out.println("3 TERMINAR");
        valor = input.nextInt();
        switch(valor){
            case 1:
                System.out.println("Elegiste primos ");
                break; 
            case 2: 
                System.out.println("Elegiste no primos");
                break;
               case 3:
                System.out.println("GRACIAS POR PARTICIPAR");
                break;}
                
                System.out.println("Introduce un valor:");
        
        valor = input.nextInt();
          valor= input.nextInt();
            for(i = 2; i < valor; i++){
                residuo = valor % i;
                if(residuo == 0){
                      break;
            }
            }
                
        for(i = 1; i<= valor; i++){
            for(j = 1; j<= i; j++ ) {
                System.out.print("*");
            }
            System.out.println("");
        }
    
       for(i = 1; i <= numero; i++){
            if(numero % i == 0){
            divi++;
            }
         if(divi == 2){
            System.out.println(divi);
        }else{
            System.out.println(divi);
        }
        
        
    
        }
    }
}
    

 
    
    

