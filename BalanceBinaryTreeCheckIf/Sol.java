package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sol {
	
	public static void main(String args[]){
		
		int [] arr= {-1,-1,1};
		Set<Integer> set = new HashSet<>();
		
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] >0){
				set.add(arr[i]);
			}
		}
		if(set.size()==0){
			System.out.println(1);
			return;
		}
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		
		//boolean breakfound=false;
		for(int i=0;i<list.size()-1;i++){
			if(list.get(i+1)!=list.get(i)+1){
				System.out.println(list.get(i)+1) ;
				return;
			}
		}
		System.out.println(list.get(list.size()-1)+1);
		
	}
}
