package GeneriekeFSM;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void directionTest(){
        // creates nodes
        Node tn0 = new Node("tn0");
        Node tn1 = new Node("tn1");
        //create directions between nodes
        tn0.addRoute('A', tn1);
        tn0.addRoute('B', tn0);
        tn1.addRoute('A', tn0);

        //tests all directions by comparing expected direction and getDirection() method
        assertEquals("Tests if getDirection return correct direction", tn0.getDirection('A'), tn1);
        assertEquals("Tests if getDirection return correct direction", tn0.getDirection('B'), tn0);
        assertEquals("Tests if getDirection return correct direction", tn1.getDirection('A'), tn0);
    }

}