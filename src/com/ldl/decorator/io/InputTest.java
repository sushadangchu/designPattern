package com.ldl.decorator.io;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

/**
 * @Author ldl
 * @Date 2021/5/14 18:28
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream("src/com/ldl/decorator/io/test.txt")));

        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
