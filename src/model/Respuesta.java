package model;

public class Respuesta {
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

    public boolean isCorrecto() {
        return correcto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }
    
    
}
