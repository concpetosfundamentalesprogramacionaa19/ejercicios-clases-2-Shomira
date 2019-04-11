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
public class Ejemplosclase22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este metodo es el principal de mi proyecto
        // No olvidar declarar variables
        
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Porfavor ingresar su nombre: ");
        nombre = entrada.nextLine();
     
        System.out.println("Porfavor ingrese su apellido: ");
        apellido = entrada.nextLine();
        System.out.println("Porfavor ingresar su edad : ");
        edad= entrada.nextInt();
        entrada.nextLine();//Limpieza del buffwer de entrada de datos
        System.out.println("Ingrese la ciudad que vive: ");
        ciudad=entrada.nextLine();
       
        System.out.println("Su nombre : "+nombre+"\n\n\t"+
                "Su apellido es : "+apellido+", edad: " + edad+"\n"+" Ciudad:"+
                ciudad);
        


        
    }
    
}
