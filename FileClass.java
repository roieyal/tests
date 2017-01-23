package org.moro.pages;

import java.io.*;

/**
 * Created by eyal on 08/12/2016.
 */
public class FileClass {

    /*FileOutputStream opens file for writing FileInputStream opens file for reading
    * we don't work straight with that flows we work with BufferedWriter and reader that works with that.
    * in order to write something other then just strings like ints or other data we need to use DataOutputStream/input. */

    File f;

//    public void writeToFile(File f) throws IOException{
//        FileWriter fw = new FileWriter(f);
//        fw.write("Hello");
//        fw.write("\n");
//        fw.write("Bye");
//        fw.close();
//
//    }

    public void writeToFile(File f) throws IOException{
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hello");
        bw.write("bye");
        bw.close();

    }

    public String readFromFile(File f)throws IOException{

        FileReader fr = new FileReader(f);
        int size = (int)f.length();
        char[]data = new char[size];
        fr.read(data);
        return new String(data);
    }

    public void writeData(File f)throws IOException{
        FileOutputStream fo = new FileOutputStream(f);
        DataOutputStream out = new DataOutputStream(fo);
        String[]prods = {"Bread" , "Milk" , "Onions"};
        double[]prices = {4.5, 5.3, 1.78};
        for(int i = 0; i < prods.length;i++){
            out.writeInt(i + 1);
            out.writeUTF(prods[i]);
            out.writeDouble(prices[i]);

        }
    }
}
