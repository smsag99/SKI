package it.polito.ski;

public class Slope {
    private String name, difficulty, lift;

    public Slope(String name, String difficulty, String lift) {
        this.name = name;
        this.difficulty = difficulty;
        this.lift = lift;
    }

    public String getName() {
        return name;
    }
    
    public String getDificulty() {
        return difficulty;
    }
    
    public String getLift(){
        return lift;
    }
    
}
