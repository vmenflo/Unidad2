/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAW;

/**
 *
 * @author victor
 */
public class operadoresAritmeticos {
    
    public static void main(String[] args) {
        
        int a = 12, b = 5;
        
        // SUMA
        
        int suma = a+b; // A+B es una expresion aritmetica
        System.out.println("La suma es: " + suma);
        
        //RESTO
        
        int resta = a-b;
        System.out.println("La resta es: " + resta);
        
        //PRODUCTO
        
        int producto = a*b;
        System.out.println("El producto es: " + producto);
        
        //DIVISION
        
        int division = a/b;
        System.out.println("La division es: " + division);
        
        //RESTO O MODULO
        
        int resto = a%b; //Operador resto o modulo --Devuelve el valor del resto de una division entera (int)
        System.out.println("El resto de la division es: " + resto);
        
        
        // EJEMPLO
        division = 1010/200;
        resto = 1010%200;
        System.out.println("La division es: " + division + ". Y el Resto: " + resto);;
    }
    
}

