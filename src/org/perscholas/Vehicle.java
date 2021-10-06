package org.perscholas;

import java.math.BigDecimal;
import java.util.Locale;

public abstract class Vehicle {
    // One Horsepower is defined as 33,000 lb-ft/minute. The circumference of a one-foot radius circle is 6.2832 feet. Since these are both constants, you can divide 33,000 by 6.2832 to get 5252, reducing the equation to a very simple approximation.
     private final int RPM_FOR_EQUATION = 5252;
     private String name;
     private String engineType;
     private int torqueLbFt;
     private int rpm;


    public Vehicle() {
        this("test", "gas", 400, 5000);
        System.out.println("vehicle constructor");
    }

    public Vehicle(String name, String engineType, int torqueLbFt, int rpm) {
        this.name = name.toUpperCase();
        this.engineType = engineType.toUpperCase();
        this.torqueLbFt = torqueLbFt;
        this.rpm = rpm;
        System.out.println("vehicle constructor with fields");
    }

    // formula: Horsepower = Torque x RPM / 5,252
    public int hpCalculate(){
        if(!this.engineType.equalsIgnoreCase("gas".strip())) return -1;
        return ((Math.multiplyExact(rpm,torqueLbFt))/RPM_FOR_EQUATION);
    }
    // formula cost per unit: (Total fixed costs + Total variable costs) ÷ Total units produced
    public BigDecimal costPerUnit(BigDecimal totalFixedCost, BigDecimal totalVariableCost, BigDecimal totalUnitsProduced){
        return (totalFixedCost.add(totalVariableCost)).divide(totalUnitsProduced);
    }

    public abstract void printInformation();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", engineType='" + engineType + '\'' +
                ", torqueLbFt=" + torqueLbFt +
                ", rpm=" + rpm ;
    }



    public int getRPM_FOR_EQUATION() {
        return RPM_FOR_EQUATION;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getTorqueLbFt() {
        return torqueLbFt;
    }

    public void setTorqueLbFt(int torqueLbFt) {
        this.torqueLbFt = torqueLbFt;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
}
