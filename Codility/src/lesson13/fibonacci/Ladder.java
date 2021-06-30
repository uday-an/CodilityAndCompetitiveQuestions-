package lesson13.fibonacci;


public class Ladder {

	public static void main(String[] args) {
		int a[]= {4,4,5,5,1};
		int b[]= {3,2,4,3,1};
		int ans[]=solution(a,b);
		for(int x:ans)
			System.out.println(x);
		System.out.println("-------------");
		System.out.println(5<<3);
		System.out.println(12>>2);

	}
	public static int[] solution(int[] a, int[] b) {
		int len=0;
		if(a.length>2)
			len=a.length;
		else len=2;
		int[] fb = new int[len];
        fb[0] = 1;
        fb[1] = 2;
        
        /*
         * X % 2^b=Y;  Y % 2^t=Z where t<=b, then directly X % 2^t=Z only
      e.g  150 % 2^5=22;  22 % 2^3=6,(3<5) then also 150 % 2^3=6 only
         */
        
        for (int i = 2; i < a.length; i++) {
           
            fb[i] = (fb[i - 1] + fb[i - 2]) % (1 << 30);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = fb[a[i] - 1] % (1 << b[i]);
        }
        return a;
	}
}
