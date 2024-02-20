package GFG;

public class RemoveVowel {
    static String removeVowels(String S) {
        // code here
        String res = "";

        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) == 'o' || S.charAt(i) == 'u'){
                continue;
            } else{
                res = res + S.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(removeVowels("hello"));
    }
}
