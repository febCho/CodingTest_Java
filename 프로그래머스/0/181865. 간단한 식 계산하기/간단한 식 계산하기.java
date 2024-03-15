class Solution {
    public int solution(String binomial) {
        String[] biArr = binomial.split(" ");
        String op = biArr[1];
        
        int a = Integer.parseInt(biArr[0]);
        int b = Integer.parseInt(biArr[2]);
        
        int answer = 0;
        
        if(op.equals("+")) {
            answer = a + b;
        }else if(op.equals("-")) {
            answer = a - b;
        }else{
            answer = a * b;
        }
        
        return answer;
    }
}
