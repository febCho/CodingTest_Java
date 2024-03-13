import java.util.*;

class Solution {
    public String solution(String myString) {
        List<String> list = Arrays.asList(myString.split(""));
        
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(String.valueOf('a'))){
                list.set(i, String.valueOf('A'));
            }else if(!list.get(i).equals(String.valueOf('A'))){
                list.set(i, list.get(i).toLowerCase());
            }
        }
        
        String answer = String.join("", list);
        return answer;
    }
}