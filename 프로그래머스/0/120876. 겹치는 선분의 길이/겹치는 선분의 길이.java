class Solution {
    public int solution(int[][] lines) {
        int[] lineCount = new int[201];

        for(int[] line : lines){
            int start = line[0] + 100;
            int end = line[1] + 100;
            
            for(int i=start; i<end; i++){
                lineCount[i]++;
            }
        }

        int answer = 0;
        for(int i=0; i<lineCount.length; i++){
            if(lineCount[i] > 1) answer++;
        }

        return answer;
    }
}