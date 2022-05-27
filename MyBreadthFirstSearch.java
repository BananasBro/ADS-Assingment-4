/*import java.util.LinkedList;
import java.util.Queue;

public class MyBreadthFirstSearch extends MySearch<String> {
    public MyBreadthFirstSearch(MyWeightedGraph<String> graph, String almaty) {
        super();
    }
}
*/

import java.util.LinkedList;
import java.util.Queue;

public class MyBreadthFirstSearch <V> extends MySearch<V>{
    public MyBreadthFirstSearch(MyWeightedGraph<V> graph, V source){
        super((String) source);
        bfs(graph,source);
    }
    private void bfs(MyWeightedGraph<V> graph, V current){
        marked.add(current);
        Queue<V> queue=new LinkedList<>();
        queue.add(current);
        while (!queue.isEmpty()){
            V v = queue.remove();
            for(V vertex : graph.adjacencyList(v)){
                if(!marked.contains(vertex)){
                    marked.add(vertex);
                    edgeTo.put(vertex,v);
                    queue.add(vertex);
                }
            }
        }
    }
}