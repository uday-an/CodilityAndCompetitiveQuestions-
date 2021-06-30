package lesson13.fibonacci;

public class FibFrog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 import java.util.ArrayList;
import java.util.Collections;
import java.awt.Point;
public class FibFrogTest {
    public static void main(String[] args) {
        
        FibFrog fFrog = new FibFrog();
        int river1[] = {0,0,0,1,1,0,1,0,0,0,0}; //3
        int river2[] = {}; //1
        int river3[] = {0,1,0}; //2
        int river4[] = {0,1,0,1,0}; //3
        int river5[] = {1,1,1,1,1};
        int river6[] = {0,0,0,1,1,0,1,0,0,0,0};
        int river7[] = {0,0,0,1,1,0,1,0,0,0,0};
        int river8[] = {0,0,0,1,1,0,1,0,0,0,0};
        
        int minJumps = fFrog.solution(river1);
        System.out.println("Min Jumps : "+minJumps);
    }
}

class FibFrog
{
    public int solution(int A[])
    {
        //lets find out fibbonacci
        ArrayList<Integer> fibonacciList = new ArrayList<Integer>();
        fibonacciList.add(0);
        fibonacciList .add(1);
        while(true)
        {
            int firstNum  = fibonacciList.get(fibonacciList.size()-1);
            int secondNum = fibonacciList.get(fibonacciList.size()-2);
            
            //verify if the length exceed the river length
            if(firstNum + secondNum > A.length) {
                //exit from here
                break;
            }
            fibonacciList.add(firstNum + secondNum);            
        }

    for (Integer integer : fibonacciList) {
            System.out.println("Integer :  "+integer);
        }
        System.out.println("size "+fibonacciList.size());
        System.out.println("---------");
        
        Collections.reverse(fibonacciList);
        
        for (Integer integer : fibonacciList) {
            System.out.println("Integer :  "+integer);
        }

    
        //class Frog { int jump, int position ; methods };
        ArrayList<Point> queue = new ArrayList(); // array can be traeted as Stack or Queue
        //-1 is the starting point and 0 is jump/ no steps
        queue.add(new Point(-1,0));
//                             | |
//                      position steps/jumps        
        
        //brain has two -- state of comfort   and dis=>comfort
        

int index=0;
        while(true) 
        {
            if(queue.size() == index ) {    return -1;        }
            
            Point current = queue.get(index);
            
            for(Integer n: fibonacciList )
            {
                    int nextPosition = current.x + n; // -1 + 8
                    
                    if(nextPosition == A.length) { // if u reach the other side 
                        return current.y + 1;
                    }
                    else 
                        if( (nextPosition > A.length) || (nextPosition < 0) || (A[nextPosition]==0) )
                        {
                            //should be ideal - cannot jump
                        }
                        else {
                            Point next = new Point(nextPosition, current.y + 1 );
                            queue.add(next);
                            A[nextPosition] = 0;// marking the points already visited
                        }
            }
            index++;
        }
    }
}
 
*/