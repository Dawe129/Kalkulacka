public class TrigonometricOperation extends Operation {
    private String functionName;

    TrigonometricOperation(String functionName) {
        this.functionName = functionName;
    }

    @Override
    double evaluate(String expression) {

        // Split the expression into tokens (trigonometric function and angle)
        String[] tokens = expression.split("\\s+");

        // Convert the angle to radians
        double angle = Math.toRadians(Double.parseDouble(tokens[1]));

        // Evaluate the trigonometric function based on the specified function name
        switch (functionName) {
            case "sin":
                return Math.sin(angle);
            case "cos":
                return Math.cos(angle);
            case "tan":
                return Math.tan(angle);
            default:
                // Throw an exception for an invalid trigonometric function
                throw new IllegalArgumentException("Invalid trigonometric function.");
        }
    }
}
