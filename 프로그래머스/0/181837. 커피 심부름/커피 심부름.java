class Solution {
    public int solution(String[] order) {
        int latteCnt = 0;
        int ameCnt = 0;
        
        for(int i=0;i<order.length;i++){
            if(order[i].contains("cafelatte")){
                latteCnt++;
            }else{
                ameCnt++;
            }
        }
        
        return (4500 * ameCnt) + (5000 * latteCnt);
    }
}