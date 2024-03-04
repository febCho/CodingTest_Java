import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> result = new ArrayList<>();
        
        for(int i=start_num;i<=end_num;i++){
            result.add(i);
        }
        
        int[] answer = new int[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}