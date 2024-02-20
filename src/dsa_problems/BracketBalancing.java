package dsa_problems;

public class BracketBalancing {
    static char[] stack;
    static int top = -1;
    public static void push(char ch){
        top++;
        stack[top] = ch;
    }
    public static void pop(){
        top--;
    }
    public static void main(String[] args) {
        String s = ")(())";
        stack = new char[s.length() - 1];
        boolean flag = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                push(s.charAt(i));
            else if (s.charAt(i) == ')' && top != -1)
                pop();
            else{
                flag = false;
                break;
            }
        }
        if(top == -1 && flag == true)
            System.out.println("Brackets is balanced");
        else
            System.out.println("Bracket is unbalanced");
    }
}
