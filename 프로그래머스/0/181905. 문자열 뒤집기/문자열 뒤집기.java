class Solution {
    public String solution(String my_string, int s, int e) {
        String pro = "";
        
        for(int i=e;i>=s;i--){
            pro += my_string.charAt(i);
        }
        
        return my_string.substring(0,s) + pro + my_string.substring(e+1,my_string.length());
    }
}