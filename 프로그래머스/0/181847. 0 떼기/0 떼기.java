class Solution {
    public String solution(String n_str) {
        String[] n_strArr = n_str.split("");
        int idx = 0;
        
        for(int i=0;i<n_strArr.length;i++){
            if(!n_strArr[i].equals("0")){
                idx = i;
                break;
            }
        }
        
        String answer = n_str.substring(idx, n_str.length());
        return answer;
    }
}