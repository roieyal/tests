package org.moro.pages;

/**
 * Created by eyal on 08/12/2016.
 */
public class Reference {//java is by Value language
    public static void main(String[] args) {

        int x = 5, y = 5;
        Reference reference = new Reference();
        System.out.println("x is" + x + ", and y is " + y);
        reference.sum(x, y);
        System.out.println("x is" + x + ", and y is " + y);
    }

    public int sum(int x, int y) {
        x = 3;
        y = 4;
        System.out.println("x is" + x + ", and y is " + y);

        return x;
    }

}
