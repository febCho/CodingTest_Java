import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int mode = 0;
        int maxCount = 0;
        boolean multiple = false;
        
        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            
            if (count > maxCount) {
                mode = num;
                maxCount = count;
                multiple = false;
                
            } else if (count == maxCount) {
                multiple = true;
            }
        }
        
        return multiple ? -1 : mode;
    }
}
