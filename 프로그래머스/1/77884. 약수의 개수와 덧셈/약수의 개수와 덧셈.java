class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int div = 0;
        
        for(int i=left; i<=right; i++){
            for(int j=1; j<=i; j++){
                if(i % j == 0) ++div;
            }
            
            if(div % 2 == 0){
                answer += i;
            }else if(div % 2 == 1){
                answer -= i;
            }
            
            div = 0;
        }
        
        return answer;
    }
}