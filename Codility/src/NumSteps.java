//Question--
/*Given a number s in their binary representation. Return the number of steps to reduce it to 1 under the following rules:

If the current number is even, you have to divide it by 2.

If the current number is odd, you have to add 1 to it.

It's guaranteed that you can always reach to one for all testcases.

 LOGIC--
 * Whole logic behind this one is the binary interpretation--
 * NOTE-- we could have converted the binary number into decimal and then would have easily performed the 
 * operations of +1 or divide by 2, but it would have killed the time limit on leet's website.
 * 
 * Every odd decimal number will have 1 on their one's(last) position in binary. E.g 13-- 110->1<- i.e. 1101
 * Similarly every even number has 0 in their last position in binary.
 * On adding 1 to an odd number, the end becomes 0.
 * On dividing even number by 2, last zero is removed. e.g. 14-- 1110 / 2 ---> 7-- 111  i.e. last zero removed
 * 
 * Same logic is used here--> start from the end, on encountering 0, increase the steps.
 * --> On encountering 1--> increase the steps and move backward until 0 is encountered along with increasing the
 * steps counter for each step, as on adding 1, all immediate 1's will also become 0 which will be removed because 
 * of division by 2.
 * 
 */



public class NumSteps {

	public static void main(String[] args) {
		System.out.println(numSteps("1101"));//Change your inputs accordingly in place of 1101
	}
	 public static int numSteps(String s) {
	     //10111
		 char ch[]=s.toCharArray();		 
		 int steps=0;//counting no of steps
		 for(int i=ch.length-1;i>0;i--)
		 {
			 if(ch[i]=='0')
			 {
				 steps++;
			 }
			 else
			 {
				 steps++;
				 while(ch[i]=='1' && i>0)
				 {
					 steps++;
					 i--;
				 }
				 if(ch[i]=='0') {
					 ch[i]='1';
					 i++;
				 }
				 if(i==0)
					 steps++;
			 }
		 }
		 
		 return steps;
	    }

}
