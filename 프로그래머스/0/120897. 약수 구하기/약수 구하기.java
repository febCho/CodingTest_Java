import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> nList = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                nList.add(i);
            }
        }
        
        int[] answer = new int[nList.size()];
        for(int i=0; i<nList.size(); i++){
            answer[i] = nList.get(i);
        }
    
        return answer;
    }
}