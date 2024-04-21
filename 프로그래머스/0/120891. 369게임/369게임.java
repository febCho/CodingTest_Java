class Solution {
    public int solution(int order) {
        int answer = 0;
        String odrStr = String.valueOf(order);
        
        for(int i=0; i<odrStr.length(); i++){
            String c = String.valueOf(odrStr.charAt(i));
            
            if(c.equals("3") || c.equals("6") || c.equals("9")) answer++;
        }
        
        return answer;
    }
}