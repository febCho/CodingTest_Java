class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuffer num = new StringBuffer();
        
        for(int i=0; i<my_string.length(); i++){
            Character c = my_string.charAt(i);
            
            if(Character.isDigit(c)){
                num.append(c);
            }else{
                
                if(num.length() != 0){
                    answer += Integer.parseInt(num.toString());
                    num.setLength(0);
                }
            }
        }
        
        answer += (num.length() != 0) ? Integer.parseInt(num.toString()) : 0;
        
        return answer;
    }
}