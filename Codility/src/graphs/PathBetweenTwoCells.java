package graphs;
import java.util.*;

//Best solution would be to apply BFS from start node and if find a 2 in path true else false

public class PathBetweenTwoCells {

	public static boolean isPathPresent(int arr[][],int s)
	{
		boolean visited[][]=new boolean[s][s];
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<s;j++)
			{
				if(arr[i][j]==1)
				{
					visited[i][j]=true;
					return isPath(arr,i,j,visited);
				}
			}
		}
		return false;
	}
	
	public static boolean isSafe(int i, int j,int arr[][], boolean visited[][])
	{
		if(i>=0 && i<arr.length && j>=0 && j<arr.length && visited[i][j]==false)
		{
			return true;
		}
			return false;
	}
	
	public static boolean isPath(int arr[][], int x, int y, boolean visited[][])
	{
		
		if(isSafe(x-1,y,arr,visited))
		{
			if(arr[x-1][y]==2)
				return true;
			else if(arr[x-1][y]==3)
			{
			visited[x-1][y]=true;
			boolean result=isPath(arr,x-1,y,visited);
			if(result==true)
				return true;
			}
		}
		if(isSafe(x,y-1,arr,visited))
		{
			if(arr[x][y-1]==2)
				return true;
			else if(arr[x][y-1]==3)
			{
			visited[x][y-1]=true;
			boolean result=isPath(arr,x,y-1,visited);
			if(result==true)
				return true;
			}
		}
		if(isSafe(x+1,y,arr,visited))
		{
			if(arr[x+1][y]==2)
				return true;
			else if(arr[x+1][y]==3)
			{
			visited[x+1][y]=true;
			boolean result=isPath(arr,x+1,y,visited);
			if(result==true)
				return true;
			}
		}
		if(isSafe(x,y+1,arr,visited))
		{
			if(arr[x][y+1]==2)
				return true;
			else if(arr[x][y+1]==3)
			{
			visited[x][y+1]=true;
			boolean result=isPath(arr,x,y+1,visited);
			if(result==true)
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int arr[][]= {{0,3,2,0},
				{3,0,3,3},
				{1,3,0,3},
				{0,3,3,3}};

		int size=arr.length;
		System.out.println(isPathPresent(arr, size));
		
		
	}

}
