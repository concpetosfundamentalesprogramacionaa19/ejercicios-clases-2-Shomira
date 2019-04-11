/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicoclase;


import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class MiEjercicio {
    public static void main(String[] args) {
    String nombre;
    String apellidos;
    int edad;
    String ciudad, pais;
    int nota1, nota2;
    double promedio;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Ingrese sus nombres ");
    nombre = entrada.nextLine();
    System.out.println("Ingrese sus apellidos");
    apellidos = entrada.nextLine();
    System.out.println("Ingrese su edad");
    edad = entrada.nextInt();
    entrada.nextLine();
    System.out.println("Ingrese la ciudad");
    ciudad = entrada.nextLine();
    System.out.println("Ingrese el pais ");
    pais = entrada.nextLine();
    System.out.println("Ingrese la nota 1 : ");
    nota1 = entrada.nextInt();
    System.out.println("Ingrese la nota 2 : ");
    nota2 = entrada.nextInt();
    promedio = (nota1 + nota2)/2;
    System.out.printf("Su nombres y apellidos: %s\n\nEdad: %s\n\nCiudad: "
    + "%s\n\nPais: %s\n\nNotas: %s\n\nPromedio: %s", nombre +" "+ apellidos, 
    edad, ciudad, pais, nota1+","+nota2, promedio);
    }
}
