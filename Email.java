package m02_variables_datatypes_concatenation;

import org.junit.jupiter.api.Test;
import testbase.TestBase;
import testbase.VariableInspector;

import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 1. Declare and Initialize String variables firstName,lastName,company
 2. Declare String variable email and assign value by using above variables, below format:
    firstName.lastName@company.com
 3. Print out email value. Example, lets say  John Smith works for Amazon:
    email = John.Smith@amazon.com
 */

public class Email {
    public static void main(String[] args) {
        String firstName= "John", lastName="Smith",company="amazon";
        //System.out.println(firstName + "." + lastName + "@" + company + ".com");
        String email = firstName + "." + lastName + "@" + company + ".com";
        System.out.println(email);


    }
}

class EmailTest extends TestBase {

    @Test
    public void testEmailPattern() {
        Email.main(null);
        assertTrue(matchesPattern("(?i)email\\s*=\\s*[a-z]+\\.[a-z]+@[a-z]+\\.com\\n"), "The email format is incorrect.");
    }

    @Test
    public void testVariables() {
        VariableInspector inspector = new VariableInspector("m02_variables_datatypes_concatenation.Email", "main");
        assertTrue(inspector.containsVariable("firstName", "String"), "String firstName variable is not declared");
        assertTrue(inspector.containsVariable("lastName", "String"), "String lastName variable is not declared");
        assertTrue(inspector.containsVariable("company", "String"), "String company variable is not declared");
        assertTrue(inspector.containsVariable("email", "String"), "String email variable is not declared");
    }
}