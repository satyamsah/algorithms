class Solution {
    public String longestPalindrome(String s) {
        Integer.MAX_VALUE

        char[] charStr=s.toCharArray();
        String pallindromString=Character.toString(s.charAt(0));
        for(int i=1;i<charStr.length;i++){
            int count=0;
            while(count<i){
                boolean isPallindrom=isPallindrom(s.substring(count,i+1));
                if(isPallindrom==true){
                    pallindromString=s.substring(count,i+1).length()> pallindromString.length()?s.substring(count,i+1):pallindromString;
                    break;
                    
                }else{
                    count++;
                }
            }
        }
        return pallindromString;
        
        
    }
    
    public boolean isPallindrom(String str){
        char [] strchararr= str.toCharArray();
        StringBuffer sb= new StringBuffer();
        for(int i=strchararr.length-1;i>=0;i--){
            sb.append(strchararr[i]);
        }
        if(sb.toString().equals(str)){
            return true;
        }
        else{
            return false;
        }
      /**  int length=strchararr.length;
        for(int i=0;i<strchararr.length/2;i++){
            char temp=strchararr[i];
            strchararr[i]=strchararr[l-i-1];
            strchararr[l-i-1]=temp;
        }
        
        **/
    }
}