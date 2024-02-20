package codingBat;
//Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
//
//        answerCell(false, false, false) → true
//        answerCell(false, false, true) → false
//        answerCell(true, false, false) → false
public class AnswerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep || isMorning && !isMom)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        AnswerCell a1 = new AnswerCell();
        System.out.println(a1.answerCell(false, false, true));
    }
}
