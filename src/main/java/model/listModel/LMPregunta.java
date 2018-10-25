/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.listModel;

import java.util.List;
import javax.swing.AbstractListModel;
import model.Pregunta;

/**
 *
 * @author prez
 */
public class LMPregunta extends AbstractListModel<Pregunta>{
    private final List<Pregunta> lista;

    public LMPregunta(List<Pregunta> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Pregunta getElementAt(int i) {
        return lista.get(i);
    }
    
}
