package model;

public class Edge {
    int src;
    int dest;
    int weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\n" + src + " --> " + dest + " == " + weight
                + "]";
    }
}
