import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] sides) {
        Set<Integer> counts = new HashSet<>();
        
        int Max = Math.max(sides[0], sides[1]);
        int Min = Math.min(sides[0], sides[1]);
        
        for(int i=Max - Min + 1; i<=Max; i++){
            counts.add(i);
        }
        
        for(int i=Max; i<Max + Min; i++){
            counts.add(i);
        }
        
        return counts.size();
    }
}