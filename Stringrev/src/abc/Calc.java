package abc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Calc {


		@Override
		public <T> T[] toArray(T[] arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<Integer> subList(int arg0, int arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Integer set(int arg0, Integer arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean retainAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean removeAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public Integer remove(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean remove(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public ListIterator<Integer> listIterator(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ListIterator<Integer> listIterator() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int lastIndexOf(Object arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Iterator<Integer> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public int indexOf(Object arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Integer get(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean containsAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean contains(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean addAll(int arg0, Collection<? extends Integer> arg1) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean addAll(Collection<? extends Integer> arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void add(int arg0, Integer arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean add(Integer arg0) {
			// TODO Auto-generated method stub
			return false;
		}
	};
	Maths Maths = new Maths();

    double answer = 0;
    double inputA, inputB;
    char operator;
    boolean done = false;

     while (done == false) {
        System.out.print("Please enter your sum: ");

        inputA = input.nextDouble();
        operator = input.next().charAt(0);
        inputB = input.nextDouble();        

        switch (operator) {
            case '+': answer = Maths.add(inputA, inputB);
                      break;
            case '-': answer = Maths.subtract(inputA, inputB);
                      break;
            case '*': answer = Maths.multiply(inputA, inputB);
                      break;
            case '/': answer = Maths.divide(inputA, inputB);
                      break;
            case '^': answer = Maths.power(inputA, inputB);
                      break;
        }

            System.out.println(answer);             
    }       

    input.close();

  }

}
}
