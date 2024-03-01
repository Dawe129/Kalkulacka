public class ArithmeticOperation extends Operation {
    @Override
    double evaluate(String expression) {

        // Split the expression into tokens (numbers and operators)
        String[] tokens = expression.split("\\s+");

        // Initialize the result with the first number
        double result = Double.parseDouble(tokens[0]);

        // Process the expression in a loop, performing arithmetic operations
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double operand = Double.parseDouble(tokens[i + 1]);

            // Perform the corresponding arithmetic operation based on the operator
            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
                default:
                    // Throw an exception for an invalid arithmetic operator
                    throw new IllegalArgumentException("Invalid arithmetic operator.");
            }
        }

        // Return the final result of the arithmetic evaluation
        return result;
    }
}
