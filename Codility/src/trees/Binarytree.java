package trees;

import java.util.LinkedList;
import java.util.Queue;

class Node
{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data=data;
		this.left=this.right=null;
	}
}

public class Binarytree {

	Node root;
	
	
	public Node insertBinarySearchTree(Node root, int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		
		if(data<root.data)
		{
			root.left=insertBinarySearchTree(root.left, data);
		}
		else if(data>root.data)
		{
			root.right=insertBinarySearchTree(root.right, data);
		}
		else
		{
			System.out.println("Can't enter same value");
			return root;
		}
		return root;
	}
	
	//This below method is insertion using level order traversal---> same as BFS
	public void insertLevelOrder(int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return;
		}
		
		Node temp=root;
		Queue<Node> order=new LinkedList<Node>();
		order.add(temp);
		
		while(!order.isEmpty())
		{
			temp=order.remove();
			
			if(temp.left==null)
			{
				temp.left=new Node(data);
				break;
			}
			order.add(temp.left);
			
			if(temp.right==null)
			{
				temp.right=new Node(data);
				break;
			}
			order.add(temp.right);
		}
	}
	
	
	public boolean search(Node root, int data)
	{
		if(root==null)
		{
			return false;
		}
		if(root.data==data)
		{
			return true;
		}
		boolean check=false;
		if(data<root.data)
			check=search(root.left,data);
		else
			check=search(root.right,data);
		
		return check;
	}
	
	public void levelOrderOrBFS(Node root)
	{
		if(root==null)
		{
			System.out.println("Empty tree");
			return;
		}
		Node temp=root;
		Queue<Node> order=new LinkedList<Node>();
		order.add(temp);
		
		
		//Queue perfectly maintains the left right order
		
		//Recursive also follows LIFO, hence used as stack-- for DFS
		
		while(!order.isEmpty())
		{
			temp=order.remove();
			System.out.print(temp.data+" : ");
			
			if(temp.left!=null)
			{
				order.add(temp.left);
			}
			if(temp.right!=null)
			{
				order.add(temp.right);
			}
		}
		System.out.println();
	}
	
	public void preOrder(Node root)//same as dfs
	{
		if(root!=null)
		{
			System.out.print(root.data+" : ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(root.data+" : ");
			inOrder(root.right);
		}
	}
	
	public void postOrder(Node root)
	{
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" : ");
		}
	}
	
	
	Node prev=null;
	
	public boolean isBST(Node root)
	{
		if(root!=null)
		{
			boolean b=isBST(root.left);
			if(b==false)
				return false;//terminating condition
			
			if(prev!=null && root.data<=prev.data)
				return false;
			prev=root;
			b=isBST(root.right);
			return b;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Binarytree bt=new Binarytree();
		bt.insertLevelOrder(10);
		bt.insertLevelOrder(5);
		bt.insertLevelOrder(30);
		bt.insertLevelOrder(2);
		bt.levelOrderOrBFS(bt.root);
		bt.preOrder(bt.root);
		System.out.println();
		bt.inOrder(bt.root);
		System.out.println();
		bt.postOrder(bt.root);
		System.out.println(bt.isBST(bt.root));
		System.out.println("\n------------------------------------");

		
		Binarytree bst=new Binarytree();
		bst.root=bst.insertBinarySearchTree(bst.root, 10);
		bst.root=bst.insertBinarySearchTree(bst.root, 20);
		bst.root=bst.insertBinarySearchTree(bst.root, 30);
		bst.root=bst.insertBinarySearchTree(bst.root, 5);
		bst.root=bst.insertBinarySearchTree(bst.root, 5);
		bt.levelOrderOrBFS(bst.root);
		System.out.println("5 present: "+ bst.search(bst.root, 5));
		bt.preOrder(bst.root);
		System.out.println();
		System.out.println("10 present: "+ bst.search(bst.root, 10));
		bt.inOrder(bst.root);
		System.out.println("\n20 present: "+ bst.search(bst.root, 20));
		System.out.println();
		System.out.println("56 present: "+ bst.search(bst.root, 56));
		bt.postOrder(bst.root);
		System.out.println("\n------------------------------------");
	}

}
