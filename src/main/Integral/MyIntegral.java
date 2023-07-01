package Integral;

import java.util.Scanner;

public class MyIntegral {

    static Scanner scanner = new Scanner(System.in);

    static String result = "";

    // In this code,our variable is "X"

    public static String Solve(int n) {
        for (int i = n; i >= 0; i--) {
            int input = scanner.nextInt();
            String s1, s2;
            if (i == 0) {
                s1 = String.valueOf(input);
            } else {
                if (input / i != 0) {
                    s1 = String.valueOf(input / i+1);
                } else {
                    s1 = "(" + input + "/" + i + ")";
                }
            }
            s2 = String.valueOf(i + 1);

            if (i >= 0) {
                System.out.println("Enter the Coefficient of the x^" + (i - 1) + "'s index:");
                result += s1 + "x^" + s2 + " + ";
            }
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println("Enter the degree of your polynomial:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter the Coefficient of the x^" + n + "'s index:");
        System.out.println("Integral f(x) dx = " + Solve(n) + "C");

    }
}
