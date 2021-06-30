/*
Q1) A string is called happy if it does not have any of the strings 'aaa', 'bbb' or 'ccc' as a substring.
Given three integers a, b and c, return any string s, which satisfies following conditions:
s is happy and longest possible.
s contains at most a occurrences of the letter 'a', at most b occurrences of the letter 'b' and at most c occurrences of the letter 'c'.
s will only contain 'a', 'b' and 'c' letters.
If there is no such string s return the empty string "".
*/



public class Practice1 {

	public static void main(String[] args) {
		Solution st=new Solution();
		System.out.println(st.longestDiverseString(1, 1, 7));//change values here and try

	}

}
class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int counta=0;int countb=0;int countc=0;
        String st="";
        int occ=a+b+c;
        for(int i=0;i<occ;i++)
        {
        	System.out.println(i);
            //find max count element and add that
              if((a>=b && a>=c && counta!=2) || (a>0 && (countb==2 || countc==2)))
              {
                  st=st+"a";
                  a--;
                  counta++;
                  countb=0;
                  countc=0;
                  System.out.println(st+" "+a+" "+b+" "+c+" "+counta+" "+countb+" "+countc);
              }
            else if((b>=c && b>=a && countb!=2) || (b>0 && (counta==2 || countc==2)))
              {
                  st=st+"b";
                  b--;
                  countb++;
                  counta=0;
                  countc=0;
                  System.out.println(st+" "+a+" "+b+" "+c+" "+counta+" "+countb+" "+countc);
            }
            else if((c>=b && c>=a && countc!=2) || (c>0 && (countb==2 || counta==2)))
              {
                  st=st+"c";
                  c--;
                  countc++;
                  countb=0;
                  counta=0;
                  System.out.println(st+" "+a+" "+b+" "+c+" "+counta+" "+countb+" "+countc);
            }
        }
        System.out.println("------------------final string below------------------");
        return st;
    }
}