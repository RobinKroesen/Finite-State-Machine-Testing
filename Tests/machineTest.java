package GeneriekeFSM;

import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class machineTest {

    @Test
    public void  testMachineOutput() {
        //creates test nodes
        Node tn0 = new Node("tn0");
        Node tn1 = new Node("tn1");
        Node tn2 = new Node("tn2");
        Node tn4 = new Node("tn4");

        //creates test routes
        tn0.addRoute('A', tn1);
        tn1.addRoute('A', tn2);
        tn1.addRoute('B', tn2);
        tn2.addRoute('C', tn2);
        tn2.addRoute('C', tn4);
        tn4.addRoute('B', tn1);

        //initializes test
        machine test1 = new machine(tn0);

        //creates arraylist with the expected outcome of the machine method
        ArrayList<String> expectedOutcome = new ArrayList<>();
        expectedOutcome.add("tn0");
        expectedOutcome.add("tn1");
        expectedOutcome.add("tn2");
        expectedOutcome.add("tn4");

        //test method outcome by comparing the f() method with the expected outcome.
        assertEquals("test with working path, test path should match expectedOutcome", test1.f("ABC"), expectedOutcome);

        //adds an extra direction to path, but the method should break and give same outcome.
        // This test will also print an error statement that provides context for the breaking of the method.
        assertEquals("test with breaking path, test path should break and return expectedOutcome while adding direction to test path", test1.f("ABCA"), expectedOutcome);

        }





    }
