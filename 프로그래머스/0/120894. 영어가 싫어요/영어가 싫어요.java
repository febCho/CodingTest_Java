class Solution {
    public long solution(String numbers) {
        String[] numbersArr = numbers.split("");
        StringBuffer n = new StringBuffer();
        StringBuffer num = new StringBuffer();
        
        for(int i=0; i<numbersArr.length; i++){
            n.append(numbersArr[i]);
            
            if(n.toString().equals("zero")){
                num.append("0");
                n.setLength(0);
            }else if(n.toString().equals("one")){
                num.append("1");
                n.setLength(0);
            }else if(n.toString().equals("two")){
                num.append("2");
                n.setLength(0);
            }else if(n.toString().equals("three")){
                num.append("3");
                n.setLength(0);
            }else if(n.toString().equals("four")){
                num.append("4");
                n.setLength(0);
            }else if(n.toString().equals("five")){
                num.append("5");
                n.setLength(0);
            }else if(n.toString().equals("six")){
                num.append("6");
                n.setLength(0);
            }else if(n.toString().equals("seven")){
                num.append("7");
                n.setLength(0);
            }else if(n.toString().equals("eight")){
                num.append("8");
                n.setLength(0);
            }else if(n.toString().equals("nine")){
                num.append("9");
                n.setLength(0);
            }
        }

        return Long.parseLong(num.toString());
    }
}