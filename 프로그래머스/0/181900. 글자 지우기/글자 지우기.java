class Solution {
    public String solution(String my_string, int[] indices) {
        String[] strArr = my_string.split("");
        
        for(int idx : indices){
            strArr[idx] = "";
        }
        
        String answer = "";
        for(int i=0;i<strArr.length;i++){
            if(!"".equals(strArr[i])) answer += strArr[i];
        }
        
        return answer;
    }
}