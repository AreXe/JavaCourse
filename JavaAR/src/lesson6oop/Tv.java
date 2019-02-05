package lesson6oop;

import java.util.Objects;

public class Tv {

    private String make;
    private Integer displaySize;

    public Tv() {
    }

    public Tv(String make, Integer displaySize) {
        this.make = make;
        this.displaySize = displaySize;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(Integer displaySize) {
        this.displaySize = displaySize;
    }

    public String description(){
        StringBuilder sb = new StringBuilder();
        sb.append("Tv make: ")
                .append(make)
                .append(", display size: ")
                .append(displaySize)
                .append("inch");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Tv{" +
                "make='" + make + '\'' +
                ", displaySize=" + displaySize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return Objects.equals(make, tv.make) &&
                Objects.equals(displaySize, tv.displaySize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, displaySize);
    }

    /*    public void volumeUp(){
        System.out.println("Volume up");
    }

    public void volumeDown(){
        System.out.println("Volume down");
    }

    public void programUp(){
        System.out.println("Program up");
    }

    public void programDown(){
        System.out.println("Program down");
    }*/
}
