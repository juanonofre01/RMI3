/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientermi;

/**
 *
 * @author sistemas
 */

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Interface.RMIDAO;
import java.util.Scanner;

public class ClienteRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Registry registro=LocateRegistry.getRegistry("127.0.0.1",7777);
            RMIDAO interfaz = (RMIDAO) registro.lookup("RemotoRMI");

            Scanner sc = new Scanner(System.in);
        
        int scan1;
        
        System.out.println("escriba el primer numero");
        scan1= sc.nextInt();
        
        int scan2;
        System.out.println("escriba el segundo numero");
        scan2= sc.nextInt();
        
            int suma;
            suma = interfaz.sumar(scan1, scan2);
            System.out.println("el resultado de la suma es "+ suma);
           
            
            int resta;
            resta = interfaz.restar(scan1, scan2);
            System.out.println("el resultado de la resta es "+resta);
 
            
            int mult;
            mult = interfaz.multiplicar(scan1, scan2);
            System.out.println("el resultado de la multiplicacion es "+mult);

            
            float div;
            div = interfaz.dividir(scan1, scan2);
            System.out.println("el resultado de la suma es "+div);
 
        }catch(Exception e){
            System.out.println(""+e);
            
        }
    }
    
}
