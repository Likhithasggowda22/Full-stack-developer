import java.util.Scanner;

class Calculator {
    double a, b;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double calculate(String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) return a / b;
                else {
                    System.out.println("Error: Division by zero");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operation");
                return Double.NaN;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.next();
        Calculator calc = new Calculator(a, b);
        System.out.println("Result: " + calc.calculate(op));
        sc.close();
    }
}