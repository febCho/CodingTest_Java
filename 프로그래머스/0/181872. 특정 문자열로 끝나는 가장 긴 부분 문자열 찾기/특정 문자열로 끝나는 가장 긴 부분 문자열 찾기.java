import java.util.ArrayList;

class Solution {
    public String solution( String myString, String pat ) {
        ArrayList<String> list = new ArrayList<>();
        String answer = "";
        
        for (int i=0;i<myString.length();i++) {
            list.add(myString.substring(0,i + 1));
        }
        
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i).endsWith(pat)){
                answer = list.get(i);
                if(pat.length() == 1) break;
            }
            
        }
        
        return answer;
    }
}