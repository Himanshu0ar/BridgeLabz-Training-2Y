import java.util.*;

public class MatrixAdvanced {
    public static int[][] createMatrix(int r,int c) {
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=(int)(Math.random()*10);
        return m;
    }

    public static int[][] transpose(int[][] m) {
        int[][] t=new int[m[0].length][m.length];
        for(int i=0;i<m.length;i++) for(int j=0;j<m[0].length;j++) t[j][i]=m[i][j];
        return t;
    }

    public static int determinant2x2(int[][] m) {
        return m[0][0]*m[1][1]-m[0][1]*m[1][0];
    }

    public static int determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(int[][] m) {
        double det=determinant2x2(m);
        return new double[][]{{m[1][1]/det,-m[0][1]/det},{-m[1][0]/det,m[0][0]/det}};
    }

    public static void display(int[][] m) {
        for(int[] row:m){for(int val:row)System.out.print(val+" ");System.out.println();}
    }

    public static void displayDouble(double[][] m) {
        for(double[] row:m){for(double val:row)System.out.print(val+" ");System.out.println();}
    }

    public static void main(String[] args) {
        int[][] m2=createMatrix(2,2), m3=createMatrix(3,3);
        System.out.println("2x2:"); display(m2);
        System.out.println("Det="+determinant2x2(m2));
        System.out.println("Inverse:"); displayDouble(inverse2x2(m2));
        System.out.println("3x3:"); display(m3);
        System.out.println("Det="+determinant3x3(m3));
        System.out.println("Transpose:"); display(transpose(m3));
    }
}
