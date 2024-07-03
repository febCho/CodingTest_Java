class Solution {
    public String solution(String[] seoul) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer.append("김서방은 ");
                answer.append(i);
                answer.append("에 있다");
            }
        }
        
        return answer.toString();
    }
}