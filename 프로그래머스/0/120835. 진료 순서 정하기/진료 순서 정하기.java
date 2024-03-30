import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] temp = Arrays.copyOf(emergency, emergency.length);
        
        Arrays.sort(temp);
        
        int rank = 1;
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        
        for(int i = temp.length - 1; i >= 0; i--){
            rankMap.put(temp[i], rank++);
        }

        for(int i = 0; i < emergency.length; i++) {
            answer[i] = rankMap.get(emergency[i]);
        }
        
        return answer;
    }
}
