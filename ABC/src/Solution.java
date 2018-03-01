import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  private static Date startDate, endDate;
  
  public static void main(String[] args) {
    DateFormat df = new SimpleDateFormat("yyyy-MM");
    PriorityQueue<String> output = new PriorityQueue<>(Collections.reverseOrder());
    try {
      HashMap<String, PriorityQueue<String>> input = readInput();
      for (String inputDate : input.keySet()) {
        PriorityQueue<String> pq = input.get(inputDate);
        Date currDate = df.parse(inputDate);
        if (currDate.after(startDate) && currDate.before(endDate)) {
          String outStr = inputDate + ", ";
            
         HashMap<String, Integer> val_inp = new LinkedHashMap<>();
            
            
             while (! pq.isEmpty()) {
              
             if(val_inp.containsKey(pq.poll().split(",")[0]))
                   
             {
                 
                 val_inp.put(pq.poll().split(",")[0], val_inp.get(pq.poll().split(",")[0])+Integer.parseInt(pq.poll().split(",")[1].trim()));
             }
             else
             {
                   val_inp.put(pq.poll().split(",")[0], Integer.parseInt(pq.poll().split(",")[1].trim()));
             }
                 
           }
            
            
           int i = 0;
          for (String itemKey : val_inp.keySet()) {
              if (i < val_inp.size() - 1){
              String int_val = itemKey + ", " + val_inp.get(itemKey);
              outStr += int_val;
              outStr += ", " ;
                  i += 1;
              }
              else{
              String int_val = itemKey + ", " + val_inp.get(itemKey);
              outStr += int_val; 
              }

           }
              
         /*   
         while (! pq.isEmpty()) {
            outStr += pq.poll();
            if (! pq.isEmpty()) {
              outStr += ", ";
            }
          }
          
          */
          output.add(outStr);
        }
      }
      while (! output.isEmpty()) {
        System.out.println(output.poll());
      }
      
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  private static HashMap<String, PriorityQueue<String>> readInput() throws ParseException {
    HashMap<String, PriorityQueue<String>> inputMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    String startAndEndDates = sc.nextLine();
    sc.nextLine();
    ArrayList<String> inputStrings = new ArrayList<>();
    while (sc.hasNextLine()) {
      inputStrings.add(sc.nextLine());
    }
    sc.close();
    String[] dates = startAndEndDates.split(",");
    DateFormat df = new SimpleDateFormat("yyyy-MM");
    startDate = df.parse(dates[0].trim());
    startDate.setMonth(startDate.getMonth() - 1);
    endDate = df.parse(dates[1].trim());
    endDate.setMonth(endDate.getMonth());

    // System.out.println("Start date -> " + startDate);
    // System.out.println("End date -> " + endDate);

    for (String t : inputStrings) {
      String tDate = t.substring(0, 7);
      if (! inputMap.containsKey(tDate)) {
        inputMap.put(tDate, new PriorityQueue<String>());
      }
      inputMap.get(tDate).add(t.substring(12));
    }
    return inputMap;
  }

}