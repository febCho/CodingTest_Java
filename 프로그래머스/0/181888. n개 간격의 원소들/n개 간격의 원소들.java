import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> numArr = new ArrayList<>();
        
        for(int i=0;i<num_list.length;i+=n){
            numArr.add(num_list[i]);
        }
        
        int[] answer = new int[numArr.size()];
        for(int i=0;i<numArr.size();i++){
            answer[i] = numArr.get(i);
        }
        
        return answer;
    }
}