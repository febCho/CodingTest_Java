import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stkList = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(stkList.isEmpty()){
                stkList.add(arr[i]);
            }else{
                if(stkList.get(stkList.size()-1) == arr[i]){
                    stkList.remove(stkList.size() - 1);
                }else{
                    stkList.add(arr[i]);
                }
            }
        }
        
        int[] stk = new int[stkList.size()];
        for(int i=0;i<stk.length;i++){
            stk[i] = stkList.get(i);
        }
        
        if(stk.length == 0) stk = new int[]{-1};
        
        return stk;
    }
}