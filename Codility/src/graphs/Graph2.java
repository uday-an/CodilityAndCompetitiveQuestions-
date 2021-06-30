package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Graph2 {

	private int adj[][];
	private int nodesCount;
	private boolean visited[];
	Graph2(int nodesCount)
	{
		this.nodesCount=nodesCount;
		adj=new int[nodesCount][nodesCount];
		visited=new boolean[nodesCount];
	}
	
	void addEdge(int startNode, int endNode)
	{
		this.adj[startNode][endNode]=1;
		this.adj[endNode][startNode]=1;
	}
	void removeEdge(int startNode, int endNode)
	{
		this.adj[startNode][endNode]=0;
		this.adj[endNode][startNode]=0;
	}
	
	void bfs(int startNode)
	{
		boolean visited[]=new boolean[nodesCount];
		visited[startNode]=true;
		
		Queue<Integer> nextToVisit=new LinkedList<Integer>();
		nextToVisit.add(startNode);
		
		while(!nextToVisit.isEmpty())
		{
			int next=nextToVisit.poll();
			System.out.print(next+ " ");
			
			for(int i=0;i<nodesCount;i++)
			{
				if(visited[i]==false && this.adj[next][i]==1)
				{
					visited[i]=true;
					nextToVisit.add(i);
				}
			}
		}
	}

	void dfs(int startNode)
	{
		visited[startNode]=true;
		System.out.print(startNode+ " ");
		
		for(int i=0;i<nodesCount;i++)
		{
			if(visited[i]==false && this.adj[startNode][i]==1)
			{
				dfs(i);
			}
		}
	
	}
	public static void main(String[] args) {
		Graph2 gp=new Graph2(5);
		gp.addEdge(0, 1);
		gp.addEdge(0, 2);
		gp.addEdge(0, 3);
		gp.addEdge(0, 4);
		gp.addEdge(1, 2);
		gp.addEdge(1, 4);
		gp.bfs(1);
		System.out.println();
		gp.dfs(1);
		System.out.println();
		int arr[][]=new int[10][5];
		System.out.println(arr.length);
	}

}
