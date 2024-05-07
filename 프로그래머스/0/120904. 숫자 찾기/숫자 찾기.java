class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] numArr = String.valueOf(num).split("");
        
        for(int i=0; i<numArr.length; i++){
            if(numArr[i].equals(String.valueOf(k))){
                answer = i+1;
                break;
            }else{
                answer = -1;
            }
        }
        
        return answer;
    }
}