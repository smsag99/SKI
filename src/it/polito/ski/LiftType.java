package it.polito.ski;

public class LiftType {
    private String code, category;
    private int capacity;

    public LiftType(String code, String category, int capacity) {
        this.code = code;
        this.category = category;
        this.capacity = capacity;
    }

    public String getCode() {
        return code;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getCategory() {
        return category;
    }
}
