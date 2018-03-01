package date;

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
          while (! pq.isEmpty()) {
            outStr += pq.poll();
            if (! pq.isEmpty()) {
              outStr += ", ";
            }
          }
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
    String temp = sc.nextLine();
    while (temp != null && temp.length() > 1) {
      inputStrings.add(temp);
      temp = sc.nextLine();
    }
    sc.close();
    String[] dates = startAndEndDates.split(",");
    DateFormat df = new SimpleDateFormat("yyyy-MM");
    startDate = df.parse(dates[0].trim());
    startDate.setMonth(startDate.getMonth() - 1);
    endDate = df.parse(dates[1].trim());
    endDate.setMonth(endDate.getMonth() + 1);

    System.out.println("Start date -> " + startDate);
    System.out.println("End date -> " + endDate);

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