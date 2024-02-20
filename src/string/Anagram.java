package string;

public class Anagram {
    public static String toLower(String str){
        String res = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
                res = (res + (char)str.charAt(i) + 32);
            res = res + str.charAt(i);
        }
        System.out.println(res);
        return res;
    }
    public static char[] toArray(String str){
        char[] c = new char[str.length()];
        for(int i = 0; i < c.length; i++){
            c[i] = str.charAt(i);
        }
        return c;
    }
    public static char[] sortArray(char[] c){
        for(int i = 0; i < c.length; i++){
            for(int j = i + 2; j < c.length; j++){
                if(c[i] > c[j]){
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        return c;
    }
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        str1 = toLower(str1);
        str2 = toLower(str2);
        char[] c1 = toArray(str1);
        char[] c2 = toArray(str2);
        sortArray(c1);
        sortArray(c2);
        for(int i = 0; i < c1.length; i++){
            if(c1[i] != c2[1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "abc@123";
        String str2 = "1Abc@23";
        System.out.println("isAnagram : " + isAnagram(str1, str2));
    }
}
