package model;

import java.util.ArrayList;
import java.util.List;

public class Pregunta {
    private String valor;
    private List<Respuesta> respuestas;

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
        return getRespuesta(letra).isCorrecto();
    }
    
    public Respuesta getRespuestaCorrecta(){
        for (Respuesta res : respuestas) {
            if(res.isCorrecto()){
                return res;
            }
        }
        
        return null;
    }
    
    public void addRespuesta(Respuesta respuesta) {
        this.respuestas.add(respuesta);
    }
    
    
}
