class Solution {
    public String solution(String my_string, int num1, int num2) {
        String str1 = String.valueOf(my_string.charAt(num1));
        String str2 = String.valueOf(my_string.charAt(num2));
        
        StringBuffer answer = new StringBuffer();
        for(int i=0; i<my_string.length(); i++){
            if(i == num1){
                answer.append(str2);
                continue;
            }
            
            if(i == num2){
                answer.append(str1);
                continue;
            }
            
            answer.append(my_string.charAt(i));
        }
        
        return answer.toString();
    }
}