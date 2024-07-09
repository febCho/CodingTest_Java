class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length > 1){
            int min = Integer.MAX_VALUE;
            answer = new int[arr.length - 1];
            
            for(int a : arr){
                min = Math.min(min, a);
            }
            
            int idx = 0;
            for(int a : arr){
                if(a != min) {
                    answer[idx++] = a;
                }    
            }
        }else{
            answer = new int[] {-1};
        }
        
        return answer;
    }
}