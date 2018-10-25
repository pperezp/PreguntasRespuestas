package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pregunta implements Serializable{
    private String valor;
    private List<Respuesta> respuestas;
    private Respuesta respuestaCorrecta;

    public Pregunta() {
    }
    
    public Pregunta(String valor) {
        this.valor = valor;
        this.respuestas = new ArrayList<>();
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public List<Respuesta> getRespuestas() {
        return respuestas;
    }

    public Respuesta getRespuesta(String letra){
        for (Respuesta res : respuestas) {
            if(res.getLetra().equals(letra)){
                return res;
            }
        }
        
        return null;
    }
    
    public boolean isRespuestaCorrecta(String letra){
        return getRespuesta(letra).isCorrecta();
    }

    public void setRespuestaCorrecta(Respuesta respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    public Respuesta getRespuestaCorrecta(){
        for (Respuesta res : respuestas) {
            if(res.isCorrecta()){
                respuestaCorrecta = res;
                break;
            }
        }
        
        return respuestaCorrecta;
    }
    
    public void addRespuesta(Respuesta respuesta) {
        this.respuestas.add(respuesta);
    }
    
    public void reemplazar(Pregunta nueva){
        this.respuestaCorrecta = nueva.getRespuestaCorrecta();
        this.respuestas = nueva.getRespuestas();
        this.valor = nueva.getValor();
    }

    @Override
    public String toString() {
        return valor;
    }
    
    
}
