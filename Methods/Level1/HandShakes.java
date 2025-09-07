import java.util.Scanner;
public class HandShakes {
    public static int findhandshakes(int n) {
        int handshakes = (n * (n - 1)) / 2;
        return handshakes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int people = sc.nextInt();

        int totalHandshakes = findhandshakes(people);
        System.out.println("Total handshakes possible: " + totalHandshakes);

        sc.close();
    }
}
