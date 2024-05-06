class Solution {
    public int solution(String my_string) {
        String[] my_stringArr = my_string.split(" ");
        int result = Integer.parseInt(my_stringArr[0]);

        for(int i = 1; i < my_stringArr.length; i += 2) {
            String operator = my_stringArr[i];
            int operand = Integer.parseInt(my_stringArr[i + 1]);

            if(operator.equals("+")) {
                result += operand;
            }else if(operator.equals("-")) {
                result -= operand;
            }
        }

        return result;
    }
}
