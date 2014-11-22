package finalProject;

	public class Edge<V> implements Comparable<Edge<V>>{
		
		private Vertex<V> one, two;
		private int distance;
		
		public Edge(Vertex<V> one, Vertex<V> two){
			this(one, two, 0);
		}
		
		public Edge(Vertex<V> one, Vertex<V> two, int distance)	{
			this.one = one;
			this.two = two;
			this.distance = distance;
		}
		
		public Vertex<V> getOne(){ return one;}
		
		public Vertex<V> getTwo(){ return two;}
		
		public int getDistance(){ return distance;}
		
		public void setDistance(int distance){this.distance = distance;}
		
		public boolean equals(Edge<V> other){
			return one.equals(other.getOne()) && 
					two.equals(other.getTwo()) && 
					distance == other.getDistance();
		}
		
		public String toString(){ return "(" + one.getElem() + ", " + two.getElem() + "): " + distance; }
		
		public int compareTo(Edge<V> other){
			return this.distance - other.distance;
		}
	}