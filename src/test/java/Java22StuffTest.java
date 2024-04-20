import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;

public class Java22StuffTest {

    static class Cat {
        // This is a stub class to allow the tests to compile.
    }

    @Test
    public void testMainMethod() {
        // Store original output stream
        PrintStream originalOut = System.out;

        // Prepare new output stream
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // Execution of main method
        Java22Stuff.main(new String[] {});

        // Revert back to original output stream
        System.setOut(originalOut);

        String[] outputLines = bos.toString().split("\\r\\n?|\\n");

        // Assert individual results
        Assert.assertEquals("Parmesan cheese is not a number", outputLines[0]);
        Assert.assertEquals(Collections.nCopies(3, "Yay cats!"), Arrays.asList(outputLines).subList(1, 4));
        Assert.assertEquals("Hello, my name is John! I am 35 years old.", outputLines[4]);
        Assert.assertEquals("""
                <html>
                  <head>
                    <title>My Web Page</title>
                  </head>
                  <body>
                    <p>Hello, world</p>
                  </body>
                </html>
                
                Meow!""",
                String.join("\n", Arrays.asList(outputLines).subList(5, outputLines.length)));
    }
}