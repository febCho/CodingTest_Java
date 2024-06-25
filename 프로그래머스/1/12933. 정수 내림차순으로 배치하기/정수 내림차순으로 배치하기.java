import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] nArr = String.valueOf(n).split("");
        Arrays.sort(nArr);
        
        StringBuffer sb = new StringBuffer();
        for(int i=nArr.length - 1; i>=0; i--){
            sb.append(nArr[i]);
        }
        
        return Long.parseLong(sb.toString());
    }
}