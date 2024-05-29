package org.example;


import java.util.ArrayList;

public class MainCollection1 {
    public static void main(String[] args) {
        ArrayList<Short> nums = new ArrayList<>();
        nums.add((short)56);
        nums.add((short)23);
        nums.add((short)44);
        nums.add(1, (short)13);
        short num1 = 45;
        nums.add(num1);
        nums.remove(0);
        nums.set(0, (short)1);

        //nums.clear();
        //nums.isEmpty();

        for(int i = 0; i < nums.size();  i++) // for(short num: nums)
            System.out.println(nums.get(i));
            System.out.println("First element is: " + nums.getFirst());

    }

}