package lesson05.prefixSum;

public class MushroomPicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//      0 1 2 3 4 5 6     
			int array[]= {2,3,7,5,1,3,9};
			//                          |    
			int k=4;
			int m=6;
			
			MushroomPicker mushPick = new MushroomPicker();
			int result = mushPick.solution(array, k, m);
			System.out.println("Result is "+result);
	}
	
	public static int calculateSum(int prefix[], int left, int right) {
        
        if(left==0) {
            return prefix[right];
        }
        
        return prefix[right]-prefix[left-1];
    }
	public static int solution(int a[], int k, int m) {
        int prefixArray[] = new int [ a.length ];
        prefixArray[0] = a[0];
        System.out.println("prefixArray[0]="+prefixArray[0]);
        
        for(int i=1; i<a.length; i++) {
            prefixArray[i] = prefixArray[i-1] + a[i];
            System.out.println("prefixArray["+i+"]="+prefixArray[i]+" + a["+i+"]"+a[i]);
        }
        int res=0;
        for(int i=0;i<=Math.min(m, k);i++)
        {
            int left =  k - i;
            int right = Math.min(a.length-1, Math.max(k, k + m - 2 *i));
            res = Math.max(res,calculateSum(prefixArray,left,right) );
            System.out.println("left ="+left + "right ="+right+" res="+res);
        }
        System.out.println("--------------");
        for(int i=0;i<=Math.min(m+1, a.length-k);i++) {
            int right = k + i;
            int left  = Math.max(0, Math.min(k-(m-2*i),k) );//max(0, min(k, k - (m - 2 * p)))
            res = Math.max(res, calculateSum(prefixArray,left,right));
            System.out.println("left ="+left + "right ="+right+" res="+res);
        }
        return res;
}
}
