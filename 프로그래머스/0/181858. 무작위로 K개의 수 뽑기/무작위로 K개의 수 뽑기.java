import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> ansList = new ArrayList<>();
        
        for (int i=0;i<arr.length;i++) {
            if(!ansList.contains(arr[i])) ansList.add(arr[i]);
            if(ansList.size() == k) break;
        }
        
        int[] answer = new int[k];
        for (int i=0;i<k;i++) {
            if(i < ansList.size()) {
                answer[i] = ansList.get(i);
            }else {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}
