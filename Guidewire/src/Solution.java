// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
static class MyDate implements Comparable<MyDate> {
    int date, month, year;
    
    MyDate() {
      date = Integer.MAX_VALUE;
      month = Integer.MAX_VALUE;
      year = Integer.MAX_VALUE;
    }
    
    MyDate(String bigString) {
      String[] cols = bigString.split("\\.");
      date = Integer.parseInt(cols[0]);
      month = Integer.parseInt(cols[1]);
      year = Integer.parseInt(cols[2]);
    }
 
    public int compareTo(MyDate other) {
      if (year < other.year) {
        return -1;
      } else if (year > other.year) {
        return 1;
      } else {
        if (month < other.month) {
          return -1;
        } else if (month > other.month) {
          return 1;
        } else {
          if (date < other.date) {
            return -1;
          } else if (date > other.date) {
            return 1;
          } else {
            return 0;
          }
        }
      }
    }
    
    public String toString() {
      String dStr = (date < 10) ? "0" + date : "" + date;
      String mStr = (month < 10) ? "0" + month : "" + month;
      return String.format("%s.%s.%d", dStr, mStr, year);
    }
    
  }
  
  boolean isText(String name) {
    String ext = name.split("\\.")[1];
    return ext.toLowerCase().equals("txt") || ext.toLowerCase().equals("html") || ext.toLowerCase().equals("xml");
  }
  
  public String solution(String s) {
    final long MAX_SIZE = 81920;
    String lines[] = s.split("\\r?\\n");
    
    MyDate smallestDate = new MyDate();
    
    for (String line : lines) {
      line = line.trim();
      String[] cols = line.split(" ");
      long currSize = Long.parseLong(cols[0]);
      String dStr = cols[1];
      String name = cols[2];
      if (isText(name) && currSize < MAX_SIZE) {
        MyDate currDate = new MyDate(dStr);
        if (currDate.compareTo(smallestDate) == -1) {
          smallestDate = currDate;
        }
      }
    }
    return smallestDate.toString();
  }
}
