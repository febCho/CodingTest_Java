import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        String regExp = "^[0,5]+$";
        
        for(int i=l;i<=r;i++){
            String testI = i + "";
            if(testI.matches(regExp)){
                result.add(i);
            }
        }
        
        if(!result.isEmpty()){
            int[] answer = new int[result.size()];
            
            for(int i=0;i<result.size();i++){
                answer[i] = result.get(i);
            }
            return answer;
            
        }else{
            int[] answer = {-1};
            return answer;
        }
    }
}