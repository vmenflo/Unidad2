/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAW;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class constantes {
    
    public static void main(String[] args) {
        
        // Creamos variable tipo int -- varian a lo largo del programa
        
        int numero = 5;
        numero = 7;
        numero = 10;
        
        System.out.println(numero);
        
        // Constantes -- Nunca cambiara de valor
        // La palabra final implica que la variable pasa a ser constantes, ese dato no cambiara en todo el programa
        
        final double EURIBOR = 4.1;
        System.out.println("Euribor: " + EURIBOR);
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de hipoteca");
        
        // Lectura usando Double 
        
        double importe = teclado.nextDouble();
        teclado.nextLine();
        
        System.out.println("El importe es: " + importe);
        
        // Lectura usando String y luego lo pasamos a Double
        
         System.out.println("Introduce la cantidad de hipoteca");
        
        String importeTexto = teclado.nextLine();
        
        double importe2 = Double.parseDouble(importeTexto);
        
        System.out.printf("La cantidad leida es %.3f", importe2);
    }
    
}
