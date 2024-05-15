import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        List<String> tmp = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90){
                tmp.add(String.valueOf(my_string.charAt(i)).toLowerCase());
            }else{
                tmp.add(String.valueOf(my_string.charAt(i)));
            }
        }
        
        Collections.sort(tmp);
        
        StringBuilder sb = new StringBuilder();
        for(String s : tmp){
            sb.append(s);
        }
        
        return sb.toString();
    }
}