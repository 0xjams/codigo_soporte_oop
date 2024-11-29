package me.jorgemoran.semana6.gui;

import javax.swing.*;
import java.awt.*;

public class FlowFrameMain {

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
                JPanel panel = new JPanel(new FlowLayout());
                panel.add(new JButton("1"));
                panel.add(new JButton("2"));
                frame.add(panel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 200);
                frame.setVisible(true);
            }
        });
    }
}
