package main.path;




import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class graph {
    private Set<node> nodes = new HashSet<>();

    public void addNode(node nodeA) {
        nodes.add(nodeA);
    }

    public Set<node> getNode(){
        return nodes;
    }

    public static graph calculateShortestPathFromSource(graph g, node source) {
        source.setDistance(0);

        Set<node> settledNodes = new HashSet<>();
        Set<node> unsettledNodes = new HashSet<>();

        unsettledNodes.add(source);

        while (unsettledNodes.size() != 0) {
            node currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Map.Entry<node, Integer> adjacencyPair:
                    currentNode.getAdjacentNodes().entrySet()) {
                node adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!settledNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return graph;
    }

}
