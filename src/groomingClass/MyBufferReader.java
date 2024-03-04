package gromingClassPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyBufferReader {
    public static void main(String[] args) throws IOException {
        // scanner was introduced from 1.5 version
        // before that programmers used read() and after that BufferReader
//        System.out.print("Give input ");
//        int input = System.in.read(); // read() trows an exception called IOException, and it returns integer value(ascii)
//        System.out.println(input);

//        System.out.print("Give input using bufferReader and read() ");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int input2 = br.read(); // it also returns integer value(ascii) of first letter
//        System.out.println(input2);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter input using bufferReader ");
        String s = br.readLine(); // readLine() always takes input as string, to convert non-primitive to primitive type we need wrapper class
        System.out.println(s);
        System.out.print("Enter integer value ");
        int input3 = Integer.parseInt(br.readLine());
        System.out.println(input3 + "+" + 10 + "=" + (input3 + 10));
    }
}
