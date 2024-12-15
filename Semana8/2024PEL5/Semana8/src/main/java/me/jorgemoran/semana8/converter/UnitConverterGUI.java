package me.jorgemoran.semana8.converter;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class UnitConverterGUI extends JFrame implements ConversionObserver{
    private JTextField inputField;
    private JLabel resultLabel;
    private JComboBox<String> conversionType;
    private Map<String, ConversionStrategy> strategies;

    public UnitConverterGUI() {
        setupStrategies();
        setupGUI();
    }

    private void setupStrategies() {
        strategies = new HashMap<>();
        strategies.put("Temperatura", new CelsiusToFarenheitStrategy());
        strategies.put("Distancia", new KilometersToMilesStrategy());
    }

    private void setupGUI() {
        setTitle("Convertidor de Unidades");
        setLayout(new GridLayout(4, 1, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        conversionType = new JComboBox<>(strategies.keySet().toArray(new String[0]));
        inputField = new JTextField();
        JButton convertButton = new JButton("Convertir");
        resultLabel = new JLabel("Resultado: ", SwingConstants.CENTER);

        convertButton.addActionListener(e -> performConversion());

        add(conversionType);
        add(inputField);
        add(convertButton);
        add(resultLabel);

        pack();
        setSize(300, 200);
        setLocationRelativeTo(null);
    }

    private void performConversion() {
        try {
            String selected = (String) conversionType.getSelectedItem();
            ConversionStrategy strategy = strategies.get(selected);
            double value = Double.parseDouble(inputField.getText());
            double result = strategy.convert(value);
            onConversionPerformed(result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Error: Ingrese un número válido");
        }
    }

    @Override
    public void onConversionPerformed(double result) {
        String selected = (String) conversionType.getSelectedItem();
        ConversionStrategy strategy = strategies.get(selected);
        resultLabel.setText(String.format("%.2f %s = %.2f %s",
                Double.parseDouble(inputField.getText()),
                strategy.getFromUnit(),
                result,
                strategy.getToUnit()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new UnitConverterGUI().setVisible(true);
        });
    }
}
