package main.path;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class node {
    private String name;

    private List<node> shortestPath = new LinkedList<>();

    private Integer distance = Integer.MAX_VALUE;

    Map<node, Integer> adjacentNodes = new HashMap<>();

    public void addDestination(node destination, int distance) {
        adjacentNodes.put(destination, distance);
    }

    public node(String name) {
        this.name = name;
    }
    
    public void setDistance(Integer i) {
        distance = i;
    }

    public Map<Object, Object> getAdjacentNodes() {
    }
}
