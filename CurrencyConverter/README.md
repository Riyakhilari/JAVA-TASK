# Currency Converter

A simple currency converter GUI application built in Java Swing.

## Overview

This Java application provides a graphical user interface for currency conversion. It allows users to select source and target currencies, enter an amount, and then converts the entered amount from the source currency to the target currency.

## Features

- **User-friendly Interface**: The application offers a simple and user-friendly interface with dropdowns for selecting source and target currencies.

- **Real-time Conversion**: Enter the amount you want to convert, and the application will instantly display the converted amount.

## How to Use

1. **Source Currency**: Choose the source currency from the dropdown list.

2. **Target Currency**: Select the target currency from the dropdown list.

3. **Enter Amount**: Input the amount you want to convert in the "Amount" field.

4. **Convert**: Click the "Convert!!" button to perform the currency conversion.

5. **View Result**: The converted amount will be displayed below the "Convert!!" button.

## Getting Started

To run the application, follow these steps:

1. **Compile**: Open a terminal or command prompt and navigate to the project directory. Compile the Java files using the following command:

    ```bash
    javac -d bin src/com/converter/Currency.java src/com/converter/currencyConverter.java
    ```

2. **Run**: Run the application using the following command:

    ```bash
    java -cp bin com.converter.currencyConverter
    ```

3. **Enjoy**: The Currency Converter GUI will appear, and you can start converting currencies.

## Requirements

- Java Development Kit (JDK)
- Swing library (Included in the Java Standard Library)

## Credits

- [OpenWeatherMap](https://openweathermap.org/) for providing the exchange rate data.

## Author

 Riya Khilari

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
