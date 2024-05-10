class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] elements = String.valueOf(n).split("");
        
        for(String ele : elements){
            answer += Integer.parseInt(ele);
        }
        
        return answer;
    }
}