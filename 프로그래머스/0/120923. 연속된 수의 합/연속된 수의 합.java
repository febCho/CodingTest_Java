class Solution {
    public int[] solution(int num, int total) {
        int startV = (total - (num * (num - 1)) / 2) / num;
        
        int[] answer = new int[num];
        for(int i=0; i<num; i++){
            answer[i] = startV + i;
        }
        
        return answer;
    }
}