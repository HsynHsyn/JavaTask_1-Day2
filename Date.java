package m02_variables_datatypes_concatenation;

import org.junit.jupiter.api.Test;
import testbase.TestBase;
import testbase.VariableInspector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
/*
1. Declare and initialize integer variables month, day, year.
2. Print each variable separately with value
3. Use concatenation and print variables in a "month/day/year" format

    month = 10
    day = 14
    year = 2023
    10/14/2023
 */
public class Date {
    public static void main(String[] args) {
        int month= 10, day= 14,year=2023;
        System.out.println("month = " + month);
        System.out.println("day = " + day);
        System.out.println("year = " + year);
        System.out.println(month+"/"+ day +"/"+ year);


    }
}

class DateTest extends TestBase {

    @Test
    public void testOutputPattern() {
        Date.main(null);
        String pattern = "(?i)month\\s*=\\s*\\d+\\s*\\nday\\s*=\\s*\\d+\\s*\\nyear\\s*=\\s*\\d+\\s*\\n\\d+/\\d+/\\d+\\s*\\n";
        assertTrue(matchesPattern(pattern), "The output did not match the expected pattern.");
    }

    @Test
    public void testVariables() {
        VariableInspector inspector = new VariableInspector("m02_variables_datatypes_concatenation.Date", "main");
        assertTrue(inspector.containsVariable("month", "int"), "int month variable is not declared");
        assertTrue(inspector.containsVariable("day", "int"), "int day variable is not declared");
        assertTrue(inspector.containsVariable("year", "int"), "int year variable is not declared");
    }
}