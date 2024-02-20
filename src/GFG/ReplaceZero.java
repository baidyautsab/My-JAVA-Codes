package GFG;

public class ReplaceZero {
    public static int convertFive(int n){
        //add code here.
        String s = "" + n;
        String res = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0')
                res = res + "5";
            else
                res = res + s.charAt(i);
        }
        return Integer.parseInt(res);
    }
    public static void main(String[] args) {
        System.out.println(convertFive(120002));
    }
}
