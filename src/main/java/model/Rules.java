package model;

import java.awt.Color;

public class Rules {
    public static final String     NOMBRE_APP                       = "Millionaire";
    public static final String     VERSION_APP                      = "0.1a";
    
    public static final Color      COLOR_FONDO                      = Color.decode("#000434");
    public static final Color      COLOR_LETRAS                     = Color.decode("#FFB900");
    public static final Color      COLOR_FONDO_PREGUNTAS            = Color.decode("#3B2F83");
    public static final Color      COLOR_CORRECTA                   = Color.decode("#00B500");
    public static final int        PAUSE_SABER_RESPUESTA_CORRECTA   = 2;
    public static final int        PAUSE_ENTRE_PREGUNTAS            = 2;
    
    // parpadeos para animación de respuesta correcta
    public static final int        PARPADEOS                        = 3;
    // 100 es preciso. Mientras mayor sea el número, mas lento
    public static final int        VELOCIDAD_PARPADEO               = 100;
}
