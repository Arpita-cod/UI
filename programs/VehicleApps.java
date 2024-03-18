import java.util.*;

class Vehicle {
    private String Model;
    int Rno, sp, Fcap, fcons, dis, fuelneed;

    Vehicle(int rno, int speed, String vmodel, int fcap, int fcon) {
        Rno = rno;
        sp = speed;
        Model = vmodel;
        Fcap = fcap;
        fcons = fcon;
    }

    void distanceConverd(int time) {
        dis = sp / time;
    }

    void fuelNeeded() {
        fuelneed = fcons / dis;
    }

    void show() {
        System.out.println("Vehicle Registration Number Is :" + Rno);
        System.out.println("\nVehicle Speed Number Is : " + sp);
        System.out.println("\nVehicle Model Number Is : " + Model);
        System.out.println("\nVehicle Fuel Capacity Is : " + Fcap);
        System.out.println("\nVehicle Fuel Consumption Is : " + fcons);
        System.out.println("\nVehicle Distance Covered Is : " + dis);
        System.out.println("\nVehicle Fuel Needed Is : " + fuelneed);
    }
}

class Bus extends Vehicle {
    int noofPass;

    Bus(int rno, int speed, String vmodel, int fcap, int fcon, int noofPass) {
        super(rno, speed, vmodel, fcap, fcon);
        this.noofPass = noofPass;
    }

    void show() {
        super.show();
        System.out.println("\nNo Of Passenger Is : " + noofPass);
    }
}

class Truck extends Vehicle {
    int carWeightLimit;

    Truck(int rno, int speed, String vmodel, int fcap, int fcon, int carWeightLimit) {
        super(rno, speed, vmodel, fcap, fcon);
        this.carWeightLimit = carWeightLimit;
    }

    void show() {
        super.show();
        System.out.println("\nCargo Weight Limit Is : " + carWeightLimit);
    }
}

public class VehicleApps {
    public static void main(String[] args) {
        Bus b = new Bus(123, 1200, "abc", 120, 500, 50);
        b.distanceConverd(10);
        b.fuelNeeded();

        System.out.println("\n\nBus Vehicle Details Is :\n\n");
        b.show();

        Truck t = new Truck(890, 1000, "xyz", 2000, 700, 1000);
        t.distanceConverd(20);
        t.fuelNeeded();

        System.out.println("\n\nTruck Vehicle Details Is :\n\n");
        t.show();
    }
}