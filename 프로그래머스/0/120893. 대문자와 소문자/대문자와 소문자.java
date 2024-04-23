class Solution {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            
            if(c >= 65 && c <= 90){
                answer.append(String.valueOf(c).toLowerCase());
            }else{
                answer.append(String.valueOf(c).toUpperCase());
            }
        }
        
        return answer.toString();
    }
}