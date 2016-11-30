import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class Graph {

	private List<Node> nodes; // Noeuds
	private List<Edge> edges; // Les arcs
	
	public Graph() {
		// Create a empty graph
		nodes = new ArrayList<Node>();
		edges = new ArrayList<Edge>();
	}
	
	public List<Edge> getEdgesGoingFrom(Node source) {
		//Create empty list to store result
		List<Edge> edgeSource = new ArrayList<Edge>();
		
		//Look over all edges of our graph
		for (int i=0;i<edges.size();i++)
		{
			//Adding to our list if the source match
			if (edges.get(i).getSource()==source)
				edgeSource.add(edges.get(i));
		}
		return edgeSource;
	}
	
	
	public List<Edge> getEdgesGoingTo(Node dest)  {
		//Create empty list to store result
		List<Edge> edgeDest = new ArrayList<Edge>();
		
		//Look over all edges of our graph
		for (int i=0;i<edges.size();i++)
		{
			//Adding to our list if the source match
			if (edges.get(i).getDestination()==dest)
				edgeDest.add(edges.get(i));
		}
		return edgeDest;
	}
	
	// Accesseurs 
	public List<Node> getNodes() {
		return nodes;
	}
	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
	public List<Edge> getEdges() {
		return edges;
	}
	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
	
	public void addEdge(Edge e) {
		edges.add(e);
	}
	
	public void addNode(Node n) {
		nodes.add(n);
	}
	
	public String toString() {
		String s="Node List : ";
		for (int i=0;i<nodes.size();i++)
		{
			s+=nodes.get(i).getName();
		}
		s+="\nEdge List : ";
		for (int i=0;i<edges.size();i++)
		{
			s+="\nsrc : "+edges.get(i).getSource().getName();
			s+=", dest : "+edges.get(i).getDestination().getName();
			s+=", dist : "+edges.get(i).getDistance();
		}
		return s;
	}
	
	
	
}
