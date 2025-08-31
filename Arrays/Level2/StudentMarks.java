package Level2;
import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i+1) + ": ");
            marks[i][0] = sc.nextInt(); // physics
            marks[i][1] = sc.nextInt(); // chemistry
            marks[i][2] = sc.nextInt(); // maths

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'D';
        }

        System.out.println("\nStudent  Physics  Chemistry  Maths  %  Grade");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "         " + marks[i][0] + "        " + marks[i][1] + "        " + marks[i][2] + "   " + percentage[i] + "   " + grade[i]);
        }
    }
}

