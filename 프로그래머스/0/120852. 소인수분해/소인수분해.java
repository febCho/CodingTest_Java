import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> awsList = new ArrayList<>();
        
        for(int i=2; i<=n; i++){
            boolean chk = false;
            
            if(n % i == 0){
                
                for(int j=2; j<i; j++){
                    if(i % j == 0){
                        chk = true;
                        break;
                    }
                }
                
                if(chk == false) awsList.add(i);
            }
        }
        
        if(awsList.size() == 0) awsList.add(n);
        
        int[] answer = new int[awsList.size()];
        for(int i=0; i<awsList.size(); i++){
            answer[i] = awsList.get(i);
        }
        
        return answer;
    }
}