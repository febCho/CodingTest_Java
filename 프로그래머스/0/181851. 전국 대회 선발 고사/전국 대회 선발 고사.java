import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> rankMap = new HashMap<>();
        for(int i=0;i<rank.length;i++){
            if(attendance[i] == true) rankMap.put(rank[i], i); 
        }
        
        List<Integer> idxList = new ArrayList<>(rankMap.keySet());
        Collections.sort(idxList);
        
        int answer = (10000 * rankMap.get(idxList.get(0)))
                    + (100 * rankMap.get(idxList.get(1)))
                    + rankMap.get(idxList.get(2));
        
        return answer;
    }
}