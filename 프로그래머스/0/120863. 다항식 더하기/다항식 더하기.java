import java.util.Arrays;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        int plusX = 0;
        int plusNum = 0;
        String[] polyArr = polynomial.split(" \\+ ");
        
        for(int i=0; i<polyArr.length; i++){
            if(polyArr[i].contains("x")){
                if(!polyArr[i].equals("x")){
                    plusX += Integer.parseInt(polyArr[i].replace("x", ""));
                }else{
                    plusX += 1;
                }
            }else{
                plusNum += Integer.parseInt(polyArr[i]);
            }
        }
        
        String plusXStr = "";
        if(plusX != 1){
            plusXStr = String.valueOf(plusX) + "x";
        }else{
            plusXStr = "x";
        }
        String plusNumStr = String.valueOf(plusNum);
        
        if(plusX != 0 && plusNum != 0){
            answer = plusXStr + " + " + plusNumStr;
        }else if(plusX == 0 && plusNum != 0){
            answer = plusNumStr;
        }else if(plusX != 0 && plusNum == 0){
            answer = plusXStr;
        }
        
        return answer;
    }
}