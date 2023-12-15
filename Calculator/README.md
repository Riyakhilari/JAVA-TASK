# Scientific Calculator

This is a simple Java Swing-based scientific calculator named "Scientific Calculator By Riya." The calculator provides basic arithmetic operations, trigonometric functions (sin, cos, tan), square root, logarithm, and parentheses functionality.

## Features

- **Basic Arithmetic Operations:** Addition, subtraction, multiplication, and division.
- **Trigonometric Functions:** Sine, cosine, and tangent calculations.
- **Square Root:** Calculate the square root of a number.
- **Logarithm:** Calculate the logarithm (base 10) of a number.
- **Parentheses:** Use parentheses for grouping expressions.
- **Clear Functionality:** Clear the calculator display.

## Usage

1. **Run the Application:**
   - Execute the `ScientificCalculator` class to launch the calculator.
   - The graphical user interface will appear, providing a set of buttons for various functions.

2. **Calculator Interface:**
   - The calculator UI consists of numeric buttons, operation buttons, and function buttons for trigonometric functions, square root, logarithm, and parentheses.
   - The display at the top shows the current input and results.

3. **Performing Calculations:**
   - Click numeric buttons to input numbers.
   - Use operation buttons for basic arithmetic operations.
   - Utilize trigonometric function buttons for sin, cos, and tan calculations.
   - Press the "=" button to evaluate the expression.

4. **Special Functions:**
   - The "sqrt" button calculates the square root.
   - The "sin," "cos," and "tan" buttons perform trigonometric calculations.
   - The "log" button calculates the logarithm.
   - Parentheses buttons "(" and ")" can be used to group expressions.

5. **Clear Functionality:**
   - Click the "C" button to clear the display and start a new calculation.

## Implementation Details

- The calculator is implemented in Java using the Swing library for the graphical user interface.
- The `ButtonClickListener` class handles button clicks and performs the corresponding actions.
- Mathematical expressions are parsed and evaluated using a custom parser in the `evaluate` method.

## Known Issues

- The calculator may display "Error" in case of invalid expressions or errors during evaluation.

## License

This calculator is provided under the MIT License. Feel free to use, modify, and distribute the code according to the terms of the license.

**Author:** Riya

Enjoy calculating with the Scientific Calculator!
