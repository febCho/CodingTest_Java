class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        int minVal = 0;
        int maxVal = 10000;
        
        boolean chk = (num1 >= minVal && num1 <= maxVal && num2 >= minVal && num2 <= maxVal);
        
        if(chk) answer = num1 == num2 ? 1 : -1;
        
        return answer;
    }
}