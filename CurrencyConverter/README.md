# Currency Converter

This is a simple Java class named `Currency` that represents a currency with conversion functionalities for a basic currency converter application.

## Class Structure

### Currency Class

- `Currency(String nameValue, String shortNameValue)`: Constructor to initialize the currency with a name and short name.
- `getName()`: Get the name of the currency.
- `setName(String name)`: Set the name of the currency.
- `getShortName()`: Get the short name of the currency.
- `setShortName(String shortName)`: Set the short name of the currency.
- `getExchangeValues()`: Get the exchange rates of the currency.
- `setExchangeValues(String key, Double value)`: Set the exchange rate for a given currency.
- `defaultValues()`: Set default exchange rates based on the selected currency.
- `init()`: Initialize a list of currencies with default values.
- `convert(Double amount, Double exchangeValue)`: Convert an amount from one currency to another.

## Usage

1. **Create Currency Objects:**
   - Instantiate `Currency` objects for different currencies.
   - Set the name, short name, and default exchange rates using the `defaultValues()` method.

2. **Initialize Currencies:**
   - Use the `init()` method to create a list of currencies with default values.

3. **Perform Currency Conversion:**
   - Use the `convert(Double amount, Double exchangeValue)` method to convert an amount from one currency to another.

## Example

```java
// Instantiate currencies
Currency usDollar = new Currency("US Dollar", "USD");
usDollar.defaultValues();

Currency euro = new Currency("Euro", "EUR");
euro.defaultValues();

// Initialize currencies
ArrayList<Currency> currencies = Currency.init();

// Convert an amount from US Dollar to Euro
Double amountInUSD = 100.0;
Double exchangeRate = usDollar.getExchangeValues().get("Euro");
Double amountInEuro = Currency.convert(amountInUSD, exchangeRate);
System.out.println("Amount in Euro: " + amountInEuro);
```

## Author

- Riya Khilari

## License

This project is licensed under the [MIT License](LICENSE).

Feel free to customize the README based on additional details or specific instructions you'd like to include.
