package BasicArrayofLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GraphExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> [] arrOfll= new LinkedList[10];
		LinkedList<Integer> [] ll = new LinkedList[10];
		ll[0]= new LinkedList<Integer>();
		
		ll[0].add(10);
//		ll[1].add(20);
//		ll[2].add(30);
		for( int i=0;i< 10;i++){
			arrOfll[i]= new LinkedList<>();
			if(i==0){
				
				arrOfll[i].add(133);
				arrOfll[i].add(334);
				arrOfll[i].add(345);
				
			}
			if(i==4){
				
				arrOfll[i].add(45);
				arrOfll[i].add(23);
				arrOfll[i].add(78);
				
			}
		}	
				for(int i=0;i<10;i++){
					System.out.println(ll[i]);
				}
		
	}
}
