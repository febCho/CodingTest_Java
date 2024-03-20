import java.util.Arrays;

class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        int Str1 = Integer.parseInt(Arrays.toString(date1).replaceAll("\\[|]", "").replaceAll(", ", ""));
        int Str2 = Integer.parseInt(Arrays.toString(date2).replaceAll("\\[|]", "").replaceAll(", ", ""));
        
        if(Str1 < Str2) answer = 1;
        
        return answer;
    }
}