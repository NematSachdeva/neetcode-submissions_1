class Solution {
    public boolean isValid(String s) {
        if(s.length()==0){
            return true;
        }
        Stack <Character> chr=new Stack<>();
        for(int i=0;i<s.length();i++){
            char chrr=s.charAt(i);
            if(chrr=='('||chrr=='{'||chrr=='['){
                chr.push(chrr);
            }else{
                if(chr.isEmpty()){
                    return false;
                }
                if(chrr==')'&&chr.peek()=='(' || chrr=='}'&&chr.peek()=='{' || chrr==']'&& chr.peek()=='['){
                    chr.pop();
                }
                else{
                    return false;
                }
            }

        }
        if(chr.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
