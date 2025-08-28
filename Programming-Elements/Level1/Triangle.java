import java.util.*;
class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble(), h = sc.nextDouble();
        double areaInches = 0.5 * base * h;
        double areaCm = areaInches * 2.54 * 2.54;
        System.out.println(areaInches + " in², " + areaCm + " cm²");
        sc.close();
    }
}

