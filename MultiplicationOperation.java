import java.util.Scanner;

public class MultiplicationOperation {
    public static int CalculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        System.out.println("Multiplication is : " + CalculateProduct(a, b));
    }
}