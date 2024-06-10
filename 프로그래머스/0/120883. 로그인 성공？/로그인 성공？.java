class Solution {
    public String solution(String[] id_pw, String[][] db) {
        StringBuffer answer = new StringBuffer();
        
        for(String[] d : db){
            String d_id = d[0];
            String d_pw = d[1];
            String id = id_pw[0];
            String pw = id_pw[1];
            
            if(id.equals(d_id) && !pw.equals(d_pw)){
                answer.append("wrong pw");
                break;
            }else if(id.equals(d_id) && pw.equals(d_pw)){
                answer.append("login");
                break;
            }
        }
        
        if(answer.toString().isEmpty()) answer.append("fail");
        
        return answer.toString();
    }
}