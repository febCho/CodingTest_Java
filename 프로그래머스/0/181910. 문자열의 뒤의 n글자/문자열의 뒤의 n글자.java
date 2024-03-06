class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int i=my_string.length()-1;i>=0;i--){
            if(answer.length() != n){
                answer += my_string.charAt(i);
            }
        }
        
        StringBuffer sb = new StringBuffer(answer);
        String reversedAns = sb.reverse().toString();
        
        return reversedAns;
    }
}