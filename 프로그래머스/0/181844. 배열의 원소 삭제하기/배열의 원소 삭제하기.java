import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> arrList = new ArrayList<>();
        for(int a : arr){
            boolean isDel = false;
            for(int i=0;i<delete_list.length;i++){
                if(delete_list[i] == a) {
                    isDel = true;
                    break;
                }
            }
            
            if (!isDel) {
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
