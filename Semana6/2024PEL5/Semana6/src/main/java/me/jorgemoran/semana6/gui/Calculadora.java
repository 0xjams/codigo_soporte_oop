package me.jorgemoran.semana6.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JTextField display;
    private double result = 0;
    private String lastOperation = "=";
    private boolean start = true;

    public Calculadora() {
        // Configuración de la ventana
        configureWindow();
        // Crear componentes
        createDisplay();
        createButtons();
        pack();
        // Establecer un tamaño fijo para la calculadora
        setSize(300, 450);
        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);
        // Prevenir el redimensionamiento
        setResizable(false);
    }

    private void configureWindow() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
    }

    private void createDisplay() {
        display = new JTextField("0");
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setPreferredSize(new Dimension(300, 50));
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        add(display, BorderLayout.NORTH);
    }

    private void createButtons() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Agregar el botón C en la primera fila
        JButton clearButton = new JButton("C");
        clearButton.setFont(new Font("Arial", Font.BOLD, 18));
        clearButton.setForeground(Color.RED);
        clearButton.addActionListener(e -> {
            display.setText("0");
            result = 0;
            lastOperation = "=";
            start = true;
        });
        buttonPanel.add(clearButton);

        // Agregar espacios vacíos para mantener el diseño
        for (int i = 0; i < 3; i++) {
            JButton empty = new JButton("");
            empty.setEnabled(false);
            buttonPanel.add(empty);
        }

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            buttonPanel.add(button);
            button.addActionListener(new ButtonClickListener());
        }
        add(buttonPanel, BorderLayout.CENTER);
    }

    private void calculate(double n) {
        switch (lastOperation) {
            case "+":
                result += n;
                break;
            case "-":
                result -= n;
                break;
            case "*":
                result *= n;
                break;
            case "/":
                if (n != 0) {
                    result /= n;
                } else {
                    JOptionPane.showMessageDialog(this,
                            "¡No es posible dividir entre cero!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    result = 0;
                }
                break;
            case "=":
                result = n;
                break;
        }
        display.setText(String.valueOf(result));
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();

            // Si es un número o punto decimal
            if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
                if (start) {
                    display.setText(command);
                } else {
                    display.setText(display.getText() + command);
                }
                start = false;
            }
            // Si es un operador
            else {
                // Solo calcular si hay un número ingresado
                if (!start) {
                    calculate(Double.parseDouble(display.getText()));
                }
                lastOperation = command;
                start = true;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
}