package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Juego implements Serializable{
    private List<Pregunta> preguntas;

    public Juego() {
        this.preguntas = new ArrayList<>();
    }
   
    public List<Pregunta> getPreguntas() {
        return preguntas;
    }
    
    public Pregunta getPregunta(int index){
        return preguntas.get(index);
    }

    public void addPregunta(Pregunta pregunta) {
        this.preguntas.add(pregunta);
        
        for (Pregunta preg : preguntas) {
            System.out.println("----------------------------");
            System.out.println(preg.getValor());
            
            for (Respuesta res : preg.getRespuestas()) {
                System.out.println(res.getLetra()+" - "+res.getValor()+" ["+res.isCorrecta()+"]");
            }
        }
        System.out.println("----------------------------");
    }
}
