package main;

import java.io.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException {

        BufferedReader sysIn = new BufferedReader(new InputStreamReader(System.in));
        String currentLine = null;
        try {
            currentLine = sysIn.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] arg = new String[0];
        while (!(currentLine == null)) {
            arg = currentLine.split("\t");
        }

        DataSorter DS = new DataSorter(arg);
    }
}

