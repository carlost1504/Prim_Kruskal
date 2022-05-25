package model;
import java.util.*;
public class weightComparator implements Comparator<Edge>{
    @Override
    public int compare(Edge e1, Edge e2) {
        return e1.weight - e2.weight;
    }
}
