/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAW;

/**
 *
 * @author victor
 */
public class OperadoresRelacionales {
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 8;
        
        boolean aMayorB = a>b;
        System.out.println("a mayor b " +aMayorB);
        
        boolean aMenorB = a<b;
        System.out.println("a menor b " + aMenorB);
        
        boolean aMayorIgualB = a>=b;
        System.out.println("a mayor o igual b " + aMayorIgualB);
        
        boolean aMenorIgualB = a<=b;
        System.out.println("a menor igual b " + aMenorIgualB);
        
        boolean aIgualB = a==b;
        System.out.println("a igual b " + aIgualB);
        
        boolean adistintoB = a!=b; // a no es igual a b
        System.out.println("a distinto de b " + adistintoB);
        
    }
    
}
