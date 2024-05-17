class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        
        if(my_str.length() % n == 0){
            answer = new String[my_str.length() / n];
        }else{
            answer = new String[my_str.length() / n + 1];
        }
        
        StringBuffer sb = new StringBuffer();
        int idx = 0;
        
        for(int i=0; i<my_str.length(); i++){
            sb.append(my_str.charAt(i));
            
            if(sb.length() == n){
                answer[idx] = sb.toString();
                idx++;
                sb.setLength(0);
            }
        }
        
        if(!sb.toString().isEmpty()) answer[idx] = sb.toString();
        
        return answer;
    }
}