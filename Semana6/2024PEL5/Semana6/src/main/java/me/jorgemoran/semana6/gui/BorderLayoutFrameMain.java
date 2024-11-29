package me.jorgemoran.semana6.gui;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutFrameMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }
                // Create the main window
                JFrame frame = new JFrame("Puntos cardinales");
                JPanel panel = new JPanel(new BorderLayout());

                // Create buttons
                JButton northButton = new JButton("Norte");
                JButton southButton = new JButton("Sur");
                JButton eastButton = new JButton("Este");
                JButton westButton = new JButton("Oeste");
                panel.add(northButton, BorderLayout.NORTH);
                panel.add(southButton, BorderLayout.SOUTH);
                panel.add(eastButton, BorderLayout.EAST);
                panel.add(westButton, BorderLayout.WEST);
                westButton.setVisible(false);
                frame.add(panel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 200);
                frame.setVisible(true);
            }
        });
    }
}
