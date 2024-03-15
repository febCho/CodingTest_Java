import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x");
        ArrayList<String> answerArr = new ArrayList<>();
        
        for (String str : splitArr) {
            if (!str.isEmpty()) {
                answerArr.add(str);
            }
        }
        
        String[] answer = answerArr.toArray(new String[answerArr.size()]);
        Arrays.sort(answer);
     
        return answer;
    }
}