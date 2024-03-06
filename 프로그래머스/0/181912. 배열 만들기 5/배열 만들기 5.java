import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> temp = new ArrayList<>();
        
        for(int i=0;i<intStrs.length;i++){
            int ele = Integer.parseInt(intStrs[i].substring(s,s+l));         
            if(k < ele){
                temp.add(ele);
            }
        }
               
        int[] answer = new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            answer[i] = temp.get(i);
        }
                                       
        return answer;
    }
}