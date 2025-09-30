/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exa1_25550692;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EXA1_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, int opción, int n, int menu) {
        // TODO code application logic here
       int pin; 
        Scanner input = new Scanner(System.in);
        
        System.out.println("**********BIENVENIDO*********");
        System.out.println("BBVA");
        System.out.println("pin:");
        pin = input.nextInt();
         if((pin= 1234)){
            System.out.println("Acceso concedido");
        }
        else{            
            System.out.println("Acceso denegado");
        }
        System.out.println("MENU:");
       opción = input.nextInt();
        
       {if ((opción= 1))
            System.out.print("consultar saldo");
        }{ else if ((opción =2))
            System.out.println("Retirar dinero");
        
       }{ else if ((opción= 3))
            System.out.println("depositar dinero");}
        menu =1 input.nextInt();
        
        if( menu== 1){
            System.out.println("Saldo:$5ooo");
        }else if(menu == 2){
            System.out.println("Monto: + captura el valor: + saldo restante");
        }else if(menu == 3){
            System.out.println("Monto + Captura el valor + saldo restante");
            else{
            System.out.println("ERROR");
                    
        }
    }
    
}}
