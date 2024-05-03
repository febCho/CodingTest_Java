class Solution {
    public int[] solution(int[] array) {
        int tmp = 0;
        int idx = 0;
        
        for(int i=0; i<array.length; i++){
            if(tmp < array[i]){
                tmp = array[i];
                idx = i;
            }
        }
        
        int[] answer = new int[] {tmp, idx};
        return answer;
    }
}