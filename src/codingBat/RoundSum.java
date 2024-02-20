package codingBat;
//For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds
// up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds
// down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate
// helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
//
//
//        roundSum(16, 17, 18) → 60
//        roundSum(12, 13, 14) → 30
//        roundSum(6, 4, 4) → 10
public class RoundSum {
    public int roundSum(int a, int b, int c) {
        // if(a%10>=5)
        //   a=a+(10-a%10);
        // else
        //   a=a-(a%10);
        // if(b%10>=5)
        //   b=b+(10-b%10);
        // else
        //   b=b-(b%10);
        // if(c%10>=5)
        //   c=c+(10-c%10);
        // else
        //   c=c-(c%10);
        // return a+b+c;
        return round10(a)+round10(b)+round10(c);
    }
    public int round10(int n){
        if(n%10>=5)
            return n+(10-n%10);
        else
            return n-(n%10);
    }

    public static void main(String[] args) {
        RoundSum r1 = new RoundSum();
        System.out.println(r1.roundSum(16,17,18));
    }
}
