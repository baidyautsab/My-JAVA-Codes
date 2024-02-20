package codingBat;
//Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced,
// so the difference between small and medium is the same as the difference between medium and large.
//
//
//        evenlySpaced(2, 4, 6) → true
//        evenlySpaced(4, 6, 2) → true
//        evenlySpaced(4, 6, 3) → false
public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        if(a==b && a==c)
            return true;
        else if(a==b || a==c || b==c)
            return false;
        else if(Math.abs(a-b)==Math.abs(a-c))
            return true;
        else if(Math.abs(a-c)==Math.abs(c-b))
            return true;
        else if(Math.abs(a-b)==Math.abs(c-b))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        EvenlySpaced e1 = new EvenlySpaced();
        System.out.println(e1.evenlySpaced(4,6,2));
    }
}
