

public class Tries {

	static TrieNode root;
	static class TrieNode{
		TrieNode[] children= new TrieNode[26];
		boolean isEndOfWord;
		
		public TrieNode(){
			isEndOfWord=false;
			for(int i=0;i<26;i++){
				children[i]=null;
			}
		}
	}
	
	
	static void insert(String word){
		int level;
		int length=word.length();
		int index=0;
		TrieNode curr=root;
		for(level=0;level<length;level++){
			index=word.charAt(level)-'a';
			if(curr.children[index]==null){
				curr.children[index]=new TrieNode();
				curr=curr.children[index];
			}else{
				curr=curr.children[index];
			}
			
		}
		curr.isEndOfWord=true;

	}
	static boolean search(String word){
		int level;
		int length=word.length();
		int index=0;
		TrieNode curr=root;
		for(level=0;level<length;level++){//2->t
			index=word.charAt(level)-'a';
			if(curr.children[index]==null){
				return false;
			}else{
				curr=curr.children[index];//
			}
			
		}
		if(curr!=null && curr.isEndOfWord==true){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String []args){
		Tries tries= new Tries();
		root = new TrieNode();
		String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};
		for (int i = 0; i < keys.length ; i++)
	            insert(keys[i]);
		
		if(search("ther")){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	
	
	

}