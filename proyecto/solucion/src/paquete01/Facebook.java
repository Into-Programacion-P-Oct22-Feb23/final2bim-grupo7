/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Facebook {
    public static String crearFacebook() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String ciudad;
        String pais;
        String correo;
        String mensaje;
        System.out.println("Ingrese el nombre de usuario:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        System.out.println("Ingrese la ciudad en la que vive:");
        entrada.nextLine();
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el país en el que vive:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();
        mensaje = String.format("Usuario: %s\nEdad: %d\nCiudad: %s\n"
                + "País: %s\nCorreo Electrónico: %s\n", nombre, edad,
                ciudad, pais, correo);
        return mensaje;
    }
}
