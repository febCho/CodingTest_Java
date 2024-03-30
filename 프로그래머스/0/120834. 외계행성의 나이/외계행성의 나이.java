class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String ageStr = age + "";
        
        for(int i=0; i<ageStr.length(); i++){
            char alpha = (char)(ageStr.charAt(i) + 'a' - '0');
            answer.append(String.valueOf(alpha));
        }
        
        return answer.toString();
    }
}
