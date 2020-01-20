/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.awt.event.*;
/**
 *
 * @author PC-005
 */
public class MiListener implements ActionListener{
    private Ventana3 window;
    
    public MiListener(Ventana3 window){
        this.window=window;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == window.getSave()){
            System.out.println("Guardar");
                return;
        }
        if(e.getSource() == window.getCancel()){
            System.out.println("Cancelar");
            return;
        }
        //System.out.println("Aceptar2");
    }
    
}
