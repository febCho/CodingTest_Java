class Solution {
    public int solution(int balls, int share) {
        if (balls == share || share == 0) {
            return 1;
        }
        
        if (share > balls - share) {
            share = balls - share;
        }
        
        long combi = 1;
        for (int i=0; i<share; i++) {
            combi *= balls - i;
            combi /= i + 1;
        }
        
        return (int) combi;
    }
}
