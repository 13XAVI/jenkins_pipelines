import org.example.ConvertToUpper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToUpperTest {
    @Test
    public void testConvertToUpperCase(){
        String input = "hello";
        String expected = "Hello";
        String result = ConvertToUpper.Capitalize(input);
        assertEquals(expected,result);
    }
}
