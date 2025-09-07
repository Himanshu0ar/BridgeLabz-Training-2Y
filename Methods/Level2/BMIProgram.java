import java.util.Scanner;   

class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;
            data[i][2] = weight / (heightM * heightM);
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 24.9) status[i] = "Normal weight";
            else if (bmi < 29.9) status[i] = "Overweight";
            else status[i] = "Obesity";
        }
        return status;
    }
}

public class BMIProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        BMICalculator.calculateBMI(data);
        String[] status = BMICalculator.getBMIStatus(data);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d: Weight = %.2f kg, Height = %.2f cm, BMI = %.2f, Status = %s%n",
                    i + 1, data[i][0], data[i][1], data[i][2], status[i]);
        }
    }
}

