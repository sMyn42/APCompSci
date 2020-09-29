package base;

import static base.mathexercises.MathEx.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(dayOfWeek(0, 22));
        System.out.println(digitSwapper(1775));
        timeLeft(4, 56, 7, 22);

        int input = 123;
        int output = digitSwapper(input);
        System.out.println(input +" " + output);

        input = 6;
        output = digitSwapper(input);
        System.out.println(input +" " + output);

        input = 381;
        output = digitSwapper(input);
        System.out.println(input +" " + output);

        timeLeft(1,34, 8, 20);
        timeLeft(1,15, 4, 36);

        System.out.println(dayOfWeek(0,1));
        System.out.println(dayOfWeek(0,14));
        System.out.println(dayOfWeek(6, 22));
        System.out.println(dayOfWeek(5, 4));
        System.out.println(dayOfWeek(1,24));
        System.out.println(dayOfWeek(2,1));
    }
}
