/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete07;

import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Flickr {

    public static String crearFlickr() {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String correo;
        String mensaje;
        System.out.println("Ingrese el nombre de usuario:");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();
        mensaje = String.format("Usuario: %s\nCorreo Electrónico: %s\n",
                usuario, correo);
        return mensaje;
    }
}
