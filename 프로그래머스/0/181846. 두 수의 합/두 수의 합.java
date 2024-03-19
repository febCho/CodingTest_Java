import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        try{
            answer = String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
        }catch(NumberFormatException e){
            BigInteger Biga = new BigInteger(a);
            BigInteger Bigb = new BigInteger(b);
            
            answer = (Biga.add(Bigb)).toString();
        }
        
        return answer;
    }
}