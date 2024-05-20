package siya;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main( String[] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        triangleShape(number);
    }

    public static void stars(int number) {
        
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void blankSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void triangleShape(int height) {

        for (int i = 1; i < height + 1; i++) {
            blankSpaces(height - i);
            stars((2 * i) - 1);
            System.out.println("");
        }
    }

    // public static void pascalsTriangle(int height) {
        
    //     for (int i = 1; i < height + 1; i++) {
    //         for (int i = 1; i < height; i++) {
    //         }
    //     }
    // }

    public static void legalIteration(ArrayList<Integer> number) {
        // Come back here.
        if (number.isEmpty()){
            System.out.println("Empty list");
            return;
        }
    }
}
