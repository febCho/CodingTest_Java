import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuffer answer = new StringBuffer();
        
        String[] sArr = s.split("");
        Map<String,Integer> sMap = new HashMap<>();
        
        for(int i=0; i<sArr.length; i++){
            sMap.put(sArr[i], sMap.getOrDefault(sArr[i], 0) + 1);
        }
        
        for(Map.Entry<String, Integer> entry : sMap.entrySet()){
            if(entry.getValue() == 1){
                answer.append(entry.getKey());
            }
        }
        
        if(answer.toString().equals("")){
            return "";
            
        }else{
            char[] chars = answer.toString().toCharArray();
            Arrays.sort(chars);
            
            return new String(chars);
        }
    }
}
