import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> temp = new ArrayList<>();
        int[] newArr = {};
        
        for(int[] interval : intervals){
            int a = interval[0];
            int b = interval[1];
            
            newArr = Arrays.copyOfRange(arr, a, b+1);
            
            for(int i=0;i<newArr.length;i++){
                temp.add(newArr[i]);
            }
        }
        
        int[] answer = new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}