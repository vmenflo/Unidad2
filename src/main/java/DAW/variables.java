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

public class variables {
    
    public static void main(String[] args) {
        
        // Cadena de texto
        //Declaracion de variable e inicialización en la misma línea
        
        String nombre = "Víctor";
        
        // Declaracion e inicialización en diferentes líneas
        
        String apellido;
        apellido = " Mena Flores";
        
        System.out.print(nombre);
        System.out.print(apellido);
        System.out.println("");
        
        //De esta forma lo mostramos por pantalla de forma concadenada
        System.out.print(nombre + apellido);
        
        
        // numeros enteros
        
        int edad = 29;
        
        System.out.println("La edad de " + nombre + apellido + " es " + edad);
        
        // numeros decimales
        //Para usar float siempre terminar el numero con una f
        float estatura = 1.87f;
        int estaturaEnCm = 187;
        double peso = 95.4;
        
        System.out.println("Estatatura: " + estatura + " en centimetros (" + estaturaEnCm + ")" 
                + ". Su peso es: " + peso );
        
        // Text block
        //Permiten formatear texto en variables de líneas. hay que poner 3 comillas
        
        System.out.println("--------------------------------");
        
        String bloqueTexto = """
                             Soy Victor Mena Flores
                             mido %f y peso %f
                             """.formatted(estatura, peso); //Para mostrar los datos de las variables hay que indicar en el bloque %f, y despues .formatted
        System.out.println("");
        System.out.println(bloqueTexto);
        
        // Variables boolean
        // Blanco es true y negro false
        boolean blancoNegro = true;
        
        System.out.println("¿Es el valor blanco?" + blancoNegro);
        
        // Solicitar datos por teclados
        
        // Clase Scanner: sirve para introducir datos por teclado y leer ficheros de texto
        // Para ello tenemos que importar el scanner de la API de JAVA
        // En la variable teclado se ha creado un objeto usando un constructor
        // de la clase Scanner pasando como parámetro System.in
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Usuario, introduce tu nombre: ");
        
        // El método nextLine lee un texto desde teclado, escucha el teclado hasta que le damos a enter
        // El método next lee una palabra
        
        String name = teclado.nextLine();
        
       // System.out.println("Tu nombre es: " + name);
        
        // Vamos a leer los apellidos
        
        System.out.print("Introduce tu primer apellido: ");   
        String apellido1 = teclado.next();
        
       // System.out.println("tu apellido es: " + apellido1);
        
        System.out.println("Introduce tu edad: ");
        int age = teclado.nextInt();
        teclado.nextLine();
        
       // System.out.println("Tu edad es: " + age);
        
        System.out.println("¿cuanto pesas?");
        
        double ppeso = teclado.nextDouble();
        teclado.nextLine();
        
       // System.out.println("Tu peso es : " + weight);
        
        System.out.println("Introduce el nombre de tu mascota: ");
        String nombreMascota = teclado.nextLine();
       // System.out.println("Tu mascota es: " + nombreMascota);
        
        // Cada vez que trabajemos con next() o numeros, hay que limpiar la basura con teclado.nextLine()
        
        
        String texto = """
                       
                       Tu nombre es %s, ty primer apellido es: %s .
                       Tienes %d y pesas %.2f .
                       Y tu mascota se llama %s
                       
                       """.formatted(name, apellido1, age, ppeso, nombreMascota);
        System.out.println(texto);
        
        //De esta forma pedimos la entrada un String, luego la transformamos a int
        
        System.out.println("¿Cuanto mides? (m) :");
        String heightTexto = teclado.nextLine();
        int heigth =  Integer.parseInt(heightTexto);
        
        System.out.println("Tu estatura es: " + heigth);
        
        
        // Vamos a calcular el IMC
        
        // peso/altura² 
        
        double imc = (ppeso/(Math.pow(heigth,2)));
        
        System.out.println("Tu IMC es: " + imc);
    }
    
}
