package GeneriekeFSM;

import java.util.*;

public class Node {

    String name;
    private Map<Character, Node> route = new HashMap<>();

    public Node(String name) {
        this.name = name;
    }

    //method to add a route by combining a direction and a node
    public void addRoute(char direction, Node node){
        route.put(direction, node);
    }

    //return origin of direction between nodes
    public Node getDirection(char direction){
        return route.get(direction);
    }

    public java.lang.String getName() {
        return name;
    }


}
