/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeListener;
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
        	JDialog dialogo = new JDialog();
        	final JLabel label = new JLabel("Guardado");
        	dialogo.setSize(200, 100);
    		dialogo.setLocation(250, 300);
        	dialogo.getContentPane().add(label);
        	dialogo.setVisible(true);
            
            window.getText1().setText(null);;
            window.getText2().setText(null);
            window.getJComboBox().setSelectedIndex(0);
            window.getText3().setText(null);
            return;
        }
        if(e.getSource() == window.getCancel()){
            System.out.println("Cancelar");
            return;
        }
        if(e.getSource() == window.getNegrita()) {
        	if(window.getValB()==true) {
        		window.setValB(false);
        		window.getText4().setFont(new Font(window.getText4().getFont().getFontName(),window.getText4().getFont().getStyle()-1,window.getText4().getFont().getSize()));
        	}else {
        		window.setValB(true);
        		window.getText4().setFont(new Font(window.getText4().getFont().getFontName(),window.getText4().getFont().getStyle()+1,window.getText4().getFont().getSize()));
        	}
        
        	
        }
        if(e.getSource() == window.getCursiva()) {
        	if(window.getValI()==true) {
        		window.setValI(false);
        		window.getText4().setFont(new Font(window.getText4().getFont().getFontName(),window.getText4().getFont().getStyle()-2,window.getText4().getFont().getSize()));
        	}else {
        		window.setValI(true);
        		window.getText4().setFont(new Font(window.getText4().getFont().getFontName(),window.getText4().getFont().getStyle()+2,window.getText4().getFont().getSize()));
        	}
        }
        if(e.getSource() == window.getColor()) {
       
        	 Color c = JColorChooser.showDialog(null, "Choose a Color", window.getText4().getForeground());
             if (c != null)
            	 window.getText4().setForeground(c);
        }
        if(e.getSource()==window.getJComboBoxT()) {
        	window.getText4().setFont(new Font(window.getJComboBoxT().getSelectedItem().toString(),window.getText4().getFont().getStyle(),window.getText4().getFont().getSize()));
        }
       
        if(e.getSource()==window.getJComboBoxTam()) {

        	int i =Integer.valueOf(window.getJComboBoxTam().getSelectedItem().toString());
        	
        	window.getText4().setFont(new Font(window.getText4().getFont().getFontName(),window.getText4().getFont().getStyle(),i));
        }
    }
    
}
