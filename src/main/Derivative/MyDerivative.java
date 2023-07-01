package Derivative;

import java.util.Scanner;

public class MyDerivative {

    static Scanner scanner = new Scanner(System.in);

    static String result = "";

    // In this code,our variable is "X"

    public static String Solve(int n) {
        for (int i = n; i >= 0; i--) {
            int input = scanner.nextInt();
            String s1 = String.valueOf(i * input);
            String s2 = String.valueOf(i - 1);

            if (i > 0) {
                System.out.println("Enter the Coefficient of the x^" + (i - 1) + "'s index:");
                if (i != 0) {
                    result += s1 + "x^" + s2 + " + ";
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println("Enter the degree of your polynomial:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter the Coefficient of the x^" + n + "'s index:");
        System.out.println("f'(x) = " + Solve(n));

    }
}
