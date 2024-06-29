class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] xArr = String.valueOf(x).split("");
        int sum = 0;
        
        for(String a : xArr){
            sum += Integer.parseInt(a);
        }
        
        answer = (x % sum == 0) ? true : false;
        
        return answer;
    }
}