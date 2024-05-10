import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            String[] quizArr = quiz[i].split(" ");
            int first = Integer.parseInt(quizArr[0]);
            int second = Integer.parseInt(quizArr[2]);
            int result = Integer.parseInt(quizArr[4]);
            
            if(quizArr[1].equals("-")){
                answer[i] = (first - second == result) ? "O" : "X";
            }else{
                answer[i] = (first + second == result) ? "O" : "X";
            }
        }
        
        return answer;
    }
}