import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddOrEven {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        System.out.print("enter number : ");
        double num = Double.parseDouble(reader.readLine());

        if (num % 2 == 0)
        {
            System.out.println("it is even number.");
        }
        else {
            System.out.println("it is odd number.");
        }
    }
}
