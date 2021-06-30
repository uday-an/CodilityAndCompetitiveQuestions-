
public class BugFixing1 {

	public static void main(String[] args) {
		//System.out.println(new BugFixing1().solution("apple"));
    	System.out.println(new BugFixing1().solution("dsdEffgerassda aeaeaea ffEEfff "));
    	
    	
    	//find out in which case the above code does not works properly

	}
	//return the character that occurs the most frequently in the given string
    //in case of more than one character satisfying the requirement, we need to
    //return the earliest character alphabetically
    String solution(String S) {
    	if(S.length()==0)
    		return "";
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
        	if(ch>='a' && ch<='z')
        		occurrences[ch - 'a']++;
        	if(ch>='A' && ch<='Z')
        		occurrences[ch - 'A']++;
        }
        char best_char = 'z';
        int best_res = occurrences[25];
        for (int i = 24; i >=0; i--) {
            if (occurrences[i] >= best_res) {
                best_char = (char) ((int) 'a' + i);
                best_res = occurrences[i];
            }
        }
 

        return Character.toString(best_char);
    }
    
}

