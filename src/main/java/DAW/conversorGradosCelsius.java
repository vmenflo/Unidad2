/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAW;

/**
 *
 * @author victor
 */

import java.util.Scanner;


public class conversorGradosCelsius {
    
    public static void main(String[] args) { //Creamos el main para poder ejecutar el programa
        
        double gradosCelsius, gradosFahrenheit; //Especificamos las variables sin iniciarlas
        
        Scanner teclado = new Scanner (System.in); // Creamos el objeto teclado para solicitar los datos
        
        System.out.println("¿Cuántos grados queires convertir a fahrenheit?. Por favor; escribelo: ");
        gradosCelsius = teclado.nextDouble(); // Así guardamos el numero que introduzcamos en la variable gradosCelsius
        
        gradosFahrenheit = (gradosCelsius * 1.8) + 32; // Especificamos la formula para poder conseguir los Fahrenheit
        
        System.out.printf("La cantidad que has escrito, corresponde a %.2f grados Fahrenheit", gradosFahrenheit); 
        // Mostramos por pantalla el resultado
        
    }

    
}
