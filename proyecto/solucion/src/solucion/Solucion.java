/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucion;

import java.util.Scanner;
import paquete01.Facebook;
import paquete02.Twitter;
import paquete03.Whatsapp;
import paquete04.Telegram;
import paquete05.Signal;
import paquete06.Instagram;
import paquete07.Flickr;
import paquete08.Mensaje;

/**
 *
 * @author renat
 */
public class Solucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num;
        boolean bandera = true;
        String mensaje;
        int contador = 0;
        String opcion;
        while (bandera) {
            System.out.println("Ingrese 1 para cuenta en Facebook; 2 para "
                    + "Twitter; 3 para WhatsApp; 4 para telegram; 5 para "
                    + "Signal; 6 para Instagram o 7 para Flickr");
            num = entrada.nextInt();
            if (num == 1) {
                mensaje = Facebook.crearFacebook();
                System.out.printf("\nResumen de la cuenta:\n"
                        + "%s\n",mensaje);
            } else {
                if (num == 2) {
                    Twitter.crearTwitter();
                } else {
                    if (num == 3) {
                        mensaje = Whatsapp.crearWhatsapp();
                        System.out.printf("\nResumen de la cuenta:\n"
                        + "%s\n",mensaje);
                    } else {
                        if (num == 4) {
                            Telegram.crearTelegram();
                        } else {
                            if (num == 5) {
                                mensaje = Signal.crearSignal();
                                System.out.printf("\nResumen de la cuenta:"
                                        + "\n%s\n",mensaje);
                            } else {
                                if (num == 6) {
                                    Instagram.crearInstagram();
                                } else {
                                    if (num == 7) {
                                        mensaje = Flickr.crearFlickr();
                                        System.out.printf("\nResumen de "
                                                + "la cuenta:\n"
                                                + "%s\n",mensaje);
                                    } else {
                                        System.out.println("\nError en la "
                                                + "opcion seleccionada");
                                        contador = contador - 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            contador = contador + 1;
                System.out.println("Ingrese s para salir:");
                entrada.nextLine();
                opcion = entrada.nextLine();
                if (opcion.equals("s")) {
                    bandera = false;
                }
        }
        System.out.printf("Se han creado un total de %d cuentas\n", contador);
            mensaje = Mensaje.obtenerMensaje(contador);
            System.out.println(mensaje);
    }
}
