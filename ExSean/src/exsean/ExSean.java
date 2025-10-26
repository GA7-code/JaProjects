/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exsean;

/**
 *
 * @author godalone
 */
public class ExSean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                                                Segment p = new Segment(12,24);
                                                p.ordonne();
                                                p.appartient(13);
                                                System.out.println("Le "+p.toString()+" a pour longueur:"+p.getLongueur());
                                                
                                                Segment f= new Segment(45,15);
                                                f.ordonne();
                                                f.appartient(15);
                                                System.out.println("Le "+f.toString()+" a pour longueur:"+f.getLongueur());
                                                
    }
    
}
