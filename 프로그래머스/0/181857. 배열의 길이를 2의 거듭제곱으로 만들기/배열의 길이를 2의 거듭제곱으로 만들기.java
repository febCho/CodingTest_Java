import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        
        int targetLength = 1;
        while(targetLength < length) {
            targetLength *= 2;
        }

        int[] result = Arrays.copyOf(arr, targetLength);
        for (int i=length; i<targetLength;i++) {
            result[i] = 0;
        }
        
        return result;
    }
}
