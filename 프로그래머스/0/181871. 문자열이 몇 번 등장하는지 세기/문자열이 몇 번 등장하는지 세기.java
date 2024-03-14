class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for (int i=0; i<myString.length();i++) {
            for (int j=i+1;j<=myString.length();j++) {
                String substring = myString.substring(i, j);
                if(substring.equals(pat)) answer++;
            }
        }
        
        return answer;
    }
}