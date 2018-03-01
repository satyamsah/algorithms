package ctci;

import java.util.ArrayList;

import javax.management.ImmutableDescriptor;

public class SetOfStacks {
	
	ArrayList<ImplStack> stacks= new ArrayList<>();
	
	
	public boolean push(int a)
	{
		
		    ImplStack laststack= getLastStack();
		    if(laststack==null)
		    {
		    	ImplStack newstack =  new ImplStack();
		    	newstack.push(a);
		    	stacks.add(newstack);
		    	return true;
		    	
		    }
		    else
		    {
		    	if(laststack.size()==laststack.maxSize)
		    	{
		    		ImplStack stack= new ImplStack();
		    		stack.push(a);
		    		stacks.add(stack);
		    		return true;
		    	}
		    	else
		    	{
		    		laststack.push(a);
		    		return true;
		    	}
		    	
		    
		    }
		
			
		
	}
	public int pop()
	{
		ImplStack lastStack= getLastStack();
		if(lastStack==null)
		{
			return Integer.MIN_VALUE;
		}
		else
		{
			int abc=lastStack.pop();
			
			if(lastStack.size()==0){
				stacks.remove(stacks.size()-1);
				
			}
			return abc;
		}
		
	}
	public  ImplStack getLastStack()
	{
		
		if (stacks.size()==0)
		{
			return null;
		}
		else
		{
			
			ImplStack stack=stacks.get(stacks.size()-1);
			return stack;
		}
		
	}
	
	public static void main(String args[]){
		SetOfStacks stacks = new SetOfStacks();
		stacks.push(134);
		System.out.println(stacks.stacks.size());
		stacks.push(22);
		System.out.println(stacks.stacks.size());
		stacks.push(34);
		System.out.println(stacks.stacks.size());
		stacks.push(11);
		System.out.println(stacks.stacks.size());
		stacks.push(12);
		System.out.println(stacks.stacks.size());
		stacks.push(14);
		System.out.println(stacks.stacks.size());
		stacks.push(11);
		System.out.println(stacks.stacks.size());
		stacks.push(12);
		System.out.println(stacks.stacks.size());
		stacks.push(14);
		
		
		System.out.println("----");
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.stacks.size());
	}
	
	
	
	

}
