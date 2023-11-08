import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    
    @Test
    public void testHelloWorldOutput() {
        // Redirect the standard output to capture it for testing
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        // Call the main method to execute the "Hello, World!" program
        HelloWorld.main(null);
        
        // Reset the standard output
        System.setOut(System.out);
        
        // Get the captured output
        String output = outputStream.toString().trim();
        
        // Check if the output matches the expected "Hello, World!"
        assertEquals("Hello, World!", output);
    }
}
