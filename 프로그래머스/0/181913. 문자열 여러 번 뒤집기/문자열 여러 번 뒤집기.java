class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            
            String temp = "";
            
            for(int i=e;i>=s;i--){
                temp += my_string.charAt(i);
            }
            String pre = my_string.substring(0,s);
            String post = my_string.substring(e+1);
            
            my_string = pre + temp + post;
        }
        
        return my_string;
    }
}