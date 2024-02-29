class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sab = String.valueOf(a) + String.valueOf(b);
        String sba = String.valueOf(b) + String.valueOf(a);
        
        int iab = Integer.parseInt(sab);
        int iba = Integer.parseInt(sba);
        
        if(iab >= iba){
            answer = iab;
        }else{
            answer = iba;
        }
        
        return answer;
    }
}