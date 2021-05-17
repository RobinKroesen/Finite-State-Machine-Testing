package GeneriekeFSM;

public class Main {
    public static void main(String[] args) {
        //sets up nodes as seen on canvas
        Node s0 = new Node("s0");
        Node s1 = new Node("S1");
        Node s2 = new Node("S2");
        Node s3 = new Node("S3");

        //sets up routes as seen on canvas
        s0.addRoute('A', s2);
        s0.addRoute('B', s1);
        s1.addRoute('A', s1);
        s1.addRoute('B', s2);
        s2.addRoute('B', s3);
        s3.addRoute('A', s3);
        s3.addRoute('B', s0);


        machine formatief = new machine(s0);

        //runs machine with given path
        System.out.println(formatief.f("BAAB"));

        //nodes for self designed machine
        Node e0 = new Node("e0");
        Node e1 = new Node("e1");
        Node e2 = new Node("e2");

        //added routes for self designed machine
        e0.addRoute('A', e1);
        e1.addRoute('A', e2);
        e1.addRoute('B', e0);
        e1.addRoute('C', e1);
        e2.addRoute('A', e2);

        machine ownDesign = new machine(e0);

        System.out.println(ownDesign.f("ABAAAC"));



    }
}
