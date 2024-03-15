class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] strArr = myString.split("");
        
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].equals("A")){
                strArr[i] = "B";
            }else{
                strArr[i] = "A";
            }
        }
        
        myString = String.join("", strArr);
        if(myString.contains(pat)) answer = 1;
        
        return answer;
    }
}