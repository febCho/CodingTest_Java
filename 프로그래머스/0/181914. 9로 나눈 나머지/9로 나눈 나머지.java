class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] numberArr = number.split("");
        
        for(int i=0;i<numberArr.length;i++){
            answer += Integer.parseInt(numberArr[i]);
        }
        
        return answer%9;
    }
}