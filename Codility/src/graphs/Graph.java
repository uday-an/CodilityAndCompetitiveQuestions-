package graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	
	//All the 3 places marked below as 1, 2, 3, change them to ArrayList, it will also work

	private LinkedList<Integer> nodes[];//adjacency list implementation //ArrayList will also work 1
	private boolean visited[];
	
	Graph(int nodesCount)
	{
		this.nodes=new LinkedList[nodesCount];//ArrayList will also work 2
		this.visited=new boolean[nodesCount];//by default false
		for(int i=0;i<nodesCount;i++)
		{
			this.nodes[i]=new LinkedList<Integer>();//ArrayList will also work 3
		}
	}
	
	
	void addEdges(int src, int dest)
	{
		this.nodes[src].add(dest);
	}
	
	void dfs(int startingNode)
	{
		
		this.visited[startingNode]=true;
		System.out.print(startingNode+" ");
		
		Iterator<Integer> nextToVisit=this.nodes[startingNode].listIterator();
		while(nextToVisit.hasNext())
		{
			int next=nextToVisit.next();
			if(this.visited[next]==false)
			{
				dfs(next);
			}
		}
	}
	
	void dfsWithoutRecursion(int startingNode, int nodesCount)
	{
		
		boolean visited[]=new boolean[nodesCount];
		Stack<Integer> nextToVisit=new Stack<Integer>();
		nextToVisit.push(startingNode);
		//System.out.println(nextToVisit.peek());
		visited[startingNode]=true;
		while(!nextToVisit.isEmpty())
		{
			int next=nextToVisit.pop();
			System.out.print(next+" ");
			//visited[next]=true;
			Iterator<Integer> nextList=this.nodes[next].listIterator();
			while(nextList.hasNext())
			{
				int item=nextList.next();
				if(visited[item]==false)
				{
					visited[item]=true;
					nextToVisit.push(item);
				}
			}
			
		}
	}
	
	void bfs(int startingNode, int nodesCount) {
		boolean visited[]=new boolean[nodesCount];
		Queue<Integer> nextToVisit=new PriorityQueue<Integer>();
		
		nextToVisit.add(startingNode);
		visited[startingNode]=true;
		while(!nextToVisit.isEmpty())
		{
			int next=nextToVisit.poll();
			System.out.print(next+" ");

			Iterator<Integer> nextList=this.nodes[next].listIterator();
			while(nextList.hasNext())
			{
				int item=nextList.next();
				if(visited[item]==false)
				{
					visited[item]=true;
					nextToVisit.add(item);
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		Graph g=new Graph(5);
		g.addEdges(0, 1);
		g.addEdges(0, 2);
		g.addEdges(0, 3);
		//g.addEdges(1, 0);
		//g.addEdges(1, 2);
		g.addEdges(2, 1);
		//g.addEdges(2, 0);
		g.addEdges(2, 4);
		//g.addEdges(3, 0);
		//g.addEdges(4, 2);
		
		g.dfs(0);//remember after this function call, all visited[] elements become true. So reset it or use new one if
				// further need to used
		System.out.println();
		g.dfsWithoutRecursion(0,5);
		System.out.println();
		g.bfs(0, 5);
		
	}

}
