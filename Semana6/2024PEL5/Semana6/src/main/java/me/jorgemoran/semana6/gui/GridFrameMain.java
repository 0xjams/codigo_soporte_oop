package me.jorgemoran.semana6.gui;

import me.jorgemoran.semana6.listener.UnoUnoActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridFrameMain {

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
                grid.add(new JButton("cuarto"));
                grid.add(new JButton("quinto"));
                frame.add(grid);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 200);
                frame.setVisible(true);
                Component c = grid.getComponent(0);
                if(c instanceof JButton){
                    JButton primerBoton = (JButton) c;
                    primerBoton.addActionListener(new UnoUnoActionListener());
                }
                JButton segundoBoton = (JButton) grid.getComponent(1);
                segundoBoton.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Estoy en el segundo boton");
                        createDialog(frame);
                    }
                });
                JButton tercerBoton = (JButton) grid.getComponent(2);
                tercerBoton.addActionListener(new UnoUnoActionListener());
            }
        });
    }
    private static void createDialog(JFrame parent) {
        JDialog dialog = new JDialog(parent, "Dialog Window", true);

        // Create dialog content
        JPanel dialogPanel = new JPanel(new BorderLayout(10, 10));
        dialogPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        dialogPanel.add(new JLabel("Dialog opened from segundo button"), BorderLayout.CENTER);

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> dialog.dispose());
        dialogPanel.add(closeButton, BorderLayout.SOUTH);

        dialog.add(dialogPanel);
        dialog.pack();
        dialog.setLocationRelativeTo(parent);
        dialog.setVisible(true);
    }
}
