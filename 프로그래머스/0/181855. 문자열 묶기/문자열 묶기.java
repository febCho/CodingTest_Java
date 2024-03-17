import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer, Integer> lenMap = new HashMap<>();
        
         for(String str : strArr) {
            int length = str.length();
            lenMap.put(length, lenMap.getOrDefault(length, 0) + 1);
        }
        
        for (int count : lenMap.values()) {
            answer = Math.max(answer, count);
        }
        
        return answer;
    }
}