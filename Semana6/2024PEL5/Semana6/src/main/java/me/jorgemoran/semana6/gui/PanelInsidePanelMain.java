package me.jorgemoran.semana6.gui;

import javax.swing.*;
import java.awt.*;

public class PanelInsidePanelMain {

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
                    JFrame frame = new JFrame("Flow Layout");
                    JPanel grid = new JPanel(new GridLayout(2, 2));
                    grid.add(new JButton("1,1"));
                    grid.add(new JButton("1,2"));
                    grid.add(new JButton("tercero"));
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
                    grid.add(panel);
                    frame.add(grid);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(300, 200);
                    frame.setVisible(true);
                }
            });
        }
    }

