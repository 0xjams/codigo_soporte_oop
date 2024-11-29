package me.jorgemoran.semana6.gui;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new FirstWindow().setVisible(true);
            }
        });



    }
}
