package GeneriekeFSM;

import java.util.*;

public class machine {
    Node usedNode;
    ArrayList<String> listOfNodes = new ArrayList<>();

    //sets starting node as parameter.
    //Adds starting node to list of nodes.
    public machine(Node startingNode){
        this.usedNode = startingNode;
        this.listOfNodes.add(startingNode.getName());
    }

    //follows given written path and returns list of nodes that where used.
    public ArrayList<String> f(String path){
        //iterates through written path
        for (int i = 0; i < path.length(); i++){
            char direction = path.charAt(i);

            //sets nextnode as destination from used node
            Node nextNode = usedNode.getDirection(direction);

            //if there is no destination from given direction this part will break the loop, return current list of nodes and gives context to the breaking of the code.
            if(nextNode == null){
                System.out.println("Error, no path available from " + usedNode.getName() + " with the direction " + direction);
                break;
            }

            //used node becomes nextnode
            this.usedNode = nextNode;
            this.listOfNodes.add(usedNode.getName());
        }
        return listOfNodes;
    }
    }

