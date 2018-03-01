package fromroot;

public class Test {
 
	static void change(int[] a){
		int tmp=a[0];
		a[0]=a[1];
		a[1]=tmp;
		return;
	}
 public static void main(String str[]) {
	 int[] a={10,20,30};
	 change(a);
	 for(int i:a){
		 System.out.println(i);
	 }
}
 
}
