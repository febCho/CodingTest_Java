import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> strList = new ArrayList<>(Arrays.asList(strArr));
        
        for(int i=0;i<strList.size();i++){
            if(strList.get(i).contains("ad")){
                strList.remove(i);
                i--;
            }
        }
        
        String[] answer = strList.toArray(new String[strList.size()]);
        return answer;
    }
}