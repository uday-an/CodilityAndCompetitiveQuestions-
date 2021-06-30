package linkedList;

import java.util.LinkedList;

public class ReverseLL {
	Node head; // head of list
	 
    /* Linked list Node*/
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    Node reverse(Node head, int k)
    {
        if(head == null)
          return null;
        Node current = head;
        Node next = null;
        Node prev = null;
 
        int count = 1;
 
        /* Reverse first k nodes of linked list */
        while (count <= k && current != null) {
        	
            next = current.next;
            //System.out.println("next");
            //printList(next);
           
            current.next = prev;
           // System.out.println("current");
           // printList(current);
            //printList(head);
            prev = current;
            //System.out.println("prev");
            //printList(prev);
            current = next;
            //System.out.println("current");
          //  printList(current);
            count++;
        }
 
        /* next is now a pointer to (k+1)th node
           Recursively call for the list starting from
           current. And make rest of the list as next of
           first node */
       if (next != null)
            head.next = reverse(next, k);
        //printList(prev);
        // prev is now head of input list
        return prev;
    }
 
    /* Utility functions */
 
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
       // Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
      //  new_node.next = head;
 
        /* 4. Move the head to point to new Node */
      //  head = new_node;
        
        if(head==null)
        {
        	head=new Node(new_data);
        }
        else
        {
        	Node dup=head;
        	while(dup.next!=null)
        	{
        		dup=dup.next;
        	}
        	dup.next=new Node(new_data);
        }
    }
 
    /* Function to print linked list */
    void printList(Node h)
    {
        Node temp = h;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		 ReverseLL llist = new ReverseLL();
		 
	        /* Constructed Linked List is 1->2->3->4->5->6->
	           7->8->8->9->null */
	        llist.push(9);
	        llist.push(8);
	        llist.push(7);
	        llist.push(6);
	        llist.push(5);
	        llist.push(4);
	        llist.push(3);
	        llist.push(2);
	       // llist.push(1);
	 
	        System.out.println("Given Linked List");
	        llist.printList(llist.head);
	 
	        llist.head = llist.reverse(llist.head, 3);
	 
	        System.out.println("Reversed list");
	        llist.printList(llist.head);
	        
	        LinkedList<Integer> lt=new LinkedList<>();
	        lt.add(9);
	        lt.add(8);
	        lt.add(7);
	        lt.add(6);
	        lt.add(5);
	        lt.add(4);
	        lt.add(3);
	        lt.add(2);
	        //lt.add(1);
	        int len=lt.size();
	        int loopSize=1;
	        System.out.println(lt);
	        int count=1;
	        LinkedList<Integer> dup=new LinkedList<>();
	        while(count <=3 && loopSize<=len)
	        {
	        	dup.push(lt.remove());
	        	
	        	loopSize++;
	        	if(count==3)
	        	{
	        		System.out.println(dup);
	        		lt.addAll(dup);
	        		count=0;
	        		dup.clear();
	        	}
	        	count++;
	        }
	        if(dup.isEmpty()==false)
	        {
	        	lt.addAll(dup);
	        	dup.clear();
	        }
	        System.out.println(lt);

	}

}
