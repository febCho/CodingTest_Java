class Solution {
    public String solution(String my_string, String letter) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=0; i<my_string.length(); i++){
            if(!String.valueOf(my_string.charAt(i)).equals(letter)) answer.append(String.valueOf(my_string.charAt(i)));
        }
        
        return String.valueOf(answer);
    }
}