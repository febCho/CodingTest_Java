import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        String[] list = myString.split("x");
        
        if(myString.endsWith("x")) {
            list = Arrays.copyOf(list, list.length + 1);
            list[list.length - 1] = "";
        }
        
        int[] answer = new int[list.length];
        
        for(int i=0;i<list.length;i++){
            answer[i] = list[i].length();
        }
        
        return answer;
    }
}