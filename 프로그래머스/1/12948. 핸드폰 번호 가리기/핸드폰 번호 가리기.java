class Solution {
    public String solution(String phone_number) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=phone_number.length() - 1; i>=0; i--){
            if(answer.toString().length() < 4){
                answer.append(phone_number.charAt(i));
            }else{
                answer.append("*");
            }
        }
        
        return answer.reverse().toString();
    }
}