import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> ansList = new ArrayList<>();
        
        for(int i=0;i<=n;i+=k){
            if(i!=0) ansList.add(i);
        }
        
        int[] answer = new int[ansList.size()];
        for(int i=0;i<ansList.size();i++){
            answer[i] = ansList.get(i);
        }
        
        return answer;
    }
}