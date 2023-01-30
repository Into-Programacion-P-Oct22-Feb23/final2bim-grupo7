/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Whatsapp {
    public static String crearWhatsapp() {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int telefono;
        int edad;
        String ciudad;
        String pais;
        String mensaje;
        System.out.println("Ingrese el nombre de usuario:");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono:");
        telefono = entrada.nextInt();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        System.out.println("Ingrese la ciudad en la que vive:");
        entrada.nextLine();
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el país en el que vive:");
        pais = entrada.nextLine();
        mensaje = String.format("Usuario: %s\nNúmero de Teléfono: %d\n"
                + "Edad: %d\nCiudad: %s\nPaís: %s\n", usuario, telefono,
                edad, ciudad, pais);
        return mensaje;
    }
}
