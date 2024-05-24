package siya;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        
        // for receiving user input.
        Scanner scanner = new Scanner(System.in);

        // a clear message to prompt the user to enter their desired value
        System.out.print("Enter a number: ");

        boolean statement = false;
        String number = "";
        
        while (!statement) {
            number = scanner.nextLine();
            statement = isNumber(number);
        }
        
        //  a method that prints a triangle shape, a basis of inspiration for pascals triangle.
        triangleShape(Integer.valueOf(number));
        // a method that prints Pascal's triangle.
        pascalsTriangle(Integer.valueOf(number));
    }

    public static boolean isNumber(String userInput) {
        try {
            Integer.parseInt(userInput);
            return true;
        } catch (Exception e) {
            System.out.print("Invalid input. Please enter a number: ");
            return false;
        }
    }

    /*
     * A method that is called stars and prints asterisks
     * the building blocks for the triangle.
     * Takes in an integer (int data-type) as a parameter.
     */
    public static void stars(int number) {
        
        // a for loop that loops a given number of times and prints out an asterisk each time.
        // on the same line.
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }


    public static void blankSpacesForTriangle(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void triangleShape(int height) {

        for (int i = 1; i < height + 1; i++) {
            blankSpacesForTriangle(height - i);
            stars((2 * i) - 1);
            System.out.println("");
        }
    }

    public static void pascalsTriangle(int n) {
        
        int a = 1;
        int b = n;

        for (int i = 0; i < n + 1; i++) {
            System.out.print(blankSpacesForPascals(b));
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
                if (j < i){
                    System.out.print(a + "   ");
                } else {
                    System.out.print(a);
                }
                
            }
            System.out.println("");
            b -= 1;
        }
    }

    public static String blankSpacesForPascals(int n) {
        String blank = "";
        for (int i = 0; i < n * 2 + 1; i++) {
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
