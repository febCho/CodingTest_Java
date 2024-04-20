import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] array, int n) {
        int temp = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<array.length; i++){
            int diff = Math.abs(n - array[i]);
                        
            if(temp > diff){
                temp = diff;
                list.clear();
                list.add(array[i]);
            }else if(temp == diff){
                list.add(array[i]);
            }
        }
        
        int small = Integer.MAX_VALUE;
        for(int a : list){
            small = Math.min(small, a);
        }
        
        return small;
    }
}