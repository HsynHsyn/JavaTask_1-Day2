package m02_variables_datatypes_concatenation;

/*
Declare two int variables areaCode, localNumber and assign values: 3-digits for areaCode and 7-digits for localNumber,
combine them together and assign into a phoneNumber(String) variable in the following format:
  (areaCode)-localNumber
 Then print out like this example:
Calling number (303)-5552345
 */

import org.junit.jupiter.api.Test;
import testbase.TestBase;
import testbase.VariableInspector;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneNumber {
    public static void main(String[] args) {
        int areaCode=303;
        int localNumber=5552345;
        String phoneNumber = "(" + areaCode + ")-" + localNumber;

        System.out.println("Calling number " + phoneNumber);

    }

}

class PhoneNumberTest extends TestBase {

    @Test
    public void testOutput() {
        PhoneNumber.main(null);
        String pattern = "Calling number \\s*\\(\\s*(\\d{3})\\s*\\)\\s*-\\s*\\d{7}\\n";
        assertTrue(matchesPattern(pattern), "phone number needs to match this format: \"(areaCode)-localNumber\"");
    }


    @Test
    public void testVariables() {
        VariableInspector inspector = new VariableInspector("m02_variables_datatypes_concatenation.PhoneNumber", "main");
        assertTrue(inspector.containsVariable("areaCode", "int"), "int areaCode variable is not declared");
        assertTrue(inspector.containsVariable("localNumber", "int"), "int localNumber variable is not declared");
        assertTrue(inspector.containsVariable("phoneNumber", "String"), "String phoneNumber variable is not declared");
    }
}
