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
public class PresupuestoPared {
    
    public static void main(String[] args) {
        
        double a, b, c; // Declaramos las variables
        final double PRECIO_PINTURA = 7.25; // Registramos el precio como constante ya que este valor no cambiara
        
        String textoInicial= """
                             Para realizar el presuesto necesitamos saber
                             las medidas de la pared. Por favor especifique a continuación:
                             a: Ancho de la pared
                             b: Altura de la pared (rectangulo)
                             c: Altura del triangulo
                             """;
        
        System.out.println(textoInicial);
        
        System.out.println("¿Cuanto mide a (ancho pared)?"); // pedimos el ancho del cuadrado
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextDouble();
        
        System.out.println("¿Cuanto mide b (altura pared)?"); // pedimos la altura
        b = teclado.nextDouble();
        
        System.out.println("¿Cuanto mide la altura de c (triangulo)?"); // pedimos la altura del triangulo
        c = teclado.nextDouble();
        
        // Formula para conseguir el presupuesto calculando el volumen de la pared y lo multiplicamos por la pintura
        
        double volumenTotal = (a*b)+((a*c)/2);
        double precioPresupuesto = volumenTotal*PRECIO_PINTURA;
        
        System.out.printf("El precio de pintar la pared con las medidas especificadas es: %.2f €", precioPresupuesto );
        
    }
    
}
