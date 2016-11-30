import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Graph g = new Graph();
		List<Node> nodes = new ArrayList<Node>();
		List<Edge> edges = new ArrayList<Edge>();
		
		// Exerice 1: A completer : création du graphe
		//Creating all nodes
		for(int i=0;i<7;i++)
		{
			char a=(char)('A'+i);
			String s = ""+a;
			Node n = new Node(i,s,1,1);
			nodes.add(n);
			//Adding all nodes
			//g.addNode(n);
		}	
		//Adding all nodes
		g.setNodes(nodes);
		
		//Creating all edges
		edges.add(new Edge(nodes.get(0),nodes.get(1),2));	//AB 2
		edges.add(new Edge(nodes.get(1),nodes.get(0),2));	//BA 2
		
		edges.add(new Edge(nodes.get(0),nodes.get(2),1));	//AC 1
		edges.add(new Edge(nodes.get(2),nodes.get(0),1));	//CA 1
		
		edges.add(new Edge(nodes.get(1),nodes.get(2),2));	//BC 2
		edges.add(new Edge(nodes.get(2),nodes.get(1),2));	//CB 2
		
		edges.add(new Edge(nodes.get(1),nodes.get(3),1));	//BD 1
		edges.add(new Edge(nodes.get(3),nodes.get(1),1));	//DB 1
		
		edges.add(new Edge(nodes.get(1),nodes.get(4),3));	//BE 3
		edges.add(new Edge(nodes.get(4),nodes.get(1),3));	//EB 3
		
		edges.add(new Edge(nodes.get(2),nodes.get(3),4));	//CD 4
		edges.add(new Edge(nodes.get(3),nodes.get(2),4));	//DC 4
		
		edges.add(new Edge(nodes.get(2),nodes.get(4),3));	//CE 3
		edges.add(new Edge(nodes.get(4),nodes.get(2),3));	//EC 3
		
		edges.add(new Edge(nodes.get(2),nodes.get(5),5));	//CF 5
		edges.add(new Edge(nodes.get(5),nodes.get(2),5));	//FC 5
		
		edges.add(new Edge(nodes.get(3),nodes.get(5),6));	//DF 6
		edges.add(new Edge(nodes.get(5),nodes.get(3),6));	//FD 6
		
		edges.add(new Edge(nodes.get(3),nodes.get(6),5));	//DG 5
		edges.add(new Edge(nodes.get(6),nodes.get(3),5));	//GD 5
	
		edges.add(new Edge(nodes.get(4),nodes.get(5),1));	//EF 1
		edges.add(new Edge(nodes.get(5),nodes.get(4),1));	//FE 1
		
		edges.add(new Edge(nodes.get(5),nodes.get(6),2));	//FG 2
		edges.add(new Edge(nodes.get(6),nodes.get(5),2));	//GF 2
				
		//Adding all Edges
		g.setEdges(edges);
		
		//Checking
		System.out.println(g.toString());
		
		// Exerice 2: A completer : création du graphe
		/*
		Dijkstra d = new Dijkstra(g);
		
		d.findPath(Params);
		
		d.afficherTable();

		// Exercice 3
		System.out.println(d.afficherCourtChemin(Params));
		*/
	}
}
