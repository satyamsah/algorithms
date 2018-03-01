package abc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileReaderImpl {
	
	
	
	public static void main(String args[]) throws IOException{
	
		 File file = new File("Hello1.txt"); 
		 
		 ArrayList<String> arrlines= new ArrayList<>();
		 FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			Map<String, Integer> map1 = new HashMap<>();
			while (( line= bufferedReader.readLine()) != null) {
				String[] lines=line.split(",");
				String ip=lines[lines.length-1];
				if(map1.containsKey(ip)){
					map1.put(ip, map1.get(ip)+1);
				}else{
					map1.put(ip, 1);
				}
			}
			List<List<Integer>> list = new ArrayList<>();
			//
			
			Map<Integer, ArrayList<String>> map2 = new HashMap<>();
		
			for(Map.Entry<String, Integer> entry: map1.entrySet() ){
				if(map2.containsKey(entry.getValue())){
					map2.get(entry.getValue()).add(entry.getKey());
				}
			}
	}

}
