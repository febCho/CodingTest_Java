import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> multiList = new ArrayList<>();
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0) multiList.add(numlist[i]);
        }
        
        int[] multiArr = new int[multiList.size()];
        for(int i=0; i<multiArr.length; i++){
            multiArr[i] = multiList.get(i);
        }
        
        return multiArr;
    }
}