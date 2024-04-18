class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int sum = 0;
        
        for(int s : sides){
            max = Math.max(max, s);
            sum += s;
        }
        
        sum -= max;
        
        return max >= sum ? 2 : 1;
    }
}