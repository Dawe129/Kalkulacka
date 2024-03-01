import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop for the calculator program
        while (true) {
            System.out.println("===============================================================");
            System.out.println("Choose a mathematical operation:");
            System.out.println("1. Arithmetic expression");
            System.out.println("2. Logarithm");
            System.out.println("3. Sine");
            System.out.println("4. Cosine");
            System.out.println("5. Tangent");
            System.out.println("6. Square root");
            System.out.println("7. Exit");
            System.out.println("===============================================================");

            // Input for option selection
            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.println("===============================================================");

            // Program stop
            if (choice == 7) {
                System.out.println("End of program.");
                break;
            }

            // Examples
            System.out.println("1. Example: 2 + 3 * 4");
            System.out.println("2. Example: 2 log 8");
            System.out.println("3. Example: sin 90");
            System.out.println("4. Example: cos 45");
            System.out.println("5. Example: tan 30");
            System.out.println("6. Example: sqrt 9");
            System.out.println("");
            System.out.println("Enter the expression:");
            System.out.println("===============================================================");

            // Input for arithmetic expression
            String input = scanner.nextLine();

            System.out.println("===============================================================");

            try {
                double result = evaluateExpression(choice, input);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error evaluating the expression: " + e.getMessage());
            }
        }
        scanner.close();
    }

    // Selecting the appropriate operation based on the user's choice
    private static double evaluateExpression(int choice, String expression) {
        Operation operation;

        switch (choice) {
            case 1:
                operation = new ArithmeticOperation();
                break;
            case 2:
                operation = new LogOperation();
                break;
            case 3:
                operation = new TrigonometricOperation("sin");
                break;
            case 4:
                operation = new TrigonometricOperation("cos");
                break;
            case 5:
                operation = new TrigonometricOperation("tan");
                break;
            case 6:
                operation = new SqrtOperation();
                break;
            default:
                throw new IllegalArgumentException("Invalid operation choice.");
        }

        return operation.evaluate(expression);
    }
}