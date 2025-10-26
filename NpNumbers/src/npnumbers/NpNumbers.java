/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package npnumbers;

import java.util.Scanner;

/**
 *
 * @author godalone
 */
public class NpNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                                                Scanner sc = new Scanner(System.in);
                                                System.out.println("Entrez votre nombre:");
                                                int n =sc.nextInt();
                                                
                                                
                                                System.out.println("\nLes "+n+" premiers nombres premiers sont:");
                                                System.out.println("------------------------------------------------------");
                                                
                                                
                                                int count=0;
                                                int nombre=2;
                                                int lignescount=0;
                                                
                                                
                                                while(count<n){
                                                                    if(estPremier(nombre)){
                                                                                             System.out.printf("%5d",nombre);
                                                                                             count++;
                                                                                             lignescount++;
                                                                                             
                                                                                             
                                                                                             if(lignescount%10==0){
                                                                                                                    System.out.println();
                                                                                             }
                                                                    }
                                                                    nombre++;
                                                }
                                                sc.close();
                                                
                                                
                                                
                                                
    }
    
    public static Boolean estPremier(int nombre){
                                                    if(nombre<=1) return false;
                                                    if(nombre==2) return true;
                                                    if(nombre%2==0) return false;
                                                     
                                                    for(int i=3;i*i<=nombre;i+=2){
                                                                                     if(nombre%i==0){
                                                                                                        return false;
                                                                                     }
                                                                                     
                                                    }
                                                    return true;
    }
    
}
