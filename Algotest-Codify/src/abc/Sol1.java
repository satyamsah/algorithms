package abc;

import java.util.HashSet;
import java.util.Set;

public class Sol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<Integer> set = new HashSet<>();
//		
//		
//			
//			for(int i=0;i<A.length;i++){
//				set.add(A[i]);
//				
//			}
//			int count=0;
//			while(set.size()<0){
//				int min=Integer.MAX_VALUE;
//				for( int elem: set){
//					if(elem<min){
//						min=elem;
//					}
//				}
//				set.remove(min);
//				for( int elem: set){
//					set.remove(elem);
//					set.add(elem-1);
//				}
//				count++;
//			}
		
		int [] A= {5,8};
		
		int count=0;
		while(true)
		{
			int min=Integer.MAX_VALUE;
			for(int i=0;i<A.length;i++){
				if(A[i]==0){
					continue;
				}
				if(A[i]<min){
					min=A[i];
					System.out.println(" check min" +min);
				}
			}
			if(min==Integer.MAX_VALUE){
				// 	System.out.println(count);
	    			if(count> 1000000000){
	    				System.out.println( -1 );
	    				return;
	    			}
	    			else{
	    				System.out.println(  count);
	    				return;
	    			}
				
			    }
			for(int i=0;i<A.length;i++){
				if(A[i]==0){
					continue;
				}else{
					A[i]=A[i]-min;
					System.out.println(" reduce val " +A[i]);
				}
			}
			count++;
		}
		
		
		
	}

}
