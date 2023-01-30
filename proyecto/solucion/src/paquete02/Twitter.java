/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Twitter {
    public static void crearTwitter() {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String nombres;
        String apellidos;
        int edad;
        String ciudad;
        String pais;
        String idioma;
        String correo;
        System.out.println("Ingrese el nombre de usuario:");
        usuario = entrada.nextLine();
        System.out.println("Ingrese sus nombres:");
        nombres = entrada.nextLine();
        System.out.println("Ingrese sus apellidos:");
        apellidos = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        System.out.println("Ingrese la ciudad en la que vive:");
        entrada.nextLine();
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el país en el que vive:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su idioma de preferencia:");
        idioma = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();
        System.out.printf("\nResumen de la cuenta:\n"
                + "Usuario: %s\nNombres: %s\nApellidos: %s\n"
                + "Edad: %d\nCiudad: %s\nPaís: %s\nIdioma: %s\n"
                + "Correo Electrónico: %s\n\n", usuario, nombres, apellidos,
                edad, ciudad, pais, idioma, correo);
    }
}
