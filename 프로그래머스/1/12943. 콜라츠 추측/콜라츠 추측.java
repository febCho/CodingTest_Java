class Solution {
    public int solution(int num) {
        int cnt = 0;
        
        while(num != 1 && cnt <= 500){
            ++cnt;
            
            if(num%2 == 0){
                num /= 2;
            }else if(num%2 == 1){
                num = (num * 3) + 1;
            }
        }
        
        return (num == 1) ? cnt : -1;
    }
}