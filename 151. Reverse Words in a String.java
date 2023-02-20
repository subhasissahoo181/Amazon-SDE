class Solution {
    public String reverseWords(String s) {
        Stack<String> str = new Stack<String>();
        String temp="";
        String answer ="";
        // String n = s.length(); 

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                if(temp.length() > 0){
                    str.push(temp);
                    temp="";
                }
                
                
            }
            else{
                    temp += s.charAt(i);

            }
            
        }
        answer = answer+temp;
        while(!str.isEmpty()){
            answer += " " +str.pop();
        }
        if(answer.length() !=0 && answer.charAt(0)== ' '){
            answer=answer.substring(1);
        }
        return answer;
    }
}