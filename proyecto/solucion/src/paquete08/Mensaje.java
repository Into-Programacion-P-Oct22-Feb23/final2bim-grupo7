/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete08;

/**
 *
 * @author renat
 */
public class Mensaje {
    public static String obtenerMensaje(int contador) {
        String [] mensajeFinal = {"Campaña con poca afluencia",
            "Campaña moderada siga adelante", "Excelente campaña"};
        String mensaje = "";
        if ((contador >= 1) && (contador <= 5)) {
            mensaje = mensajeFinal[0];
        } else {
            if ((contador >= 6) && (contador <= 15)) {
                mensaje = mensajeFinal[1];
            } else {
                if (contador >= 16){
                    mensaje = mensajeFinal[2];
                }
            }
        }
        return mensaje;
    }
}
