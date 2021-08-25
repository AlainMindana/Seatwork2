package com.activity.two.app;

import com.activity.two.Smartphone;
import com.activity.two.Telephone;

public class SeatworkTwo {

    public static void main(String[] args) {
        Telephone telephone = new Telephone();
//        telephone.call("091222233333");
        Smartphone smartphone = new Smartphone("09111212121", "Android");
        System.out.println("\n");
        smartphone.addContact("Mommy (Globe)", "0921546456546");
        smartphone.addContact("Mommy (Smart)", "0924354565673");
        smartphone.addContact("Mommy (TnT)", "0111111111111");
        smartphone.addContact("Mommy (At&T)", "0222222222222");
        smartphone.addContact("Mommy (Emergency)", "0333333333333");

        System.out.println("\n");
        System.out.println("---------Contact List---------");
        smartphone.displayContacts();
        System.out.println("---------Contact List---------");
        System.out.println("\n");

        smartphone.removeContact("Mommy (Emergency)");

        System.out.println("---------Contact List---------");
        smartphone.displayContacts();
        System.out.println("---------Contact List---------");
        System.out.println("\n");

        smartphone.call("0222222222222");
        System.out.println("\n");
        smartphone.call("Mommy (Globe)", "0921546456546");

//        System.out.println(smartphone.toString());

    }
}
