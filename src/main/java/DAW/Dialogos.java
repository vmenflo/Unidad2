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
public class Dialogos {
    
    public static void main(String[] args) {
        
        // IMC corporal de una persona
        // showImputDialog es método estático .. un metodo estatico no necesita de un objeto
        // Muestra un mensaje y un text area para introducir información
        // Devuelve lo que se teclea en un String
        
        String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
        
        // System.out.println("Tu nombre es: " + nombre);
        
        // Mostrar informacion con showMessageDialog
        
        // JOptionPane.showMessageDialog(null, "Tu nombre es : " + nombre);
        
        // PEDIMOS ESTATURA
        
        String estaturaTexto = JOptionPane.showInputDialog("Introduce"
                + " estatura en metros : ");
        double estatura = Double.parseDouble(estaturaTexto);
        JOptionPane.showMessageDialog(null,"La estatura es : " 
                + estatura);
        
        // PEDIMOS EL PESO
        
        String pesoTexto = JOptionPane.showInputDialog("Por favor, "
                + "introduce tu peso en kgs");
        double peso = Double.parseDouble(pesoTexto);
        
        double  imc = peso/Math.pow(estatura,2);
        
        String resultado = """
                           ---------------
                           
                           Te llamas %s, mides
                           %.2f y pesas %.2f
                           Tu IMC es %f
                           
                           ---------------
                           """.formatted(nombre, estatura,peso, imc);
        JOptionPane.showMessageDialog(null, resultado);
        
    }
    
}
