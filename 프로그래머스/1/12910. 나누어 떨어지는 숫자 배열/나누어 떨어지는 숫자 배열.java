import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> div = new ArrayList<>();
        
        for(int a : arr){
            if(a%divisor == 0) div.add(a);
        }
        
        int[] answer = {};
        
        if(div.isEmpty()){
            answer = new int[] {-1};
        }else{
            Collections.sort(div);
            answer = new int[div.size()];
            
            for(int i=0; i<div.size(); i++){
                answer[i] = div.get(i);
            }
        }
        
        return answer;
    }
}