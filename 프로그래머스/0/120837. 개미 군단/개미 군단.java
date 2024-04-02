class Solution {
    public int solution(int hp) {
        int[] antPowers = {5, 3, 1};
        int[] counts = new int[3];

        for (int i = 0; i < 3; i++) {
            counts[i] = hp / antPowers[i];
            hp %= antPowers[i];
        }

        int minAnts = 0;
        for (int count : counts) {
            minAnts += count;
        }
        return minAnts;
    }
}
