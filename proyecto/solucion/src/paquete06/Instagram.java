/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;
import java.util.Scanner;
/**
 *
 * @author renat
 */
public class Instagram {
    public static void crearInstagram() {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String ciudad;
        int edad;
        String correo;
        System.out.println("Ingrese el nombre de usuario:");
        usuario = entrada.nextLine();
        System.out.println("Ingrese la ciudad en la que vive:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        System.out.println("Ingrese su correo electrónico:");
        entrada.nextLine();
        correo = entrada.nextLine();
        System.out.printf("\nResumen de la cuenta:\n"
                + "Usuario: %s\nCiudad: %s\n"
                + "Edad: %d\nCorreo Electrónico: %s\n\n", usuario,
                ciudad, edad, correo);
    }
}
