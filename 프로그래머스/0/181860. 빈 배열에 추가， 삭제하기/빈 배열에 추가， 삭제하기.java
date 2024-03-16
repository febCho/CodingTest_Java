import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> arrList = new ArrayList<>();
        for(int i=0;i<flag.length;i++){
            if(flag[i] == true){
                int rep = arr[i] * 2;
                
                for(int j=0;j<rep;j++){
                    arrList.add(arr[i]);
                }
            }else{
                int rem = arr[i];
                
                for(int j=0;j<rem;j++){
                    arrList.remove(arrList.size()-1);
                }
            }
        }
        
        int[] answer = new int[arrList.size()];
        for(int i=0;i<arrList.size();i++){
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}