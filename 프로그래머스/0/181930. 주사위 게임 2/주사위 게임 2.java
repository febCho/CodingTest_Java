class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        int add = a + b + c;
        int squared = (a*a) + (b*b) + (c*c);
        int cubed = (a*a*a) + (b*b*b) + (c*c*c);
        
        if(a != b && b != c && a != c){
            answer = add;
        }else if(a == b && b == c && a == c){
            answer = add * squared * cubed;
        }else{
            answer = add * squared;
        }
        
        return answer;
    }
}