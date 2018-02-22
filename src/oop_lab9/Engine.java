package oop_lab9;

public class Engine {
    private String size;
    private System type;

    public Engine(String size, System type) {
        this.size = size;
        this.type = type;
    }

    public Engine(String size, String s) {
    }

    @Override
    public String toString() {
        return "Engine{" +
                "size='" + size + '\'' +
                ", type=" + type +
                '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public System getType() {
        return type;
    }

    public void setType(System type) {
        this.type = type;
    }
}//class
