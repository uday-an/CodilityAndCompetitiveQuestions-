import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class StringIterationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String week[] = new String[7];
        week[0]= "Monday";
        week[1]= "Monday";
        week[2]= "Monday";*/
        
        
        String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Holiday","Holyday","LockDay","Sunday"};
        
        for(int i=0;i<days.length;i++) {
            System.out.println("Day : "+days[i]);
        }
        
        HashSet<String> weekSet = new HashSet<String>();
        weekSet.add("Monday");
        weekSet.add("Tuesday");
        weekSet.add("Wednesday");
        weekSet.add("Thursday");
        weekSet.add("Friday");
        weekSet.add("Friday");
        weekSet.add("Saturday");
        weekSet.add("Saturday");
        weekSet.add("Sunday");
        
        for (String weekDay : weekSet) {
            System.out.println("weekDay "+weekDay);
        }
        //Iterator
        
        Iterator<String> daysIter = weekSet.iterator();
        while(daysIter.hasNext()) {
            System.out.println("Day : "+daysIter.next());
        }
        System.out.println("---------------------");
        
//red+black tree
        
        HashMap<String,String> weekMap = new HashMap<String,String>();
        weekMap.put("mon","Monday");
        weekMap.put("tue","Tuesday");
        weekMap.put("wed","Wednesday");
        weekMap.put("thu","Thursday");
        weekMap.put("fri","Friday");
        weekMap.put("sat","Saturday");
        weekMap.put("sun","Sunday");
        weekMap.put("sun","SUNDAY");
        weekMap.put("Sun","SunDAY");
        weekMap.put(null,"Holiday");
        weekMap.put(null,"Holyday");
        weekMap.put("lock",null);
        weekMap.put("unLock",null);
        
        //get all the keys
        Set<String> dayKeysSet = weekMap.keySet();
        
        Queue<String> q=new PriorityQueue<String>();  
        //step thru the keys
        Iterator<String> dayKeys = dayKeysSet.iterator();
        
        
        while(dayKeys.hasNext()) {
            String key = dayKeys.next();//each key
            System.out.println("Day Key "+key);
            
            String dayValue = weekMap.get(key);//value as per the key
            System.out.println("Day : "+dayValue);
        }
        
        System.out.println("-----------------");
	}

}
