import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(reader.readLine());

        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(reader.readLine());

        System.out.print("Arithmetic Operator '+','-','*', '%', '/' : ");
        String operator = reader.readLine();

        if (operator.equals("+"))
        {
            double sum = num1 + num2;
            System.out.println("Sum: " + sum);
        }
        else if (operator.equals("-")) {
            double difference = num1 - num2;
            System.out.println("differnce: " + difference);
        }
        else if (operator.equals("*")) {
            double product = num1 * num2;
            System.out.println("product: " + product);
        }
        else if (operator.equals("%")) {
            double percentile = num1 % num2;
            System.out.println("percentile: " + percentile);
        }
        else if (operator.equals("/")) {
            double Division = num1 / num2;
            System.out.println("Division: " + Division);
        }

    }
}