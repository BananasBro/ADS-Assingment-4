import java.util.HashMap;
import java.util.Map;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>,Double> adjacencyVertices;

    public Vertex(V data){
        this.data=data;
        adjacencyVertices=new HashMap<>();
    }
    public V getData(){return data;}
    public Map<Vertex<V>,Double> getAdjacencyVertices(){return adjacencyVertices;}

    public void addAdjacentVertex(Vertex<V> destination, double weight){
        adjacencyVertices.put(destination,weight);
    }

    public boolean containsAdjacentVertex(Vertex<V> vertex){
        return adjacencyVertices.containsKey(vertex);
    }

    public int size(){return adjacencyVertices.size();}
    @Override
    public boolean equals(Object o) {
        boolean result;
        if (this == o) {
            result = true;
        } else if (o == null || getClass() != o.getClass()) {
            result = false;
        } else {
            Vertex<?> vertex = (Vertex<?>) o;
            result = data.equals(vertex.data);
        }
        return result;
    }
}
