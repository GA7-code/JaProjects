/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exsean;

/**
 *
 * @author godalone
 */
public class Segment {
    private int ext1,ext2;
    
    public Segment(int ext1,int ext2){
        this.ext1=ext1;
        this.ext2=ext2;
    }
    public void ordonne(){
                            int temp;
                            if (ext1>ext2){
                                            temp=ext1;
                                            ext1=ext2;
                                            ext2=temp;

                                            System.out.println("ext1="+ext1+"\next2="+ext2);
                            }
                            else{
                                       System.out.println("ext1="+ext1+"\next2="+ext2);
                            }
    }
    
    public int getLongueur(){
                                return (ext2-ext1);
    }
    
    public void appartient(int x){
                                    if(x>=ext1 && x<=ext2){
                                                            System.out.println(""+x+" appartient au segment");
                                    }
                                    else{
                                          System.out.println(""+x+" n'appartient pas au segment");  
                                    }
    }
    public String toString(){
                               return "SEGMENT["+ext1+","+ext2+"]";
    }
    
}
