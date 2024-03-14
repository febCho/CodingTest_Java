import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>(Arrays.asList(my_string.split(" ")));;
        
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals("")){
                list.remove(i);
                i--;
            }
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}