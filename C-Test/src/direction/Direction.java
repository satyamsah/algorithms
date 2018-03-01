package direction;

import java.util.Scanner;

public class Direction {
	
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int[] coordiantes=new int [4];
		for( int i=0;i<4;i++){
			coordiantes[i]=sc.nextInt();
		}
		sc.close();
		int x1=coordiantes[0];
		int y1=coordiantes[1];
		int x2=coordiantes[2];
		int y2=coordiantes[3];
		
		
		if(x1==x2 && y1==y2 ){
			System.out.println("same position");
		}
		if(x1==x2){
			if(y2>y1){
				System.out.println("North");
			}
			if(y2<y1){
				System.out.println("South");
			}
	
		}
		
		if(y1==y2){
			if(x2>x1){
				System.out.println("East");
			}
			if(x2<x1){
				System.out.println("West");
			}
	
		}
		
		
		if(x2>x1){
			if(y2>y1){
				System.out.println("North-East");
			}
			if(y2<y1){
				System.out.println("South-East");
			}
	
		}
		
		if(x2<x1){
			if(y2>y1){
				System.out.println("North-West");
			}
			if(y2<y1){
				System.out.println("South-West");
			}
		}
		
		
	}
	
		
}

