package org.oop;

public class Main {

    public Main() {}
    public static void main(String[] args) {
        Transport bmw = new Transport();
//        bmw.speed = 200.5f;
//        bmw.weight = 2000;
//        bmw.color = "Black";
//        bmw.coordinates = new byte[] {0, 0, 0};
        bmw.setValues(200.5f, 2000, "Black", new byte[] {0, 0, 0});

        Transport truck = new Transport();
        truck.speed = 130f;
        truck.weight = 5000;
        truck.color = "White";
        truck.coordinates = new byte[] {0, 100, 0};

        System.out.println(bmw.getValues());
        System.out.println(truck.getValues());


    }
}
