import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Map<Integer,Integer> numMap = new HashMap<>();
        
        for(int num : numlist){
            numMap.put(num, Math.abs(n - num));
        }
        
        List<Map.Entry<Integer,Integer>> entryList = new LinkedList<>(numMap.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                int dist1 = e1.getValue();
                int dist2 = e2.getValue();
                
                if (dist1 == dist2) return e2.getKey() - e1.getKey();
                return dist1 - dist2;
            }
        });
        
        int[] answer = new int[entryList.size()];
        for(int i=0; i<entryList.size(); i++){
            answer[i] = entryList.get(i).getKey();
        }
        
        return answer;
    }
}