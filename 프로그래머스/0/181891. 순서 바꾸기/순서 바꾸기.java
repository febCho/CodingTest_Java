import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] afterN = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] untilN = Arrays.copyOfRange(num_list, 0, n);

        int[] answer = new int[afterN.length + untilN.length];
        int index = 0;
        
        for (int i = 0; i < afterN.length; i++) {
            answer[index++] = afterN[i];
        }
        for (int i = 0; i < untilN.length; i++) {
            answer[index++] = untilN[i];
        }
        
        return answer;
    }
}