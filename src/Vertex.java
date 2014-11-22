package finalProject;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;

public class Vertex<V> {
	private static int ID=0;
	private V elem;
	private int weight;
	private int id;
	private LinkedList  pointers;
	
	public Vertex() {
		
		this(null, Integer.MAX_VALUE);
	}
	
	public Vertex(V elem, int distance){
		this.elem = elem;
		id=ID++;
		pointers = new LinkedList();
		this.weight = distance;
	}
	
	public int getId(){return id;}
	
	public V getElem(){return elem;}
	
	public void setElem(V elem){this.elem = elem;}
	
	public int getDistance(){return weight;}
	
	public void setDistance(int dist){weight = dist;}
	
	public void addEdge(Vertex<V> other){
		
		Edge<V> e = new Edge<V>(this, other);
		
		if(!pointers.contains(e)){
			pointers.add(e);
		}
		
		LinkedList conn = other.getEdges();
		
		if(!conn.contains(e)){
			conn.add(e);
		}
	}
	
	public void connectTo(Vertex<V> other, int distance){
		Edge<V> e = new Edge<V>(this, other, distance);
		if(!pointers.contains(e)){
			pointers.add(e);
		}
	}
	
	public LinkedList getEdges() {
		return pointers;
	}
	
	public void sortEdges() {
		Collections.sort(pointers);
	}
	
	public Iterator<Edge<V>> iterator() {
		return pointers.iterator(); 
	}
	
	public boolean equals(Vertex<V> other){
		if(other.pointers.size() != pointers.size())
			return false;
		
		LinkedList<Edge<V>> temp = new LinkedList(pointers);
		
		return elem.equals(other.getElem()) && temp.retainAll(other.pointers);
	}
	
	public String toString() {
		return this.elem.toString(); 
	}
}