import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int[] spellFreq = new int[26];
        for(String s : spell){
            spellFreq[s.charAt(0) - 'a']++;
        }
        
        for(String word : dic){
            int[] wordFreq = new int[26];
            for (char c : word.toCharArray()) {
                wordFreq[c - 'a']++;
            }
            
            if(Arrays.equals(spellFreq, wordFreq)){
                return 1;
            }
        }
        
        return 2;
    }
}
