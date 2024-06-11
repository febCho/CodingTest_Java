class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupons = chicken;

        while (coupons >= 10) {
            int serviceChicken = coupons / 10;
            answer += serviceChicken;
            
            coupons = (coupons % 10) + serviceChicken;
        }

        return answer;
    }
}
