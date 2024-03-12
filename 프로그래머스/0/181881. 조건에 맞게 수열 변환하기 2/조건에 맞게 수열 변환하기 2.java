import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] newArr = Arrays.copyOf(arr, arr.length);
        
        while(true){  
            for(int i=0;i<arr.length -1;i++){
                if(arr[i]%2 == 0 && arr[i] >= 50){
                    arr[i] /= 2;
                }else if(arr[i]%2 == 1 && arr[i] < 50){
                    arr[i] = (arr[i] * 2) + 1;
                }
            }
            
            if(Arrays.equals(arr, newArr)){
                break;
            }
            
            newArr = Arrays.copyOf(arr, arr.length);
            answer++;
        }
        
        return answer;
    }
}