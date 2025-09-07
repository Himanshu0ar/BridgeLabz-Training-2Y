import java.util.Scanner;

public class BMIProgram {
    
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0;
            double bmi = weight / (height * height);
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal";
            } else if (bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(data[i][0]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void displayBMI(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", data[i][0], data[i][1], data[i][2], data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight in kg for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height in cm for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        String[][] bmiData = calculateBMI(data);
        displayBMI(bmiData);
        sc.close();
    }
}
