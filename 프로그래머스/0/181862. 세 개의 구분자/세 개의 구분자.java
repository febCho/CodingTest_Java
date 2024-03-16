import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> myStrList = Arrays.asList(myStr.split(""));
        Collections.replaceAll(myStrList, "a", "0");
        Collections.replaceAll(myStrList, "b", "0");
        Collections.replaceAll(myStrList, "c", "0");
        
        String newStr = String.join("", myStrList);
        String[] answer;
        
        if(newStr.contains("0")){
            answer = newStr.split("0");
            
            List<String> resultList = new ArrayList<>();
            for (String s : answer) {
                if (!s.isEmpty()) {
                    resultList.add(s);
                }
            }
            
            if (resultList.isEmpty()) {
                return new String[]{"EMPTY"};
            }
            
            answer = resultList.toArray(new String[resultList.size()]);
        } else {
            return new String[]{"EMPTY"};
        }
        
        return answer;
    }
}
