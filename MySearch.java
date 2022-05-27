import java.util.*;

public class MySearch <V>{
    protected int count;
    protected Set<V> marked;
    protected Map<V, V> edgeTo;
    protected final V source;

    public MySearch(String source){
        this.source= (V) source;
        marked=new HashSet<>();
        edgeTo=new HashMap<>();
    }
    public boolean hasPathTo(V v){return marked.contains(v);}
    public Iterable<V> pathTo(V v){
        if(!hasPathTo(v)) return null;
        LinkedList<V> ls=new LinkedList<>();
        for(V i=v;i!=source;i=edgeTo.get(i)){
            ls.push(i);
        }
        ls.push(source);
        return ls;
    }
    public int getCount(){return count;}
}
