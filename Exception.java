package org.moro.pages;

import java.io.IOException;

/**
 * Created by eyal on 07/12/2016.
 */
public class Exception {
    public static void main(String[] args) {

        try {
            int a=5, b=0;
            double d = a/b;
            System.out.println("ssssss");
        }
        catch (ArithmeticException e){
            System.out.println("shalom");
        }
        catch (NumberFormatException e){
            System.out.println("bye");
        }
        //if both of the catch doesn't contain the exception then it will throw a new one!
        catch (java.lang.Exception e){
            System.out.println("unknown issue"); //catch every exception
            throw e;//will throw the exception again...
        }
        finally {
            //will always happened if defined even if no exception occurred

//            try {
//                Thread.sleep(1000);
//            } catch(InterruptedException ex) {
//                Thread.currentThread().interrupt();
//            }
        }

    }

    public void f() throws IOException {
//        createNewFile();
    }
//    Thread.sleep(1000);

}
