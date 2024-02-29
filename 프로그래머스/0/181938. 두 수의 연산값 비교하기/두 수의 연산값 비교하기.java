class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int abSum = Integer.parseInt(""+a+b);
        
        answer = (2*a*b) > abSum ? (2*a*b) : abSum;    
        return answer;
    }
}