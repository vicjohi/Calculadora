/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculadora.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

/**
 *
 * @author José
 */
public class InyeccionDependenciasOperacionesMatematicas  implements ActionListener, Serializable {

  private OperacionesMatematicas operacionesMatematicas;
    public void operacion(OperacionesMatematicas operacionesMatematicas){
        this.operacionesMatematicas=operacionesMatematicas;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       this.operacionesMatematicas.operacion();
    }
}
