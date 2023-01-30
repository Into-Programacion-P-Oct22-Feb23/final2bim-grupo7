/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Telegram {
    public static void crearTelegram() {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int telefono;
        String ciudad;
        String pais;
        String area;
        System.out.println("Ingrese el nombre de usuario:");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono:");
        telefono = entrada.nextInt();
        System.out.println("Ingrese la ciudad en la que vive:");
        entrada.nextLine();
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el país en el que vive:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su área de interés:");
        area = entrada.nextLine();
        System.out.printf("\nResumen de la cuenta:\n"
                + "Usuario: %s\nNúmero de Teléfono: %d\nCiudad: "
                + "%s\nPaís: %s\nÁrea de interés: %s\n\n", usuario,
                telefono, ciudad, pais, area);
    }
}
