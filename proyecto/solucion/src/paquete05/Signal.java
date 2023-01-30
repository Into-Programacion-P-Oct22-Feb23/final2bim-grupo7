/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;
import java.util.Scanner;
/**
 *
 * @author renat
 */
public class Signal {
    public static String crearSignal() {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int telefono;
        String ciudad;
        String pais;
        String hobby;        
        String mensaje;
        System.out.println("Ingrese el nombre de usuario:");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono:");
        telefono = entrada.nextInt();
        System.out.println("Ingrese la ciudad en la que vive:");
        entrada.nextLine();
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el país en el que vive:");
        pais = entrada.nextLine();
        System.out.println("Ingrese cuál es su hobby principal:");
        hobby = entrada.nextLine();
        mensaje = String.format("Usuario: %s\nNúmero de Teléfono: %d\n"
                + "Ciudad: %s\nPaís: %s\nHobby Principal: %s\n", usuario,
                telefono, ciudad, pais, hobby);
        return mensaje;
    }
}
