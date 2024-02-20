package codingBat;
//Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
//
//        sortaSum(3, 4) → 7
//        sortaSum(9, 4) → 20
//        sortaSum(10, 11) → 21
public class SortaSum {
    public int sortaSum(int a, int b) {
        int sum = a+b;
        if(sum>=10 && sum<=19)
            return 20;
        else
            return sum;
    }

    public static void main(String[] args) {
        SortaSum s1 = new SortaSum();
        System.out.println(s1.sortaSum(10,11));
    }
}
