import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {

        //creates the scanner for user to input temperature
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Fahrenheit temperature: ");

        //reads the user input and assigns it to a variable
        double fahrenheit = scanner.nextDouble();

        //converts the temperature input to Celsius and rounds it to the nearest tenth place
        double celsius = (fahrenheit - 32) * 5 / 9;
        celsius = Math.round(celsius * 10.0) / 10.0;

        System.out.println("Your temperature in Celsius is: " + celsius);

    }
}
