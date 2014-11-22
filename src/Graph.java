package finalProject;

import java.util.ArrayList;

public class Graph<V> {
	private ArrayList<Vertex<V>> vertices;
	
	public Graph() {
		vertices = new ArrayList<Vertex<V>>();
	}
	
	public boolean addVertex(Vertex<V> vertex){
		if(vertices.contains(vertex)){
			return false;
		}
		vertices.add(vertex);
		return true;
	}
	
	public boolean contains(Vertex<V> vertex){
		return vertices.contains(vertex);
	}
	
	public Vertex<V> get(int index){
		return vertices.get(index);
	}
	
	public int count() {
		return vertices.size();
	}
	
	public boolean equals(Graph<V> other){
		if(other.vertices.size() != vertices.size())
			return false;
		ArrayList<Vertex<V>> temp = new ArrayList<Vertex<V>>(other.vertices);
			return temp.retainAll(vertices);
	} 
}