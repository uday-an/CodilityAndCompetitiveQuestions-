package priority_queue.heap;

public class MaxHeap {

	private int heap[];
	private int maxSize;
	private int currentSize;
	
	public MaxHeap()
	{
		this(10);//if nothing is given, 10 be the default size
	}
	public MaxHeap(int maxSize) {
		super();
		this.maxSize = maxSize;
		heap=new int[maxSize];
		this.currentSize=0;
	}
	
	private void heapify(int indexToAdjust)
	{
		int largest=indexToAdjust;
		int left=(2*indexToAdjust)+1;
		int right=(2*indexToAdjust)+2;
		
		if(left<currentSize && heap[left]>heap[largest])
		{
			largest=left;
		}
		
		if(right<currentSize && heap[right]>heap[largest])
		{
			largest=right;
		}
		if(largest!=indexToAdjust)
		{
			swap(largest,indexToAdjust);
			heapify(largest);
		}
		
	}
	
	private void swap(int index1, int index2)
	{
		int temp=heap[index1];
		heap[index1]=heap[index2];
		heap[index2]=temp;
	}


	private boolean checkOverFlow()
	{
		if(currentSize==maxSize-1)
			return true;
		return false;
	}
	
	private boolean checkUnderFlow()
	{
		if(currentSize==0)
			return true;
		return false;
	}
	
	public void insert(int value)//O(log n)
	{
		if(checkOverFlow())
		{
			System.out.println("Size overflow");
			return;
		}
		heap[currentSize++]=value;
		int current=currentSize-1;
		int parent=(current-1)/2;
		
		while(heap[current]>heap[parent])
		{
			swap(current,parent);
			current=parent;
			parent=(current-1)/2;
		}
	}
	
	public int extractMaxAndPop()
	{
		if(checkUnderFlow())
		{
			System.out.println("Underflow");
			return -1;
		}
		int popped=heap[0];
		heap[0]=heap[--currentSize];
		heapify(0);
		return popped;
	}
	
	public void print()
    {
		if(checkUnderFlow())
		{
			System.out.println("Underflow");
			return;
		}
		int left, right;
        for (int i = 0; i <= currentSize/ 2; i++) {
        	left=2 * i + 1;
        	right=2 * i + 2;
        	if(left>=currentSize && right>=currentSize)
        		break;
        	System.out.print(" PARENT : " + heap[i]);
        	if(left<currentSize)
        	{
            System.out.print(" LEFT CHILD : " + heap[left]);
        	}
        	if(right<currentSize)
        	{
        		System.out.print(" RIGHT CHILD :" + heap[right]);
        	}
        	System.out.println();
        }
      /*  for(int i=0;i<currentSize;i++)
        {
        	System.out.println(heap[i]);
        }
        System.out.println(currentSize+" "+maxSize);*/
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        maxHeap.print();
        System.out.println("------------------------");
       
        System.out.println("The max val is "+ maxHeap.extractMaxAndPop());
        System.out.println("------------------------");
        maxHeap.print();
        
        System.out.println("------------------------");
        
        System.out.println("The max val is "+ maxHeap.extractMaxAndPop());
        System.out.println("------------------------");
        maxHeap.print();
        
        System.out.println("------------------------");
        
        System.out.println("The max val is "+ maxHeap.extractMaxAndPop());
        System.out.println("------------------------");
        maxHeap.print();
        System.out.println("-----------------");
        maxHeap.insert(19);
        
        System.out.println("The max val is "+ maxHeap.extractMaxAndPop());
        System.out.println("------------------------");
        maxHeap.print();
	}

}
