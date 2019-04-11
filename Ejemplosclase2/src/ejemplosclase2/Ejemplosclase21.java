/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase2;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Ejemplosclase21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este metodo es el principal de mi proyecto
        // No olvidar declarar variables
        
        String nombre;
        String apellido;
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Porfavor ingresar sus nombres: ");
        nombre = entrada.nextLine();
       
        System.out.println("Porfavor ingrese su apellido: ");
        apellido = entrada.next();
        System.out.println("Su nombre es : "+nombre+"\n\n\t"+"Su apellido es : "
                +apellido );



        
    }
    
}
