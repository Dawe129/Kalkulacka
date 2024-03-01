public class SqrtOperation extends Operation {

    @Override
    double evaluate(String expression) {

        // Split the expression into tokens (keyword "sqrt" and the number)
        String[] tokens = expression.split("\\s+");

        // Parse the number from the tokens
        double number = Double.parseDouble(tokens[1]);

        // Calculate the square root of the number
        return Math.sqrt(number);
    }
}
