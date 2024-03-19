import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        
        List<String> list = new ArrayList<>();
        for(int i=0;i<my_string.length();i++){
            for(int j=i;j<my_string.length()+1;j++){
                list.add(my_string.substring(i, j));
            }
        }
        
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(target)){
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}