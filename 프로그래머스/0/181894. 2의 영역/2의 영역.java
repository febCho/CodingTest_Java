import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        int firstIdx = -1;
        int lastIdx = -1;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (firstIdx == -1) {
                    firstIdx = i;
                }
                lastIdx = i;
            }
        }

        if(firstIdx != -1 && lastIdx != -1) {
            for (int i = firstIdx; i <= lastIdx; i++) {
                list.add(arr[i]);
            }
        } else if (firstIdx != -1 && lastIdx == -1) {
            return new int[]{arr[firstIdx]};
        } else {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
