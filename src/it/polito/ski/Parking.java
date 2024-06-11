package it.polito.ski;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private String name;
    private int slots;
    List<String> lifts = new ArrayList<>();
    private int capacityOfLifts = 0;

    public Parking(String name, int slots) {
        this.name = name;
        this.slots = slots;

    }

    public String getName() {
        return name;
    }

    public int getSlots() {
        return slots;
    }
    public int getCapacityOfLifts() {
        return capacityOfLifts;
    }
    public List<String> getLifts() {
        return lifts;
    }

    public void addLift(String lift,int capacityOfLifts) {
        lifts.add(lift);
        this.capacityOfLifts += capacityOfLifts;
    }
}
