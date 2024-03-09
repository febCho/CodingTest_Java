import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> temp = new ArrayList<>();
        int[] copyOfNum_list = {};
        
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        if(n == 1){
            copyOfNum_list = Arrays.copyOfRange(num_list, 0, b + 1);
        }else if(n == 2){
            copyOfNum_list = Arrays.copyOfRange(num_list, a, num_list.length);
        }else if(n == 3){
            copyOfNum_list = Arrays.copyOfRange(num_list, a, b + 1);
        }else{
            for(int i=a;i<=b;i+=c){
                temp.add(num_list[i]);
            }
        }
        
        int[] answer = new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            answer[i] = temp.get(i);
        }
        
        return n == 4 ? answer : copyOfNum_list;
    }
}