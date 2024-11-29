package me.jorgemoran.semana6.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnoUnoActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Object origen = e.getSource();
        if(origen instanceof JButton){
            JButton botonPresionado = (JButton) origen;
            if(botonPresionado.getText().equals("tercero")){
                System.out.println("Estoy en el tercer boton");
            }else if(botonPresionado.getText().equals("1,1")){
                System.out.println("Estoy en el primer boton");
            }
        }
    }
}
