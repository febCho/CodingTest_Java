class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int num = 0;
        
        if(s.length() == 4 || s.length() == 6) answer = true;
        
        try{
            num = Integer.parseInt(s);
        }catch(Exception e){
            answer = false;
        }
        
        return answer;
    }
}