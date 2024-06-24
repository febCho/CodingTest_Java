class Solution {
    public int[] solution(long n) {
        String nStr = String.valueOf(n);
        int[] answer = new int[nStr.length()];
        int idx = 0;
        
        for(int i=nStr.length() - 1; i>=0; i--){
            answer[idx++] = Integer.parseInt(String.valueOf(nStr.charAt(i)));
        }
        
        return answer;
    }
}