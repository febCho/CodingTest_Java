class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i=0; i<my_string.length(); i++){
            if(!(my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90) &&
               !(my_string.charAt(i) >= 97 && my_string.charAt(i) <= 122)){
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }
        
        return answer;
    }
}