import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int op1 = a + b * c;     // Multiplication has higher precedence
        int op2 = a * b + c;
        int op3 = c + a / b;     // Division before addition
        int op4 = a % b + c;     // Modulus before addition

        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + ", " + op4);
    }
}

