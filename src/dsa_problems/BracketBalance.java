package dsa_problems;

import java.util.Stack;

public class BracketBalance {
    public static boolean check(String x){
        Stack<Character> stack = new Stack<>();
        boolean flag = true;

        for(int i = 0; i < x.length(); i++){
            if(x.charAt(i) == '(' || x.charAt(i) == '{' || x.charAt(i) == '[')
                stack.push(x.charAt(i));
            else if(stack.size() != 0){
                if(x.charAt(i) == ')' || x.charAt(i) == '}' || x.charAt(i) == ']'){
                    char ch = stack.pop();
//                    to compare the sequence
                    if((ch == '(' && x.charAt(i) != ')') || (ch == '{' && x.charAt(i) != '}') || (ch == '[' && x.charAt(i) != ']'))
                        return false;
                }
            } else
                flag = false;
        }
        if(stack.size() == 0 && flag == true)
            return true;
        return false;
    }
    public static void main(String[] args) {
        String str = ")";
        System.out.println(str + " is balanced : " + check(str));
    }
}
