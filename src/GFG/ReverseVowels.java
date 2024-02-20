package GFG;

public class ReverseVowels {
        static String modify (String s)
        {
            // your code here
            java.util.ArrayList<Character> al = new java.util.ArrayList<>();

            for(int i = s.length() - 1; i >= 0; i--){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                    al.add(s.charAt(i));
                }
            }

            String res = "";
            int index = 0;

            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                    res = res + al.get(index);
                    index++;
                } else{
                    res = res + s.charAt(i);
                }
            }

            return res;
        }

    public static void main(String[] args) {
        System.out.println(modify("hello"));
    }
}
