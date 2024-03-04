import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length;){
            if(result.size() == 0){
                result.add(arr[i]);
                i++;
            }else if(result.size() != 0 && result.get(result.size() - 1) < arr[i]){
                result.add(arr[i]);
                i++;
            }else {
                result.remove(result.size() - 1);
            }
        }
        
        int[] stk = new int[result.size()];
        for(int i=0;i<result.size();i++){
            stk[i] = result.get(i);
        }
        
        return stk;
    }
}