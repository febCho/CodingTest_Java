class Solution {
    public int solution(int n) {
        int cnt = 0;
        
        for(int i=1; i<=n; i++){
            int div = 0;
            
            for(int j=1; j*j<=i; j++){
                if(i % j == 0){
                    div++;
                    if(j != n/j) div++;
                }
            }
            
            if(div >= 3) cnt++;
        }
        
        return cnt;
    }
}