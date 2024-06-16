class Solution {
    public int solution(String A, String B) {
        String newA = A;
        
        for (int i = 1; i < A.length(); i++) {
            newA = newA.charAt(newA.length() - 1) + newA.substring(0, newA.length() - 1);
            if (newA.equals(B)) {
                return i;
            }
        }
        return (A.equals(B)) ? 0 : -1;
    }
}