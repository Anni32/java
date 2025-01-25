import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read length and width

        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        // Print result rounded to two decimal places
        double area = Math.round((length * width) * 100.0) / 100.0;
        String formatted = String.format("%.2f", area);
        System.out.println(formatted);
        scanner.close();
    }
}
