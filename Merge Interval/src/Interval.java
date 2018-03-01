import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//* Definition for an interval.
  public class Interval{
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }

	

 }

class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> resultlist= new ArrayList<Interval>();
        Collections.sort(intervals,new Comparator<Interval>() {
        	public int compare(Interval i1, Interval i2){
        		if(i1.start>i2.start){
        			return i1.start-i2.start;
        		}
        		else{
        			return i2.start-i1.start;
        		}
        	}
		});
        
        for(int i=0;i<intervals.size()-1;i++){
            if(intervals.get(i).end>intervals.get(i+1).start){
            	resultlist.add(new Interval(intervals.get(i).start,intervals.get(i).start));   
            }else{
            	resultlist.add(intervals.get(i));
            }
        }
        
        return resultlist;
        
    }
}