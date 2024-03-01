
public class LogOperation extends Operation {

    @Override
    double evaluate(String expression) {

        // Split the expression into tokens (base, "log", and argument)
        String[] tokens = expression.split("\\s+");

        // Parse the base and argument from the tokens
        double base = Double.parseDouble(tokens[0]);
        double argument = Double.parseDouble(tokens[2]);

        // Calculate the logarithm using the change of base formula
        // log_b(a) = log_c(a) / log_c(b), where c is any positive base
        return Math.log(argument) / Math.log(base);
    }
}
