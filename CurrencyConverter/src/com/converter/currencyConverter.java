package com.converter;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import com.converter.Currency;

public class currencyConverter extends JFrame {
    private JComboBox<String> sourceCurrencyComboBox;
    private JComboBox<String> targetCurrencyComboBox;
    private JTextField amountTextField;
    private JLabel resultLabel;
    private JButton convertButton;

    private ArrayList<Currency> currencies;

    public currencyConverter(ArrayList<Currency> currencies) {
        super("Currency Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        this.currencies = currencies;

        int comboBoxFontSize = 16;
        Font comboBoxFont = new Font("Arial", Font.PLAIN, comboBoxFontSize);
        
        sourceCurrencyComboBox = new JComboBox<>();
        sourceCurrencyComboBox.setFont(comboBoxFont);
        sourceCurrencyComboBox.setPreferredSize(new Dimension(200, 30));
        targetCurrencyComboBox = new JComboBox<>();
        targetCurrencyComboBox.setFont(comboBoxFont);
        targetCurrencyComboBox.setPreferredSize(new Dimension(200, 30)); 
        amountTextField = new JTextField();
        resultLabel = new JLabel("Result: ");
        convertButton = new JButton("Convert!!");

        for (Currency currency : currencies) {
            sourceCurrencyComboBox.addItem(currency.getShortName());
            targetCurrencyComboBox.addItem(currency.getShortName());
        }

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCurrency();
            }
        });

        // Add components to the JFrame
        add(new JLabel("Actual Currency:"));
        add(sourceCurrencyComboBox);
        add(Box.createVerticalStrut(10)); 
        add(new JLabel("Target Currency:"));
        add(targetCurrencyComboBox);
        add(Box.createVerticalStrut(10)); 
        add(new JLabel("Amount:"));
        add(amountTextField);
        add(Box.createVerticalStrut(10)); 
        add(convertButton);
        add(Box.createVerticalStrut(10));
        add(resultLabel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void convertCurrency() {
        try {
            String sourceCurrency = sourceCurrencyComboBox.getSelectedItem().toString();
            String targetCurrency = targetCurrencyComboBox.getSelectedItem().toString();
            Double amount = Double.parseDouble(amountTextField.getText());

            Currency sourceCurrencyObject = findCurrencyByName(sourceCurrency);
            Currency targetCurrencyObject = findCurrencyByName(targetCurrency);

            Double exchangeRate = sourceCurrencyObject.getExchangeValues().get(targetCurrency);
            Double result = Currency.convert(amount, exchangeRate);

            resultLabel.setText("Result: " + result + " " + targetCurrency);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        }
    }

    private Currency findCurrencyByName(String name) {
        for (Currency currency : currencies) {
            if (currency.getShortName().equals(name)) {
                return currency;
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        ArrayList<Currency> currencies = Currency.init();
        SwingUtilities.invokeLater(() -> new currencyConverter(currencies));
    }
}