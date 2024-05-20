package siya;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class MainTest {

    @Test
    public void starsTest() {
        
        Main mainMethods = new Main(); 

        ByteArrayOutputStream printedStars = new ByteArrayOutputStream();
        PrintStream content = System.out;
        System.setOut(new PrintStream(printedStars));

        mainMethods.stars(5);
        assertEquals("*****", printedStars.toString());

        printedStars.reset();
        mainMethods.stars(3);
        assertEquals("***", printedStars.toString());
    }

    @Test
    public void blankSpacesTest() {
        
        Main mainMethods = new Main();

        ByteArrayOutputStream printedBlankSpaces = new ByteArrayOutputStream();
        PrintStream content = System.out;
        System.setOut(new PrintStream(printedBlankSpaces));

        mainMethods.blankSpaces(3);
        assertEquals("   ", printedBlankSpaces.toString());

        printedBlankSpaces.reset();
        mainMethods.blankSpaces(0);
        assertEquals("", printedBlankSpaces.toString());
    }


    @Test
    public void triangleShapeTest() {
        Main mainMethods = new Main();
        
        ByteArrayOutputStream printedTriangle = new ByteArrayOutputStream();
        PrintStream content = System.out;
        System.setOut(new PrintStream(printedTriangle));

        mainMethods.triangleShape(3);
        assertEquals("  *\n ***\n*****\n", printedTriangle.toString());

        printedTriangle.reset();
        mainMethods.triangleShape(5);
        assertEquals("    *\n   ***\n  *****\n *******\n*********\n", printedTriangle.toString());
    }
}
