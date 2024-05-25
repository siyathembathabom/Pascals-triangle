package siya;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class MainTest {

    @Test
    public void isNumberTest() {
        String a = "1";
        String b = "z";
        String c = "12";

        assertEquals(true, Main.isNumber(a));
        assertEquals(false, Main.isNumber(b));
        assertEquals(true, Main.isNumber(c));
    }

    @Test
    public void starsTest() {
        
        ByteArrayOutputStream printedStars = new ByteArrayOutputStream();
        System.setOut(new PrintStream(printedStars));

        Main.stars(5);
        assertEquals("*****", printedStars.toString());

        printedStars.reset();
        Main.stars(3);
        assertEquals("***", printedStars.toString());
    }

    @Test
    public void blankSpacesTest() {
        
        ByteArrayOutputStream printedBlankSpaces = new ByteArrayOutputStream();
        System.setOut(new PrintStream(printedBlankSpaces));

        Main.blankSpacesForTriangle(3);
        assertEquals("   ", printedBlankSpaces.toString());

        printedBlankSpaces.reset();
        Main.blankSpacesForTriangle(0);
        assertEquals("", printedBlankSpaces.toString());

        
        assertEquals(" ", Main.blankSpacesForPascals(0));
        assertEquals("       ", Main.blankSpacesForPascals(3));
    }


    @Test
    public void triangleShapeTest() {

        ByteArrayOutputStream printedTriangle = new ByteArrayOutputStream();
        System.setOut(new PrintStream(printedTriangle));

        Main.triangleShape(3);
        assertEquals("  *\n ***\n*****\n", printedTriangle.toString());

        printedTriangle.reset();
        Main.triangleShape(5);
        assertEquals("    *\n   ***\n  *****\n *******\n*********\n", printedTriangle.toString());
    }

    
    @Test
    public void pascalsTriangleTest() {

        ByteArrayOutputStream printedPascalsTriangle = new ByteArrayOutputStream();
        
        System.setOut(new PrintStream(printedPascalsTriangle));

        Main.pascalsTriangle(5);
        assertEquals("           1\n         1   1\n       1   2   1\n     1   3   3   1\n   1   4   6   4   1\n 1   5   10   10   5   1\n", printedPascalsTriangle.toString());
    }
}
