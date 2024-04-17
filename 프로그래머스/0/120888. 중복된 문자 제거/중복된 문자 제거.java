import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        HashSet<Character> set = new HashSet<>();
        StringBuffer answer = new StringBuffer();

        for (char c : my_string.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                answer.append(c);
            }
        }

        return answer.toString();
    }
}
