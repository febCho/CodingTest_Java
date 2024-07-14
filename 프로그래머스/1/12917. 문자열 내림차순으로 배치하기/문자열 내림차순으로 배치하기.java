import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] sArr = s.split("");
        
        Arrays.sort(sArr, Collections.reverseOrder());
        
        return String.join("", sArr);
    }
}