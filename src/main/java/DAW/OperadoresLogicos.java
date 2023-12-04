/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAW;

import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
       int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad "));
       
       
       // Si la edad es menor o igual a 18, o mayor a 60, 
       // guarda true para el descuento
       boolean descuento = ((edad<=18)||(edad>60));
       
       System.out.println("¿Descuento? " + descuento);
       
       
       // EJEMPLO OPERACION AND
       
       int minutos = Integer.parseInt(JOptionPane.showInputDialog("Minutos: "));
       
       //SI minutos es mayor o igual a cero Y menor o igual a 59 guarda true
       
       boolean minutosOK = minutos>0&&minutos<=59;
       
        System.out.println("Minutos OK? : " +minutosOK);
        
        Boolean aux = !minutosOK;
        System.out.println("aux " + aux);
        
        
       
       
    }
    
}
