package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MainArray {
    public static void main(String[] args) {
        int[] nums1 = new int[5];
        nums1[0] = 500;
        nums1[1] = 500;
        nums1[2] = 500;
        nums1[3] = 100;
        nums1[4] = 500;
        System.out.println(nums1[0]);
        System.out.println(nums1[3]);

        byte[] nums2 = {6, 7, 3, 5, 3, -1};
        System.out.println(nums2[2]);

        short[] nums3 = {5, 6, 2, 9, 0};
        for (int i = 0; i < nums3.length; i++)
            System.out.println(nums3[i]);

        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        int user_num = scan.nextInt();

        short[] nums4 = new short[user_num];
        for (int a = 0; a < user_num; a++) {
            System.out.println("Enter element " + (a + 1) + ": ");
            nums4[a] = scan.nextShort();

        }
            short max_num = nums4[0];
            for (int a = 0; a < user_num; a++) {
                if (nums4[a] > max_num)
                    max_num = nums4[a];
            }
            System.out.println("Max element: " + max_num);

            short min_num = nums4[0];
            for (int a = 0; a < user_num; a++) {
            if (nums4[a] < min_num)
                min_num = nums4[a];
        }
        System.out.println("Min element: " + min_num);

            for (int a = 0; a < nums4.length; a++)
                System.out.println(nums4[a]);


        }
    }

