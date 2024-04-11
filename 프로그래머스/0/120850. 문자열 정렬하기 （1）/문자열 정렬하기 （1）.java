import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(String my_string) {
        List<String> intList = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            if(!(my_string.charAt(i) >= 97 && my_string.charAt(i) <= 122)){
                intList.add(String.valueOf(my_string.charAt(i)));
            }
        }
        
        Collections.sort(intList);
        
        int[] answer = new int[intList.size()];
        for(int i=0; i<intList.size(); i++){
            answer[i] = Integer.parseInt(intList.get(i));
        }
        
        return answer;
    }
}