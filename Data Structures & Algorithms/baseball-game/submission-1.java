
class Solution {
    public void plus(Stack<Integer> s){
        int ch=s.pop();
        int dh=s.pop();
        int eh= ch+dh;
        s.push(dh);
        s.push(ch);
        s.push(eh);
    }
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                plus(s);
            } else if (operations[i].equals("D")) {
                int gh = s.peek();
                s.push(gh * 2);
            } else if (operations[i].equals("C")) {
                s.pop();
            } else {
                s.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        while (!s.isEmpty()) {
            sum += s.pop();
        }
        return sum;
    }
}