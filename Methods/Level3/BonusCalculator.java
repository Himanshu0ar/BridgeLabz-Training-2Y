import java.util.*;

public class BonusCalculator {
    public static int[][] generateData(int n) {
        int[][] data = new int[n][2];
        for (int i=0;i<n;i++) {
            data[i][0] = (int)(Math.random()*90000)+10000;
            data[i][1] = (int)(Math.random()*10)+1;
        }
        return data;
    }

    public static double[][] calculateNewSalary(int[][] data) {
        double[][] res = new double[data.length][2];
        for (int i=0;i<data.length;i++) {
            double bonus = data[i][1] > 5 ? 0.05*data[i][0] : 0.02*data[i][0];
            res[i][0] = data[i][0]+bonus;
            res[i][1] = bonus;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] data = generateData(n);
        double[][] res = calculateNewSalary(data);
        double sumOld=0,sumNew=0,sumBonus=0;
        System.out.println("Salary\tYears\tNewSalary\tBonus");
        for (int i=0;i<n;i++) {
            sumOld += data[i][0];
            sumNew += res[i][0];
            sumBonus += res[i][1];
            System.out.println(data[i][0]+"\t"+data[i][1]+"\t"+res[i][0]+"\t"+res[i][1]);
        }
        System.out.println("Total Old="+sumOld+" New="+sumNew+" Bonus="+sumBonus);
    }
}
