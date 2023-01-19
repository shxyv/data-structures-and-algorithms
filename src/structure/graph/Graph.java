package structure.graph;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {

    private final Map<T, List<T>> vertices;

    public Graph() {
        this.vertices = new LinkedHashMap<>();
    }

    public void addVertex(T vertex) {
        vertices.putIfAbsent(vertex, new ArrayList<>());
    }

    public void removeVertex(T vertex) {

        vertices.values()
                .forEach(vertices1 -> vertices1.remove(vertex));

        vertices.remove(vertex);
    }

    public void addEdges(T mainVertex, T connectingVertex, boolean bidirectional) {

        vertices.putIfAbsent(mainVertex, new ArrayList<>());
        vertices.putIfAbsent(connectingVertex, new ArrayList<>());

        if (bidirectional) vertices.get(connectingVertex).add(mainVertex);
        vertices.get(mainVertex).add(connectingVertex);
    }

    public void removeEdges(T mainVertex, T connectingVertex, boolean bidirectional) {
        var mainEdges = vertices.get(mainVertex);
        if (bidirectional) {
            var connectionEdges = vertices.get(connectingVertex);
            connectionEdges.remove(mainVertex);
        }
        mainEdges.remove(connectingVertex);
    }

    public List<T> getEdges(T vertex) {
        return vertices.get(vertex);
    }

    public Map<T, List<T>> getVertices() {
        return vertices;
    }

}
