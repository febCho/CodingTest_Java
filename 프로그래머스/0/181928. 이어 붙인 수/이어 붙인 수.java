class Solution {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";
        
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2 == 1) odd += num_list[i];
            else even += num_list[i];
        }
        
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}