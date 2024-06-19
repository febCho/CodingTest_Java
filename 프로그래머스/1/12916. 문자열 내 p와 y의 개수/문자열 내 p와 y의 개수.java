class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int pCnt = 0;
        int yCnt = 0;
        
        for(int i=0; i<s.length(); i++){
            String ele = String.valueOf(s.charAt(i));
            
            if(ele.equalsIgnoreCase("p")){
                ++pCnt;
            }else if(ele.equalsIgnoreCase("y")){
                ++yCnt;
            }
        }
        
        if(pCnt != yCnt) answer = false;
        
        return answer;
    }
}