package trees;

public class AVLUser {

	public static void main(String[] args) {
		AVLTree user=new AVLTree();
		user.insert(20);
		user.insert(25);
		user.insert(30);
		user.insert(10);
		user.insert(5);
		user.insert(15);
		user.insert(27);
		user.insert(19);
		user.insert(16);
		user.display();
	}

}

class AVLTree
{
	private class Node{
		int data;
		Node left,right;
		int height;
		
		Node(int item)
		{
			this.data=item;
			this.height=0;
		}
	}
	
	private Node node;
	
	private int height(Node node)
	{
		if(node==null)
		{
			return -1;
		}
		
		return node.height;
	}
	
	private int balancingFactor(Node node)
	{
		return height(node.left)-height(node.right);
	}
	
	public void insert(int item)
	{
		this.node=insert(this.node,item);
	}
	private Node insert(Node root, int item)
	{
		if(root==null)
		{
			return new Node(item);
		}
		
		if(item>root.data)
		{
			root.right=insert(root.right,item);
		}
		else if(item<root.data)
		{
			root.left=insert(root.left,item);
		}
		
		root.height=Math.max(height(root.left), height(root.right))+1;
		
		if(balancingFactor(root)>1 && item<root.left.data)//LL case
		{
			//right rotation condition
			root=rightRotation(root);
		}
		else if(balancingFactor(root)<-1 && item>root.right.data)//RR case
		{
			//left rotation condition
			root=leftRotation(root);
		}
		else if(balancingFactor(root)>1 && item>root.left.data)//LR case
		{
			//left rotn then right rotn
			root.left=leftRotation(root.left);
			root=rightRotation(root);
		}
		else if(balancingFactor(root)<-1 && item<root.right.data)//RL case
		{
			//right rotn tehn left rotn
			root.right=rightRotation(root.right);
			root=leftRotation(root);
		}
		return root;
	}
	
	private Node rightRotation(Node c)
	{
		Node b=c.left;
		Node t3=b.right;
		b.right=c;
		c.left=t3;
		
		c.height=Math.max(height(c.left), height(c.right))+1;
		b.height=Math.max(height(b.left), height(b.right))+1;
		
		return b;
	}
	private Node leftRotation(Node c)
	{
		Node b=c.right;
		Node t3=b.left;
		b.left=c;
		c.right=t3;
		
		c.height=Math.max(height(c.left), height(c.right))+1;
		b.height=Math.max(height(b.left), height(b.right))+1;
		
		return b;
	}
	
	public void display()
	{
		display(this.node);
	}
	private void display(Node root)
	{
		if(root==null)
			return;
		
		if(root.left==null)
			System.out.print("null <- ");
		else
			System.out.print(root.left.data+" <- ");
		
		System.out.print(root.data);
		
		if(root.right==null)
			System.out.print(" -> null");
		else
			System.out.print(" -> "+root.right.data);
		
		System.out.println();
		
		display(root.left);
		display(root.right);
	}
}