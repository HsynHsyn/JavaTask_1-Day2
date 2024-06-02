package m02_variables_datatypes_concatenation;

import org.junit.jupiter.api.Test;
import testbase.TestBase;
import testbase.VariableInspector;

import static org.junit.jupiter.api.Assertions.assertTrue;

/*
Declare and initialize String variables city1  , city2 and double oneWayFare
constant char variable DOLLAR and assign '$' unicode decimal value
By using above variable, concatenate values and print in below format:
From Chicago to San Fransisco one way cost is $643.5
 */

public class FlightTicket {
    public static void main(String[] args) {

        String city1,city2;
                city1="Chicago";
                city2="San Fransisco";
        double oneWayFare = 643.5;
        char    DOLLAR= '$';
        System.out.println("From " + city1 + " to " + city2 + " one way cost is " + DOLLAR +oneWayFare);

    }
}

class FlightTicketTest extends TestBase {

    @Test
    public void testOutputPatternMatch() {
        FlightTicket.main(null);
        String expectedPattern = "(?i)From\\s+\\w+\\s+to\\s+\\w+\\s+\\w+\\s+one\\s+way\\s+cost\\s+is\\s+\\$\\d+\\.\\d+\\n";
        assertTrue(matchesPattern(expectedPattern), "output format does not match expected format");
    }

    @Test
    public void testVariables() {
        VariableInspector inspector = new VariableInspector("m02_variables_datatypes_concatenation.FlightTicket", "main");
        assertTrue(inspector.containsVariable("city1", "String"), "String city1 variable is not declared");
        assertTrue(inspector.containsVariable("city2", "String"), "String city2 variable is not declared");
        assertTrue(inspector.containsVariable("oneWayFare", "double"), "double oneWayFare variable is not declared");
        assertTrue(inspector.containsVariable("DOLLAR", "char"), "char DOLLAR variable is not declared");
    }
}