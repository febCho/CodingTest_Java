class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] my_stringArr = my_string.split("");
        
        for(int i=0;i<index_list.length;i++){
            answer += my_stringArr[index_list[i]];
        }
        
        return answer;
    }
}