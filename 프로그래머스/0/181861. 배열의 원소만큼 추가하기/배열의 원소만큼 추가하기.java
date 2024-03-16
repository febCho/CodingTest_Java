import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int a = arr[i];
            
            for(int j=0;j<=a - 1;j++){
                arrList.add(a);
            }
        }
        
        int[] answer = new int[arrList.size()];
        for(int i=0;i<arrList.size();i++){
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}