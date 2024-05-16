class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i=0; i<array.length; i++){
            String ele = String.valueOf(array[i]);
            
            for(int j=0; j<ele.length(); j++){
                if(String.valueOf(ele.charAt(j)).equals("7")) answer++;
            }
        }
        
        return answer;
    }
}