package structure.graph;

public class DemoApp {

    public static void main(String[] args) {

        Graph<String> graph = new Graph<>();

        graph.addVertex("one");
        graph.addVertex("two");
        graph.addVertex("three");
        graph.addVertex("four");

        graph.addEdges("one", "two", true);
        graph.addEdges("one", "three", true);
        graph.addEdges("one", "four", true);

        graph.addEdges("four", "two", true);
        graph.addEdges("two", "three", true);
        graph.addEdges("three", "four", true);

        graph.removeEdges("one", "two", true);

        var vertices = graph.getVertices();

        System.out.println(vertices.get("one"));
        System.out.println(vertices.get("two"));
        System.out.println(vertices.get("three"));
        System.out.println(vertices.get("four"));

    }

}
