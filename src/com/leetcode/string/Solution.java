package com.leetcode.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class Solution {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {

        int onesCount=0;
        while (n != 0) {
          //  System.out.println(n &= (n - 1));
            n &= (n - 1);
            ++onesCount;
        }
        System.out.println(onesCount);
        return onesCount;

    }


    public static void main(String[] args) {
        //hammingWeight(11);
        try {
            findChar();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void findChar() throws IOException {

        String text = "Gaius Julius Cæsar (12 or 13 July 100 BC - 15 March 44 BC),\n" +
                "was a Roman dictator, politician, military general, and historian \n" +
                "who played a critical role in the events that led to the demise \n" +
                "of the Roman Republic and the rise of the Roman Empire. He also \n" +
                "wrote Latin prose.";

        final BufferedReader br = new BufferedReader(new StringReader(text));

        int lineCount = 0;
//        while ((line = br.readLine()) != null) {
//            if (line.startsWith("//")) {
//                continue;
//            } else if (line.startsWith("/*")) {
//                while (!line.contains("*") && !(line = br.readLine()).endsWith("*/")) ;
//            } else if (!line.trim().isEmpty()) {
//                lineCount++;
//            }
//        }
        String lines[] = text.split("\\r?\\n");
        for (int i = 0; i< lines.length ;) {
            String line = lines[i];
            if (line.startsWith("//")) {
                i++;
                continue;
            } else if (line.startsWith("/*")) {
                int j = i;
                for (; j< lines.length ;j++) {
                    if (line.startsWith("*/")) {
                        break;
                    }
                }
            } else if (!line.trim().isEmpty()) {
                lineCount++;
                i++;
            }
        }

        System.out.println(lineCount);

    }
}