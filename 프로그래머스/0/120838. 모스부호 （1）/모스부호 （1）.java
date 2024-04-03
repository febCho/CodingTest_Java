import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        StringBuffer answer = new StringBuffer();
        
        String[] morseCodes = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", 
            "-.--", "--.."
        };

        char[] letters = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
        
        Map<String,Character> letterMap = new HashMap<>();
        
        for(int i=0; i<letters.length; i++){
            letterMap.put(morseCodes[i], letters[i]);
        }
        
        String[] letterArr = letter.split(" ");
        
        for(int i=0; i<letterArr.length; i++){
            char let = letterMap.get(letterArr[i]);
            answer.append(let);
        }
    
        return answer.toString();
    }
}