class Solution {
    public int solution(int[][] dots) {
        int maxX = -257;
        int minX = 257;
        int maxY = -257;
        int minY = 257;
        
        for(int i=0; i<dots.length; i++){
            if(maxX < dots[i][0]) maxX = dots[i][0];
            if(minX > dots[i][0]) minX = dots[i][0];
            if(maxY < dots[i][1]) maxY = dots[i][1];
            if(minY > dots[i][1]) minY = dots[i][1];
        }
        
        return (maxX - minX) * (maxY - minY);
    }
}