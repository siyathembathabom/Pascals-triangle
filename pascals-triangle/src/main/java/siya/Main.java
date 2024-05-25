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

        scanner.close();
    }

    /*
     * A method to verify if the input from the user is a number.
     * If it is a number then it returns true.
     * If it is not a number then false is returned.
     */
    public static boolean isNumber(String userInput) {

        // try/catch block to try change a string input by the user to an int type.
        // and catch a NumberFormatException if it cannot become an int.
        try {
            Integer.parseInt(userInput);
            return true;
        } catch (NumberFormatException e) {
            System.out.print("Invalid input. Please enter a number: ");
            return false;
        }   
    }

    /*
     * A method that is called stars and prints asterisks
     * the building blocks for the triangle.
     * Has an integer (int data-type) as a parameter.
     */ 
    public static void stars(int number) {
        
        // a for loop that loops a given number of times and prints out an asterisk each time.
        // on the same line.
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    /*
     * Prints blank spaces that will allow for the shape of the triangle
     * when used.
     * Has an integer as a parameter.
     */ 
    public static void blankSpacesForTriangle(int number) {
        // a for loop to print the blank spaces.
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    /*
     * Prints a triangle shape of a given height.
     * Has an integer as a parameter.
     */
    public static void triangleShape(int height) {

        // for loop to create the triangle.
        for (int i = 1; i < height + 1; i++) {
            // method for blank spaces is used here.
            blankSpacesForTriangle(height - i);
            // method for stars/asterisks is used here.
            stars((2 * i) - 1);
            System.out.println("");
        }
    }

    /*
     * Pascal's triangle is printed using this method.
     * Has an integer as a parameter.
     */
    public static void pascalsTriangle(int n) {
        
        int a = 1;
        int b = n;

        for (int i = 0; i < n + 1; i++) {
            // blank spaces method is used here.
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
                
                // factorial method is used here.
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

    /*
     * Method for the blank spaces for Pascal's triangle.
     * Works similarly as the method for star/asterisk triangle.
     * Has an integer as a 
     * Returns a string.
     */
    public static String blankSpacesForPascals(int n) {
        
        // initializing string variable blank and setting it as empty.
        String blank = "";

        // for loop for concatenating a blank space with the string variable blank.
        // the loop is executed for n * 2 times.
        for (int i = 0; i < n * 2 + 1; i++) {
            blank += " ";
        }
        return blank;
    }

    /*
     * Method for finding the factorial.
     * This is a recursive method.
     */
    public static int factorial(int n) {
        // base case.
        if (n == 0) {
            return 1;
        }
        // recursion.
        return (n * factorial(n - 1));
    }
}
