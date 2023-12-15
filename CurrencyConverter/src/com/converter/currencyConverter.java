package com.converter;

import javax.swing.*;
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

        sourceCurrencyComboBox = new JComboBox<>();
        targetCurrencyComboBox = new JComboBox<>();
        amountTextField = new JTextField();
        resultLabel = new JLabel("Result: ");
        convertButton = new JButton("Convert!!");

        // Populate currency options in the combo boxes
        for (Currency currency : currencies) {
            sourceCurrencyComboBox.addItem(currency.getShortName());
            targetCurrencyComboBox.addItem(currency.getShortName());
        }

        // Add action listener to the Convert button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCurrency();
            }
        });

        // Add components to the JFrame
        add(new JLabel("Source Currency:"));
        add(sourceCurrencyComboBox);
        add(new JLabel("Target Currency:"));
        add(targetCurrencyComboBox);
        add(new JLabel("Amount:"));
        add(amountTextField);
        add(convertButton);

        // Add space between Convert button and result
        add(Box.createVerticalStrut(10));

        add(resultLabel);

        setVisible(true);
    }

    private void convertCurrency() {
        try {
            // Get user input
            String sourceCurrency = sourceCurrencyComboBox.getSelectedItem().toString();
            String targetCurrency = targetCurrencyComboBox.getSelectedItem().toString();
            Double amount = Double.parseDouble(amountTextField.getText());

            // Find the corresponding Currency objects
            Currency sourceCurrencyObject = findCurrencyByName(sourceCurrency);
            Currency targetCurrencyObject = findCurrencyByName(targetCurrency);

            // Get the exchange rate from the source currency to the target currency
            Double exchangeRate = sourceCurrencyObject.getExchangeValues().get(targetCurrency);

            // Perform the conversion
            Double result = Currency.convert(amount, exchangeRate);

            // Display the result
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
        return null; // Currency not found
    }

    public static void main(String[] args) {
        ArrayList<Currency> currencies = Currency.init();
        SwingUtilities.invokeLater(() -> new currencyConverter(currencies));
    }
}