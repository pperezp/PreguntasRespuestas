package model;

import java.io.Serializable;

public class Respuesta implements Serializable{
    private String letra;
    private String valor;
    private boolean correcto;

    public Respuesta(String letra, String valor, boolean correcto) {
        this.letra = letra;
        this.valor = valor;
        this.correcto = correcto;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isCorrecta() {
        return correcto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }
    
    
}
