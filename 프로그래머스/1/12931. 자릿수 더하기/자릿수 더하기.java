public class Solution {
    public int solution(int n) {
        int answer = 0;
        String nStr = String.valueOf(n);

        for(int i=0; i<nStr.length(); i++){
            answer += Integer.parseInt(String.valueOf(nStr.charAt(i)));
        }

        return answer;
    }
}