class Solution {
    // 최대 공약수(GCD)를 구하는 메서드
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 최소 공배수(LCM)를 구하는 메서드
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        // 최소 공배수(LCM) 계산
        int lcm = lcm(denom1, denom2);

        // 두 분수의 분모를 최소 공배수로 통일하여 분자를 계산
        int newNumer1 = numer1 * (lcm / denom1);
        int newNumer2 = numer2 * (lcm / denom2);

        // 분자를 더하여 기약 분수로 만듦
        int sumNumer = newNumer1 + newNumer2;
        int gcd = gcd(sumNumer, lcm);

        // 기약 분수로 변환
        answer[0] = sumNumer / gcd;
        answer[1] = lcm / gcd;

        return answer;
    }
}
