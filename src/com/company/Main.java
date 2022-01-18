package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;


public class Main {
    private static OptionalDataException mass;
    private static int a;

    public static void main(String[] args) throws IOException {

        String path = "mass.txt";
        File file = new File(path);

        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File created");
        }

        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int[] nums = new int[42];

        int cout = 0;
        String str;
        while ((str = bufferedReader.readLine()) != null){
            nums[cout] = Integer.parseInt(str);
            cout++;
        }
        int min = nums[0] + 1;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
            System.out.println(min);


    }
}








