package siya;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        triangleShape(number);
        pascalsTriangle(number);
    }

    public static void stars(int number) {
        
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void blankSpacesOne(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void triangleShape(int height) {

        for (int i = 1; i < height + 1; i++) {
            blankSpacesOne(height - i);
            stars((2 * i) - 1);
            System.out.println("");
        }
    }

    public static void pascalsTriangle(int n) {
        
        int a = 1;
        int b = n;

        for (int i = 0; i < n + 1; i++) {
            System.out.print(blankSpacesTwo(b + 1));
            if (i == 0) {
                System.out.println(1);
                b -= 1;
                continue;
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(1 + "   ");
                }
                a = factorial(i) / (factorial(j) * factorial(i - j));
                System.out.print(a + "   ");
            }
            System.out.println("");
            b -= 1;
        }
    }

    public static String blankSpacesTwo(int n) {
        String blank = "";
        for (int i = 0; i < n * 2 - 1; i++) {
            blank += " ";
        }
        return blank;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return (n * factorial(n - 1));
    }
}
