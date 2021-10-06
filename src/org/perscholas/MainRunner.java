package org.perscholas;

import java.beans.VetoableChangeListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainRunner {

    public static void main(String[] args) {
        Vehicle car = new Car("BMW", "gas", 400, 5000,"530I");
        System.out.println("Car HP: " + car.hpCalculate());
         System.out.println(car);
        car.printInformation();
         Vehicle bike = new Motorcycle();


        System.out.println("-----------");

        Vehicle truck = new Truck();
        Vehicle motor = new Car();
        System.out.println(motor.hpCalculate());







    }
}
