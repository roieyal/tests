package org.moro.pages;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Solution2{

    private Set<Integer> digits = new HashSet<>();

    public int solution(String S, String T) {
        Integer startHour = Integer.parseInt(S.substring(0, 2));
        Integer startMinute = Integer.parseInt(S.substring(3, 5));
        Integer startSecond = Integer.parseInt(S.substring(6, 8));

        Integer endHour = Integer.parseInt(T.substring(0, 2));
        Integer endMinute = Integer.parseInt(T.substring(3, 5));
        Integer endSecond = Integer.parseInt(T.substring(6, 8));

        Integer counter = 0;

        boolean reachedEndTime = false;
        while (!reachedEndTime) {
            if (checkIfInteresting(startHour, startMinute, startSecond)) {
                System.out.println(startHour + ":" + startMinute + ":" + startSecond);
                counter++;
            }

            if (checkIfReachedEndTime(startHour, startMinute, startSecond, endHour, endMinute, endSecond)) {
                reachedEndTime = true;
            }
            if (++startSecond == 60) {
                if (++startMinute == 60) {
                    startHour++;
                }
            }
        }

        return counter;
    }

    private boolean checkIfReachedEndTime(Integer startHour, Integer startMinute, Integer startSecond,
                                          Integer endHour, Integer endMinute, Integer endSecond) {
        return startHour.equals(endHour) && startMinute.equals(endMinute) && startSecond.equals(endSecond);
    }

    public boolean checkIfInteresting(int hours, int minutes, int seconds) {
        addDigitsToCollection(digits, hours, minutes, seconds);
        boolean isInteresting = digits.size() <= 2;
        digits.clear();
        return isInteresting;
    }

    public void addDigitsToCollection(Collection<Integer> collection, Integer... timeParts) {
        for (Integer timePart : timeParts) {
            collection.add(timePart / 10);
            collection.add(timePart % 10);
        }
    }
}
