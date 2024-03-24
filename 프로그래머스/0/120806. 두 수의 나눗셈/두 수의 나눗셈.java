class Solution {
    public int solution(int num1, int num2) {
        int answer = 1;
        int minVal = 0;
        int maxVal = 100;
        
        boolean chk = (num1 > minVal && num1 <= maxVal && num2 > minVal && num2 <= maxVal);
        
        if(chk){
            answer = (int)((double)num1/num2 * 1000);
        }
        
        return answer;
    }
}