package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Juego implements Serializable{
    private List<Pregunta> preguntas;
    private int contCorrectas;
    private int contIncorrectas;

    public Juego() {
        this.preguntas = new ArrayList<>();
        contCorrectas = 0;
        contIncorrectas = 0;
    }

    public void setContCorrectas(int contCorrectas) {
        this.contCorrectas = contCorrectas;
    }

    public void setContIncorrectas(int contIncorrectas) {
        this.contIncorrectas = contIncorrectas;
    }
    
    public int getContCorrectas() {
        return contCorrectas;
    }

    public int getContIncorrectas() {
        return contIncorrectas;
    }
    
    public void aumentarCorrectas(){
        contCorrectas++;
    }
    
    public void aumentarIncorrectas(){
        contIncorrectas++;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }
    
    public Pregunta getPregunta(int index){
        if(index >= preguntas.size()){
            return null;
        }
        return preguntas.get(index);
    }
    
    public void eliminarPregunta(int index){
        preguntas.remove(index);
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
    
    @Override
    public String toString(){
        for (Pregunta preg : preguntas) {
            System.out.println("----------------------------");
            System.out.println(preg.getValor());
            
            for (Respuesta res : preg.getRespuestas()) {
                System.out.println(res.getLetra()+" - "+res.getValor()+" ["+res.isCorrecta()+"]");
            }
        }
        System.out.println("----------------------------");
        
        return "";
    }

    public void modificarPregunta(Pregunta p, int index) {
        preguntas.get(index).reemplazar(p);
    }
}
