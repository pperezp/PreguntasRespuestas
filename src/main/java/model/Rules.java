package model;

import java.awt.Color;
import java.io.File;

public class Rules {
    public static final String     NOMBRE_APP                       = "Millionaire";
    public static final String     VERSION_APP                      = "0.1a";
    
    public static final Color      COLOR_FONDO                      = Color.decode("#000434");
    public static final Color      COLOR_LETRAS                     = Color.decode("#FFB900");
    public static final Color      COLOR_FONDO_PREGUNTAS            = Color.decode("#3B2F83");
    public static final Color      COLOR_CORRECTA                   = Color.decode("#00B500");
    public static final Color      COLOR_INCORRECTA                 = Color.decode("#F93131");
    public static final Color      COLOR_CANCELAR                   = Color.decode("#0404B4");
    public static final int        PAUSE_SABER_RESPUESTA_CORRECTA   = 4;
    public static final int        PAUSE_ENTRE_PREGUNTAS            = 4;
    
    // parpadeos para animación de respuesta correcta
    public static final int        PARPADEOS                        = 3;
    // 100 es preciso. Mientras mayor sea el número, mas lento
    public static final int        VELOCIDAD_PARPADEO               = 100;
    
    /*Recursos*/
    public static final String     MP3_CORRECTA                     = new File("recursos/correcta.mp3").getPath();
    public static final String     MP3_INCORRECTA                   = new File("recursos/incorrecto.mp3").getPath();
    public static final String     MP3_MAIN                         = new File("recursos/main2.mp3").getPath();
    public static final String     MP3_PREGUNTAS                    = new File("recursos/preguntas.mp3").getPath();
    public static final String     MP3_SELECCION_RESPUESTA          = new File("recursos/seleccion_respuesta.mp3").getPath();
    /*Recursos*/
}
