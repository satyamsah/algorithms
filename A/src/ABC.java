
public class ABC {
	String a;
	int b;
	
	@Override
	public String toString() {
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ABC a= new ABC();
			a.a="ahi";
			a.b=2;
			System.out.println(a.toString());
	}

}
