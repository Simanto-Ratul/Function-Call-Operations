import java.util.Scanner;

public class PrintFactorial {
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid number. Please enter positive number.");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();

        System.out.print("Factorial number is : ");
        printFactorial(n);
    }
}
