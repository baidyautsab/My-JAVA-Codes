package codingBat;
//We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each).
// Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done
// without any loops. See also: Introduction to MakeBricks
//
//        makeBricks(3, 1, 8) → true
//        makeBricks(3, 1, 9) → false
//        makeBricks(3, 2, 10) → true
public class MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        if(small+5*big<goal)
            return false;
        else if(goal%5>small)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        MakeBricks m1 = new MakeBricks();
        System.out.println(m1.makeBricks(3,1,8));
    }
}
