package string;

public class MultipleChar {
    public static String result(String s){
        String m = "";
        for(int i = 1; i <s.length(); i++){
            if(s.charAt(i) >=48 && s.charAt(i) <= 57){
                int res = s.charAt(i) - 48;
                m = m + multiply(s.charAt(i-1), res);
            }
            m = m + s.charAt(i);
        }
        return m;
    }
    public static String multiply(char s, int res){
        String r = "";
        for(int i = 1; i <= res; i++){
            r = r + res;
        }
        return r;
    }
    public static void main(String[] args) {
        String s = "a2b4cd2z";
        System.out.println(result(s));
    }
}
