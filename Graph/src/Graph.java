import java.util.*;
public class Graph {
	ArrayList<ArrayList<Integer>> g;
	int vertexData;
	
	public Graph(int data) {
		vertexData=data;
		g=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<vertexData;i++) {
			g.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int source, int destination) {
		g.get(source).add(destination);
		g.get(destination).add(source);
	}
	
	public void display() {
		for(int i=0;i<vertexData;i++) {
			System.out.println("Node:"+i);
			for(int value:g.get(i)) {
				System.out.print("->"+value);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Graph obj=new Graph(5);
		obj.addEdge(0, 1);
		obj.addEdge(3, 2);
		obj.addEdge(2, 4);
		obj.addEdge(1, 4);
		obj.addEdge(3, 1);
		obj.addEdge(2, 0);
		obj.display();
	}
}
