class Solution {
    public String solution(String rsp) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=0; i<rsp.length(); i++){
            int choice = Integer.parseInt(String.valueOf(rsp.charAt(i)));
            
            if(choice - 0 == 2){
                answer.append("0");
            }else if(choice - 5 == -5){
                answer.append("5");
            }else if(choice - 2 == 3){
                answer.append("2");
            }
        }
        
        return answer.toString();
    }
}