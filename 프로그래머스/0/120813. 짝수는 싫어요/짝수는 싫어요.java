import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n/2 + 1];
        
        int idx = 0;
        
        for(int i=1; i<=n; i+=2){
            answer[idx] = i;
            idx++;
        }
        
        if(n % 2 == 0) answer = Arrays.copyOf(answer, answer.length-1);
        
        return answer;
    }
}