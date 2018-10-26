package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Reproductor extends Thread{
    private Player apl;
    private String nombreCancion;
    private boolean infinito;

    public Reproductor(){
        infinito = false;
    }
    
    public void setInfinito(boolean infinito) {
        this.infinito = infinito;
    }
    
    public void setCancion(String nombre){
        nombreCancion = nombre;
    }

    @Override
    public void run() {
        try {
            do{
                System.out.println(nombreCancion + " - "+infinito);
                apl = new Player(new FileInputStream(nombreCancion));
                apl.play();
            }while(infinito);
        } catch (JavaLayerException | FileNotFoundException ex) {
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Hilo player finalizado ["+nombreCancion+"]!");
    }
    
    public void stopCancion(){
        apl.close();
    }
}
