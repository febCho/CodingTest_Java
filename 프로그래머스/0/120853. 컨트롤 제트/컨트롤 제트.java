class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] sArr = s.split(" ");
        for(int i=0; i<sArr.length; i++){
            if(!sArr[i].equals("Z")){
                answer += Integer.parseInt(sArr[i]);
            }else{
                answer -= Integer.parseInt(sArr[i-1]);
            }
        }
        
        return answer;
    }
}