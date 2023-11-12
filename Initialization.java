import java.util.*;

public class Initialization {

    public static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void main(String[] args) {

        int vertices = 3;

        // Use ArrayList<ArrayList<Edge>> for the graph
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<Edge>());
        }

        // Add edges
        graph.get(0).add(new Edge(0, 1, 40));
        graph.get(1).add(new Edge(1, 0, 40));

        // Iterate over the graph
        for (int i = 0; i < graph.size(); i++) {
            ArrayList<Edge> val = graph.get(i);

            for (int j = 0; j < val.size(); j++) {
                int src = val.get(j).src;
                int nbr = val.get(j).nbr;
                int wt = val.get(j).wt;

                System.out.println(src + " " + nbr + " " + wt);
            }
        }
    }
}
